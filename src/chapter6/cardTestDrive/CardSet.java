package chapter6.cardTestDrive;

import java.util.ArrayList;
import java.util.Collections;

class CardSet {
  private final ArrayList<Card> shuffleCard = new ArrayList<>();

  void createCardSolitaire() {
	for (int i = 0; i < Card.RANK.length; i++) {
	  for (int j = 0; j < Card.SUITS.length; j++) {
		Card card = new Card(Card.RANK[i], Card.SUITS[j]);
		shuffleCard.add(card);
	  }
	}
  }

  void shuffle() {
	Collections.shuffle(shuffleCard);
	for (Card card : shuffleCard) {
	  System.out.println(card.getRank() + "-" + card.getSuit());
	}
  }
}
