package chapter6.cardTestDrive;

class Card {
  public static final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
  public static final String[] SUITS = {"CLUBS", "DIAMONDS", "SPADES", "HEARTS"};

  private String rank;
  private String suit;

  public Card(String rank, String suit) {
	this.rank = rank;
	this.suit = suit;
  }

  public String getRank() {
	return rank;
  }

  public void setRank(String rank) {
	this.rank = rank;
  }

  public String getSuit() {
	return suit;
  }

  public void setSuit(String suit) {
	this.suit = suit;
  }
}
