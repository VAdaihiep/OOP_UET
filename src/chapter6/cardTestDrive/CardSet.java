package chapter6.cardTestDrive;

import java.util.ArrayList;
import java.util.Collections;

class CardSet {
  ArrayList<Card> shuffleCard = new ArrayList<>();

  void shuffle() {
	int k = 0;
	for (int i = 0; i < Card.RANK.length; i++) {
	  for (int j = 0; j < Card.SUITS.length; j++) {
		Card card = new Card(Card.RANK[i], Card.SUITS[j]);
		shuffleCard.add(k, (card));
		Collections.shuffle(shuffleCard);
	  }
	}
	for (Card card : shuffleCard) {
	  System.out.println(card.rank + "-" + card.suit);
	}
  }
}
