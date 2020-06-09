package chapter5;

class Clock {
  //Sửa String time thành private String time;
  private String time;

  /*
  phương thức get bị sai. Sửa lại như bên dưới.
   */
  void setTime(String t) {
	time = t;
  }

  //Sửa void thành String
  String getTime() {
	return time;
  }
}

public class Exercise9_Clock {
  public static void main(String[] args) {
	Clock c = new Clock();
	c.setTime("1234");
	String tod = c.getTime();
	System.out.println("time: " + tod);
  }
}
