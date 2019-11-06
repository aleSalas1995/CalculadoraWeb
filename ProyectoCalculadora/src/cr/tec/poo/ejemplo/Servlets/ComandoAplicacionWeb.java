package cr.tec.poo.ejemplo.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

interface ComandoAplicacionWeb {
	//Lo que hace es redirigirse al comando que le envien con los metodos request response
	void ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
