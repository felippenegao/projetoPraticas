package br.edu.ifpb.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
 @Id
 @GeneratedValue(strategy = GenerationType.SEQUENCE)
 private Integer id;
 @Column(nullable = false, unique = true, length = 30)   
 private String matricula;
 @Column(nullable = false, length = 80)   
 private String nome;
 @Column(nullable = false, length = 80)   
 private String cpf;
 @Column(nullable = false, length = 80)   
 private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
