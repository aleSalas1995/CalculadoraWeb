package cr.tec.poo.ejemplo.Servlets;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

import java.io.*;

import cr.tec.poo.ejemplo.Operacion.Operacion;

public class ComandoCalcularOperacion implements ComandoAplicacionWeb {		
	@Override
	public void ejecutar(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		String operacion = request.getParameter("operacion");//Le asigna a operacion lo que le pidio el usuario
		request.setAttribute("operacion", operacion);
		Operacion op = new Operacion(operacion);
		double resultado = op.resolver();//Resuelve la operacion en la class Operacion
		request.setAttribute("resultado", resultado);//Asigna a resultado el resultado de la operacion
		double tiempo = 0;
		tiempo = System.nanoTime();//Le asigno a la variable tiempo el tiempo que duro realizando el calculo
		request.setAttribute("tiempo", tiempo);
	}

}
