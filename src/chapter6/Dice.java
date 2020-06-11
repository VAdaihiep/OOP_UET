package chapter6;

public class Dice {
  int status = 0;

  public int roll() {
	return status = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
	Dice dice = new Dice();
	dice.roll();
	System.out.println(dice.status);
  }
}
