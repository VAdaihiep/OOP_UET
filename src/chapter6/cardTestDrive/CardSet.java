package chapter6.cardTestDrive;

import java.util.ArrayList;
import java.util.Collections;

class CardSet {
  private final ArrayList<Card> arrCardAfterShuffle = new ArrayList<>();

  public CardSet() {
	for (int i = 0; i < Card.RANK.length; i++) {
	  for (Card.Suit suits : Card.Suit.values()) {
		Card card = new Card(Card.RANK[i], suits);
		arrCardAfterShuffle.add(card);
	  }
	}
  }

  void shuffle() {
	Collections.shuffle(arrCardAfterShuffle);
	for (Card card : arrCardAfterShuffle) {
	  System.out.println(card.getRank() + "-" + card.getSuit());
	}
  }
}
