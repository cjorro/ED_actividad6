package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Introduce otro numero entero: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("Dime que operacion quieres hacer (+, -, *)");
		String operacion = entrada.next();
		
		int resultado = 0;
		
		/*if (operacion == "+") {
			resultado = numero1 + numero2;
			
		} else if (operacion == "-") {
			resultado = numero1 - numero2;
			
		} else if (operacion == "*") {
			resultado = numero1 * numero2;
			
		}*/
	
		switch (operacion) {
		case "+":
			 resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		
		default:
			System.out.println("Operacion erronea, debe ser una operacion de las marcadas ");
			break;
		}
		
		System.out.println("El resultado en binario es: " + Integer.toBinaryString(resultado));
		System.out.println("El resultado en hexadecimal es: " + Integer.toHexString(resultado));
		System.out.println("El resultado en octal es: " + Integer.toOctalString(resultado));
		
	}

}
