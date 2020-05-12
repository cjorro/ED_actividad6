package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduce un numero double: ");

	double numero = entrada.nextDouble();
	
	Double numeroWrapper = new Double(numero);
	
	System.out.println(numeroWrapper);
			
	}
	
	

	
	

}

