package chapter6.cardTestDrive;

class Card {
  public static final int[] RANK = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

  public static final String[] SUITS = {"Rô", "Bích", "Tép", "Cơ"};

  private int rank;
  private String suit;

  public Card(int rank, String suit) {
	this.rank = rank;
	this.suit = suit;
  }

  public int getRank() {
	return rank;
  }

  public void setRank(int rank) {
	this.rank = rank;
  }

  public String getSuit() {
	return suit;
  }

  public void setSuit(String suit) {
	this.suit = suit;
  }
}
