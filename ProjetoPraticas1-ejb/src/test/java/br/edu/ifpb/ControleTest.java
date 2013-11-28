package br.edu.ifpb;

import br.edu.ifpb.entidades.Aluno;
import br.edu.ifpb.entidades.Endereco;
import br.edu.ifpb.entidades.Telefone;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author carlos
 */
public class ControleTest extends TestCase {

    @Test
    public void testAlunoNome() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("Felippe", aluno.getNome());
    }

    @Test
    public void testAlunoEmail() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("felippe@gmail.com", aluno.getEmail());
    }

    @Test
    public void testAlunoMatricula() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("123456", aluno.getMatricula());
    }

    @Test
    public void testAlunoEnderecoRua() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("Rua A", endereco.getRua());
    }

    @Test
    public void testAlunoEnderecoBairro() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("Centro", endereco.getBairro());
    }

    @Test
    public void testAlunoTelefoneCodigo() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("83", telefone.getCodigoTelefone());
    }

    @Test
    public void testAlunoTelefoneNumero() {
        Aluno aluno = new Aluno();
        aluno.setEmail("felippe@gmail.com");
        aluno.setMatricula("123456");
        aluno.setNome("Felippe");
        Endereco endereco = new Endereco("Rua A", "Centro", "Sousa", "PB", "58800");
        aluno.setEndereco(endereco);
        Telefone telefone = new Telefone("83", "99992222");
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);
        aluno.setTelefones(telefones);
        assertEquals("99992222", telefone.getNumero());
    }
}