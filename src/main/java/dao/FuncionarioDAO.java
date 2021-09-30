package dao;

import apoio.ConexaoBD;
import entidade.Funcionario;
import java.util.ArrayList;
import apoio.IDAOT;
import apoio.ConvertPasswordToMD5;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.Statement;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class FuncionarioDAO implements IDAOT <Funcionario> {
    private ResultSet resultadoQ = null;
    @Override
    public boolean salvar(Funcionario o) {
         try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
         
            String sql = "";
            if (o.getId() == 0) {
                sql = "INSERT INTO funcionario VALUES ( "
                        + "default, " 
                        + "'" + o.getNome() + "', "
                        + "'" + o.getCpf() + "', "
                        + "'" + o.getTelefone() + "', "
                        + "'" + o.getEmail() + "'"
                        + ")";
            } else {
                sql = "UPDATE funcionario "
                        + "SET nome = '" + o.getNome() + "' "
                        + ",cpf = '" + o.getCpf() + "' "
                        + ",telefone = '" + o.getTelefone() + "' "
                        + ",email = '" + o.getEmail() + "' "
                        + "WHERE id = " + o.getId();
            }/*
                sql = "INSERT INTO funcionario  (id, nome, email, usuario, senha, cpf) VALUES ('"
                         + "default, " + "','" + o.getNome() + "','" + o.getEmail()+"','" + o.getUsuario()+"','" + senhaMd5+"','" + o.getCpf()+"')";
            }*/

            System.out.println("SQL: " + sql);

            int resultadoQ = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro salvar inserção = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Funcionario o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
         
            String sql = "";
            if (o.getId() == 0) {
                sql = "UPDATE funcionario "
                        + "SET nome = '" + o.getNome() + "' "
                        + ",cpf = '" + o.getCpf() + "' "
                        + ",telefone = '" + o.getTelefone() + "' "
                        + ",email = '" + o.getEmail() + "' "
                        + "WHERE id = " + o.getId();
            } else {
                sql = "INSERT INTO funcionario VALUES ( "
                        + "default, " 
                        + "'" + o.getNome() + "', "
                        + "'" + o.getCpf() + "', "
                        + "'" + o.getTelefone() + "', "
                        + "'" + o.getEmail() + "'"
                        + ")";
            }
                        System.out.println("SQL: " + sql);

            int resultadoQ = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro atualizar inserção = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
       try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM funcionario "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            // executa consulta - exclusao
            int resultadoQ = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return false;
        }
    }

    @Override
    public ArrayList<Funcionario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Funcionario> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario consultarId(int id) {
       Funcionario funcionario = null; //= new Apresentacao();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM funcionario "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            // executa consulta
            resultadoQ = st.executeQuery(sql);

            // avanca ResultSet
            if (resultadoQ.next()) {
                funcionario = new Funcionario();

                // obtem dados do RS
                funcionario.setId(resultadoQ.getInt("id"));
                funcionario.setNome(resultadoQ.getString("nome"));
                funcionario.setCpf(resultadoQ.getString("cpf"));
                funcionario.setTelefone(resultadoQ.getString("telefone"));
                funcionario.setEmail(resultadoQ.getString("email"));               
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return funcionario;
    }
     public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "id";
        cabecalho[1] = "nome";
        cabecalho[2] = "cpf";
        cabecalho[3] = "telefone";
        cabecalho[4] = "email";
        

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM funcionario "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][5];

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM funcionario "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%'");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cpf");
                dadosTabela[lin][3] = resultadoQ.getString("telefone");
                dadosTabela[lin][4] = resultadoQ.getString("email");
             
                      

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
        /*tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.GREEN);
                } else {
                    setBackground(Color.LIGHT_GRAY);
                }
                return this;
            }
        });*/
    }
    
    
    
}
