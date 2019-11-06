package cr.tec.poo.ejemplo.Servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Proceso extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String, ComandoAplicacionWeb> comandos;
	
	@Override
	public void init() throws ServletException {
		// Inicializar todos los objetos comando
		comandos = new HashMap<String, ComandoAplicacionWeb>();
		comandos.put("Calcular", new ComandoCalcularOperacion());
	}


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proceso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String strComando = request.getParameter("accion");
		ComandoAplicacionWeb comando = comandos.get(strComando);
		if (comando != null) {
			// Ejecutar el comando
			comando.ejecutar(request, response);
		}
		// Redirigir a la vista (JSP)
		try {
			ServletConfig sc = getServletConfig();
			sc.getServletContext().getRequestDispatcher("/PaginaWEB.jsp").forward(request,response);
		}
		catch (Exception e) {
			      e.printStackTrace();
		}
		
	}
	}
		
	
	
	
	
	
	