package br.edu.ifpb.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();
    @JoinColumn(name = "endereco_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Pessoa() {
        endereco = new Endereco();
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

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
