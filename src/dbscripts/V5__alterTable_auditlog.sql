-- Excluindo a tabela e trigger

drop table audit_log;
drop function audit_trigger cascade;

-- Recriando

CREATE TABLE audit_log (
    logid serial primary key, -- recorded id number of the change
    id_usuario integer, -- who did the change
    event_time_utc timestamp, -- when the event was recorded
    table_name text, -- contains schema-qualified table name
    operation text, -- INSERT, UPDATE, DELETE or TRUNCATE
    before_value json, -- the OLD tuple value
    after_value json, -- the NEW tuple value
    constraint FK_audit_log foreign key (id_usuario) references usuario
);

CREATE OR REPLACE FUNCTION audit_trigger() 
  RETURNS trigger AS $$ 
DECLARE 
    old_row json := NULL; 
    new_row json := NULL; 
BEGIN 
    IF TG_OP IN ('UPDATE','DELETE') THEN 
        old_row = row_to_json(OLD); 
    END IF; 
    IF TG_OP IN ('INSERT','UPDATE') THEN 
        new_row = row_to_json(NEW); 
    END IF; 
    INSERT INTO  audit_log(
        logid, 
        id_usuario, 
        event_time_utc, 
        table_name, 
        operation, 
        before_value, 
        after_value 
    ) VALUES (
        default,
        NEW.id_usuario_cadastro, 
        current_timestamp AT TIME ZONE 'UTC', 
        TG_TABLE_SCHEMA ||  '.' || TG_TABLE_NAME, 
        TG_OP, 
        old_row, 
        new_row 
    ); 
    RETURN NEW; 
END; 
$$ LANGUAGE plpgsql;

-- Tabelas auditadas

CREATE TRIGGER audit_cidade 
  AFTER INSERT OR UPDATE OR DELETE 
  ON cidade 
  FOR EACH ROW 
EXECUTE PROCEDURE audit_trigger();

CREATE TRIGGER audit_funcionario
  AFTER INSERT OR UPDATE OR DELETE 
  ON funcionario 
  FOR EACH ROW 
EXECUTE PROCEDURE audit_trigger();

CREATE TRIGGER audit_produto 
  AFTER INSERT OR UPDATE OR DELETE 
  ON produto 
  FOR EACH ROW 
EXECUTE PROCEDURE audit_trigger();

CREATE TRIGGER audit_tipo_produto
  AFTER INSERT OR UPDATE OR DELETE 
  ON tipo_produto 
  FOR EACH ROW 
EXECUTE PROCEDURE audit_trigger();
