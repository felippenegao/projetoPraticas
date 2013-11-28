/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb;

import br.edu.ifpb.entidades.Aluno;
import br.edu.ifpb.entidades.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carlos
 */
@Stateless
public class Controle {
    
    @PersistenceContext(unitName = "Praticas-PU")
    private EntityManager manager;
    private Pessoa pessoa;
    
    public void cadastraPessoa(PessoaTeste p) {
        
        manager.persist(p);
        
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void cadastroAluno(Aluno a) {
        manager.persist(a);
    }
    
    public void autentica(String login, String senha){
        Query q = manager.createQuery("select p from Pessoa p where p.login = :login and p.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
        pessoa = (Pessoa) q.getSingleResult();
    }
    
    public void remove(Aluno a) {
        manager.remove(a);
    }
}
