package br.edu.ifpb.filtros;

import br.edu.ifpb.entidades.Pessoa;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author carlos
 */
public class FiltroLogin implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpSession s = ((HttpServletRequest)request).getSession();
        
        Pessoa pessoa = (Pessoa) s.getAttribute("usuario");
        if (pessoa == null){
            ((HttpServletResponse)response).sendRedirect("../index.jsp");
        }
        else{
            chain.doFilter(request, response);
        }
        
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
