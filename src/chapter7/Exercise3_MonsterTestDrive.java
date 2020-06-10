package chapter7;

public class Exercise3_MonsterTestDrive {
  static class Monster {
	boolean frighten(int degree) {
	  System.out.println("arrrgh");
	  return true;
	}
  }

  static class Vampire extends Monster {
	boolean frighten(int degree) {
	  System.out.println("a bite?");
	  return true;
	}
  }

  static class Dragon extends Monster {
	boolean frighten(int degree) {
	  System.out.println("breath fire");
	  return true;
	}
  }

  public static void main(String[] args) {
	Monster[] ma = new Monster[3];
	ma[0] = new Vampire();
	ma[1] = new Dragon();
	ma[2] = new Monster();

	for (int i = 0; i < 3; i++) {
	  ma[i].frighten(i);
	}
  }
}
