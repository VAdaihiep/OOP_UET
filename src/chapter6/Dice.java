package chapter6;

public class Dice {
  public int roll() {
	return (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
	Dice dice = new Dice();
	int saveDice = dice.roll();
	System.out.println(saveDice);
  }
}
