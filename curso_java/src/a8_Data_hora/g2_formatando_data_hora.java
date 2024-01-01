package a8_Data_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class g2_formatando_data_hora {
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.parse("19/12/2023",fmt1);
		LocalDateTime d02 = LocalDateTime.parse("2023-12-19T15:03");
		LocalDateTime d03 = LocalDateTime.parse("19/12/2023 15:03",fmt2);
		LocalDate d04 = LocalDate.parse("19/12/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		
		
		LocalDate d10 = LocalDate.of(2023, 12, 19);
		LocalDateTime d11 = LocalDateTime.of(2023, 12, 19, 15, 03);
		
		System.out.println("d5 = " + d10);
		System.out.println("d6 = " + d11);
	}
}
