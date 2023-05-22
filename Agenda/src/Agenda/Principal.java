package Agenda;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import Models.Tarea;

public class Principal {
	
	public static final Month [] arrayMeses = {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL,
											Month.MAY, Month.JUNE, Month.JULY, Month.AUGUST, Month.SEPTEMBER,
											Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER}; 
	
	public static void main(String[] args) {
		
		System.out.println("Introduce la fecha de finalizacion");
			
			LocalDate localDate = LocalDate.of(12, arrayMeses[2], 3);
			Date a = null;
			a.valueOf(localDate);
			Tarea nueva = new Tarea("a", a);
		

	}

}
