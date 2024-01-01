package a8_Data_hora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class g7_calendar {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date d1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		// Adicionando horas com o Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		//Obtendo informações do date com calender
		cal.setTime(d1);
		int minutes = cal.get(Calendar.MINUTE);
		int month =1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: " + minutes);
		System.out.println("Mês: " + month);
	}
}
