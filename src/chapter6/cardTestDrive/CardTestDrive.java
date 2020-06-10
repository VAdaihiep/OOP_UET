package chapter6.cardTestDrive;

public class CardTestDrive {
  public static void main(String[] args) {
	CardSet cardSet = new CardSet();
	cardSet.shuffle();

	Card card = new Card("2", "CLUBS");
	System.out.println(card.getRank());
	System.out.println(card.getSuit());
  }
}

