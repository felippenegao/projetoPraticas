package br.edu.ifpb.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name="codigoTelefone")
    private String codigoTelefone;
    
    @Column(name="numero")
    private String numero;
    
    public Integer getId() {
        return id;
    }

    public Telefone() {
    }

    public Telefone(String codigoTelefone, String numero) {
        this.codigoTelefone = codigoTelefone;
        this.numero = numero;
    }   

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoTelefone() {
        return codigoTelefone;
    }

    public void setCodigoTelefone(String codigoTelefone) {
        this.codigoTelefone = codigoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }   
    
}
