package chapter2;

import java.util.Calendar;

public class Exercise10 {
  public static void main(String[] args) {
	String string = "This is also a string";
	Calendar dateTime = Calendar.getInstance();
	Object test = null;

	System.out.printf("Hello, I am %s, I am %d years old.\n", "HaiNguyenLe", 24);
	System.out.printf("%X\n", 26);
	System.out.printf("%e\n", 12345678.9);
	System.out.printf("%S\n", string);
	System.out.printf("%tc\n", dateTime);
	System.out.printf("%1$tA, %1$tB %1$td, %1$tY\n", dateTime);
	System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);
	System.out.printf( "Hashcode of null is \n", test );
	System.out.printf( "%10s%10d%10c%10f\n\n", "hello", 7, 'a', 1.23 );
  }
}
