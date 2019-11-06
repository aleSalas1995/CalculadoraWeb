package cr.tec.poo.ejemplo.Operacion;

import java.util.Stack;



public class Operacion {
	
	private String[] dato;//crea un arreglo de strings 
	private Stack<Double> pila;//crea una pila de tipo double
	public Operacion(String datoEntrante){//recibe lo que lo envio el usuario y lo separa hasta encontrar el operador 
		pila = new Stack<Double>();
		dato = datoEntrante.split(" "); 
	}
	
	//Calcula el factorial
	private double factorial(double a){
		double res=1;
		while(a!=0){
			res = res * a;
			a-=1;
		}
		return res;
	}
	
	//Realiza la comparacion del operador para verificar que operacion realizar y 
	//si no la mete dentro de la pila.
	public double resolver(){
		for(int i=0; i<dato.length; i++){
			if(dato[i].equals("+")){
				double a = pila.pop();
				double b = pila.pop();
				pila.push(a+b);
			}
			else if(dato[i].equals("-")){
				double a = pila.pop();
				double b = pila.pop();
				pila.push(a-b);
			}
			else if(dato[i].equals("*")){
				double a = pila.pop();
				double b = pila.pop();
				pila.push(a*b);
			}
			else if(dato[i].equals("/")){
				double a = pila.pop();
				double b = pila.pop();
				pila.push(b/a);
			}
			else if(dato[i].equals("!")){
				double a = pila.pop();
				pila.push(factorial(a));
			}
			else{
				double a = Double.parseDouble(dato[i]);
				pila.push(a);
			}
		}
		return pila.pop();
	}
	
	//metodo de prueba
	public static void main(String[] args) {
		Operacion o = new Operacion("5 9 +");
		System.out.println(o.resolver());
		
	}
	
}
