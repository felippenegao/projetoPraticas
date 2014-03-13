/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.servlets;

import br.edu.ifpb.Controle;
import br.edu.ifpb.entidades.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
public class CadastroAluno extends HttpServlet {

    @EJB(name = "teste")
    Controle<Aluno> controle;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Aluno a = new Aluno();


        a.setNome(request.getParameter("nome"));
        a.setMatricula(request.getParameter("matricula"));
        a.setEmail(request.getParameter("email"));
        a.getEndereco().setBairro(request.getParameter("bairro"));
        a.getEndereco().setRua(request.getParameter("rua"));
        a.getEndereco().setCidade(request.getParameter("cidade"));
        a.getEndereco().setEstado(request.getParameter("estado"));
        a.getEndereco().setCep(request.getParameter("cep"));
        a.setLogin(request.getParameter("login"));
        a.setSenha(request.getParameter("senha"));

        controle.cadastrar(a);




        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Patua+One'>\n"
                    + "        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400'>\n"
                    + "        <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">");
            out.println("<title>Servlet CadastroAluno</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cadastrado com Sucesso</h1>");
            out.println("<a href=\"index.jsp\">Voltar");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
