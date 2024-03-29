/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Usuario;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gui
 */
public class UsuarioDAO extends Dao<Usuario> {

    public Usuario findById(int id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction transacao = sessao.beginTransaction();
            Usuario retorno = (Usuario) sessao.get(Usuario.class, id);
            return retorno;
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
        return null;
    }
    // TEM ERRO
        public Usuario findByLogin(String criteria) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Usuario usuario = null;
        try {
            org.hibernate.Query q = sessao.createQuery("from Usuario where login = '" + criteria +"'");
                    //.setParameter("criter", criteria);
            System.out.println("PASSOU - 1");
            usuario = (Usuario) q.uniqueResult();//pega um usuário único (resultado único)
            System.out.println("PASSOU - 2 - Retorno");
            return usuario;
        } catch (HibernateException hibEx) {
            System.out.println("ERROR");
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
        return null;
    }

    public List<Usuario> findAllByDescription(String criteria) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Usuario> usuarios = null;
        try {
            org.hibernate.Query q = sessao.createQuery("from usuario p WHERE login LIKE '%" + criteria + "%' AND situacao = 'A' ORDER BY login");
            usuarios = q.list();
            return usuarios;
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
        return null;
    }

    public List<Usuario> findAll() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Usuario> usuarios = null;
        try {
            org.hibernate.Query q = sessao.createQuery("from Usuario p WHERE situacao = 'A' ORDER BY login");
            usuarios = q.list();
            return usuarios;
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
        return null;
    }
}
