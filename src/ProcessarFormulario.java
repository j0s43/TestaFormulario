

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessarFormulario
 */
@WebServlet("/processar")
public class ProcessarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessarFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recupera os Parametro
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		int dataDeNascimento = Integer.parseInt(request.getParameter("dataDeNascimento"));
		
		//Concatenar as strings
		String nomeCompleto = nome + " " + sobrenome;
		
		//Concatenar o int
		int idade = dataDeNascimento;
		
		int a = dataDeNascimento ;
		int b = 2018;
		idade = b - a;
		
		//Prepara a resposta ao Usuario
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Resposta</title></head>");
		out.println("<body><h1>Seu nome completo é: " + nomeCompleto);
		out.println("<h1>Sua idade é: " + idade);
		out.println("</h1></body></html>");
	}

}
