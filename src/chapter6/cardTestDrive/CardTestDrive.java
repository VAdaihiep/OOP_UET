package chapter6.cardTestDrive;

public class CardTestDrive extends Card {
  public CardTestDrive(int rank, Suit suit) {
	super(rank, suit);
  }

  public static void main(String[] args) {
	CardSet cardSet = new CardSet();
	cardSet.shuffle();

	Card card = new Card(RANK[2], Suit.BICH);
	System.out.printf("Test Card: rank = %d, suit = %s", card.getRank(), card.getSuit());
  }
}

