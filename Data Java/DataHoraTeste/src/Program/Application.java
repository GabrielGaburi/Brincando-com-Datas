package Program;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Application {

	public static void main(String[] args) {

		// Data horário atual AM PM Brasil
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");

		// Data horário atual 24 horas
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");

		// Formatação Data e Hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Formas de impressão padrão ISO
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		// ISO para Local 
		LocalDate d04 = LocalDate.parse("03/07/2023", fmt1);
		LocalDateTime d05 = LocalDateTime.parse("03/07/2023 21:02", fmt2);
		
		//Padrão ISO 
		LocalDate d06 = LocalDate.of(2023, 07, 03);
		LocalDateTime d07 = LocalDateTime.of(2023,07,03, 21,07);
		
		//Padrão ISO horário GMT
		Instant d08 = Instant.parse("2023-07-03T00:10:26Z");
		
		
		//Padrão ISO horário Brasília
		Instant d09 = Instant.parse("2022-07-03T00:10:26+03:00");
		

		Date hoje = new Date();

		System.out.println("Data e Horário atual AM/PM = " + sdf.format(hoje));
		System.out.println("Data e Horário atual 24 horas = " + sdf1.format(hoje));
		System.out.println();
		System.out.println("Data Atual Local Padrão ISO BRT = " + d01.toString());
		System.out.println("Data e Hora Atual Local Padrão ISO BRT = " + d02.toString());
		System.out.println("Data e Hora Atual UTC Padrão ISO GMT = " + d03.toString());
		System.out.println();
		System.out.println("Data Local Padrão ISO BRT = " + d04.toString());
		System.out.println("Data e Hora Padrão ISO BRT  = " +d05.toString());
		System.out.println();
		System.out.println("Data BRT Formatado = " + d04.format(fmt1));
		System.out.println("Data e Hora BRT Formatado = " + d05.format(fmt2));
		System.out.println("Data e Hora BRT Formatado de forma Diferente = " + d05.format((DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))));
		System.out.println();
		System.out.println("Data Local Método 2 Padrão ISO = " +d06.toString());
		System.out.println("Data e Hora Local Método 2 Padrão ISO = " +d07.toString());
		System.out.println();
		System.out.println("Data e Hora UTC Padrão ISO  = " +d08.toString());
		System.out.println("Data e hora BRT Padrão ISO = " +d09.toString());
		
	
		
		

	}

}
