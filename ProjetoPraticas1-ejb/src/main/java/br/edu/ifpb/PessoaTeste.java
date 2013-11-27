package br.edu.ifpb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author carlos
 */
@Entity
public class PessoaTeste implements Serializable {
    
    @Id
    private Integer id;
    
    @Column(nullable = false)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
}
