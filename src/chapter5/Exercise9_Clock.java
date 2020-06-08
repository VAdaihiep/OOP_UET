package chapter5;

class Clock {
  String time;

/*2 phương thức set, get bị sai. Sửa lại như bên dưới.
  void setTime(String t) {
	return time;
  }

  void getTime(){
    return time;
  }
*/

  void setTime(String time) {
	this.time = time;
  }

  public String getTime() {
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
