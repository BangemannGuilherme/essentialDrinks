/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import Utils.Calendario;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Gui
 */
@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    private Integer id_fornecedor;
    @Column(name = "razaosocial")
    private String razaosocial;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "situacao")
    private Character situacao;
    @JoinColumn(name = "id_entidade", referencedColumnName = "id_entidade")
    @OneToOne
    private Entidade id_entidade;    

    public Integer getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Integer id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getRazaoSocial() {
        return razaosocial;
    }

    public void setRazaoSocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Entidade getId_entidade() {
        return id_entidade;
    }

    public void setId_entidade(Entidade id_entidade) {
        this.id_entidade = id_entidade;
    }
    
}