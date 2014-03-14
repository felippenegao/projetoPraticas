package br.edu.ifpb.beans;

import br.edu.ifpb.Controle;
import br.edu.ifpb.entidades.Professor;
import java.io.IOException;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author carlos
 */
@ManagedBean(name = "professorBean")
@ViewScoped
public class ProfessorBean {

    Professor professor = new Professor();
    private String matricula;
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    
    @EJB
    private Controle<Professor> controle;

    public String salvar() throws IOException {
        controle.cadastrar(professor);
        FacesContext.getCurrentInstance().getExternalContext().redirect("cadastroprofessor.xhtml");
        return "sucessoCadastro";
    }

    public void setMatricula(String matricula) {
        professor.setMatricula(matricula);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        professor.setNome(nome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        professor.setCpf(cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(String telefone) {
        professor.setTelefone(telefone);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        professor.setEmail(telefone);
        this.email = email;
    }
}
