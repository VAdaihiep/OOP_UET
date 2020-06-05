package chapter2;

public class Exercise4 {
  int x = 6;
  int sum = 3;
  int y = 9;
  int count = 11;
  int total = 0;
  int q = 6;
  int d = 5;
  int k;
  int sumEven = 0;

  void exampleA() {
	System.out.println("z = " + (x + y));
	x++;
	System.out.println("x = " + x);
  }

  void exampleB() {
	if (count > 10) {
	  System.out.println("Count is greater than 10");
	}
  }

  void exampleC() {
	System.out.println(total -= x - 1);
  }

  void exampleD() {
	System.out.println(q %= d);
  }

  void exampleEFG() {
	System.out.println("The sum is " + (sum += x));
  }

  void exampleH() {
	for (int i = 1; i < 100; i++) {
	  //Dung toan tu 3 ngoi
	  sumEven += (i % 2 == 0) ? i : 0;

	  //Dung if
	  //if (i % 2 == 0) {
	  //sumEven += i;
	  //}
	}
	System.out.println(sumEven);
  }

  void exampleI() {
	for (int i = 1; i < 11; i++) {
	  System.out.print(i + "\t");
	}
  }

  public static void main(String[] args) {
	Exercise4 exercise4 = new Exercise4();
	exercise4.exampleA();
	exercise4.exampleB();
	exercise4.exampleC();
	exercise4.exampleD();
	exercise4.exampleEFG();
	exercise4.exampleH();
	exercise4.exampleI();
  }
}
