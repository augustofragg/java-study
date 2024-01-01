package a8_Data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class g4_hora_global_para_local {
	public static void main(String[] args) {
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Converter data global para local
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("---------------");
		
		System.out.println("Dia do mês = " + d02.getDayOfMonth());
		System.out.println("mês = " + d02.getMonth());
		System.out.println("ano = " + d02.getYear());
		System.out.println("Hora = " + d02.getHour());
		System.out.println("Minuto = " + d02.getMinute());
		System.out.println("Segundo = " + d02.getSecond());
		System.out.println(d02);
		System.out.println(d02.format(fmt1));
		
	}
}
