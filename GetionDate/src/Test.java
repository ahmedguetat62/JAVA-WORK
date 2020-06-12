import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test {
	public static void main(String[] args) {
		LocalDate lc = LocalDate.of(2020, Month.APRIL,40) ;
		//lc.plusMonths(2);
		System.out.println(lc.getDayOfMonth());

		System.out.println(lc.getYear());
		System.out.println(lc.getMonth());
		System.out.println(lc.getDayOfWeek());
		System.out.println(lc.getDayOfMonth());
		System.out.println(lc.getDayOfYear());
		LocalDate date = LocalDate.of(2000,10,26);
		if(lc.isAfter(date)) System.out.println("La date"+lc+"est apres"+date); 
		System.out.println("La date "+lc+" est Avant " +date);
		//// Time
		System.out.println(" \n\n" );
		LocalTime lt = LocalTime.of(15, 25, 10);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
		//
		LocalTime lt2 = LocalTime.of(18, 25, 10);
		if(lt.isBefore(lt2)) System.out.println("True");
		else System.out.println("False");
		LocalDateTime ldt = LocalDateTime.of(lc, lt);
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.toLocalTime());
		//
		LocalDateTime ldt2 = lc.atTime(lt2);
		System.out.println(ldt2);
		Period x= Period.between(LocalDate.now(),lc) ;
		System.out.println(x);
		Duration d = Duration.between(lt, lt2);
		System.out.println(d);
		////////////////////////////////////////////////////
		System.out.println(" \n\n" );
		System.out.println(" \n\n" );
		System.out.println(" \n\n" );

		LocalDateTime dd = LocalDateTime.of(2015,5,10,11,22,33);
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(dd.format(f1));
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("d::MMM::yyyy HH::mm::ss");
		System.out.println(dd.format(f2));
		DateTimeFormatter f3 = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(dd.format(f3));

	}
}
