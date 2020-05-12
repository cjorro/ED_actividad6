package ejercicio06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		
		LocalDateTime fecha = LocalDateTime.of(2001, 3, 10, 17, 16);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH mm, yyyy EEEE");
		String str = fecha.format(formato);
		System.out.println(str);
	}

}
