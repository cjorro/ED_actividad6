package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero tipos string: ");
		
		Scanner entrada = new Scanner(System.in);
		
		String numeroString = entrada.next();
		
		Integer numeroWrapper = Integer.valueOf(numeroString); //esto es lo que lo convierte
		
		System.out.println(numeroWrapper);
		
	}

}
