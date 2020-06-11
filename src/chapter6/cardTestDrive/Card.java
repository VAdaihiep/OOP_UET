package chapter6.cardTestDrive;

class Card {
  public static final int[] RANK = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

  public enum Suit {
	RO, BICH, TEP, CO
  }

  private int rank;
  private Suit suit;

  public Card(int rank, Suit suit) {
	this.rank = rank;
	this.suit = suit;
  }

  public int getRank() {
	return rank;
  }

  public void setRank(int rank) {
	this.rank = rank;
  }

  public Suit getSuit() {
	return suit;
  }

  public void setSuit(Suit suit) {
	this.suit = suit;
  }
}
