package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); // instanciação do Calendar.
		cal.setTime(d); // cal.setTime() coloca a data "d" dentro do calendário "cal".
		int minutes = cal.get(Calendar.MINUTE); // minutes recebe cal.get(Calendar.MINUTE), que é os minutos da data.
		int month = 1 + cal.get(Calendar.MONTH); // month recebe 1 + cal.get(Calendar.MONTH), os meses da data + 1, pois no Calender começa com janeiro sendo o número zero(0).
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
}