package br.edu.ifpb.beans;

import br.edu.ifpb.Controle;
import br.edu.ifpb.entidades.Professor;
import java.io.IOException;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import sun.misc.Request;

/**
 *
 * @author carlos
 */
@ManagedBean(name = "professorBean")
public class ProfessorBean {
    Professor professor = new Professor();
    private String matricula;
    private String nome;
    private String telefone;
    private String cpf;
    
    @EJB
    Controle<Professor> controle;

    public void salvar() throws IOException{
        controle.cadastrar(professor);
        FacesContext.getCurrentInstance().getExternalContext().redirect("cadastroprofessor.xhtml");
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
}
