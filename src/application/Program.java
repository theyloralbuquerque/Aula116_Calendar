package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); // instancia��o do Calendar.
		cal.setTime(d); // cal.setTime() coloca a data "d" dentro do calend�rio "cal".
		cal.add(Calendar.HOUR_OF_DAY, 4); // cal.add() adicionou 4 horas do dia � data.
		d = cal.getTime(); // cal.getTime() atualiza a vari�vel d com os dados armazenados no Calendar cal.
		
		System.out.println(sdf.format(d));

	}

}
