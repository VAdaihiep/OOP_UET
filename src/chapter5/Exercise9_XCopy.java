package chapter5;

public class Exercise9_XCopy {
  public static void main(String [] args) {
	int orig = 42;
	//Sửa Xcopy x = new xCopy();
	//thành -> Xcopy x = new Xcopy();
	Exercise9_XCopy x = new Exercise9_XCopy();
	int y = x.go(orig);
	System.out.println(orig + " " + y);
  }

  int go(int arg) {
	arg = arg * 2;
	return arg;
  }
}
