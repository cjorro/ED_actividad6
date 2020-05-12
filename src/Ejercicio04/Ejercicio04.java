package Ejercicio04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		Duration duracion = Duration.between(LocalDateTime.of(1970, 1, 1, 0, 0, 0), LocalDateTime.now());
		
		System.out.println(duracion.getSeconds());
	}

}
