/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb;

import br.edu.ifpb.entidades.Aluno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class Controle {

    @PersistenceContext(unitName = "Praticas-PU")
    private EntityManager manager;
    
    
    
    public void cadastraPessoa(PessoaTeste p) {
        
        manager.persist(p);
        
    }

    
    
    public void cadastroAluno(Aluno a) {
        manager.persist(a);
    }

}
