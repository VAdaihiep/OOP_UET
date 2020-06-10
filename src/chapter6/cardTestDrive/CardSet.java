package chapter6.cardTestDrive;

import java.util.ArrayList;
import java.util.Collections;

class CardSet {
  void shuffle() {
	int k = 0;
	ArrayList<String> shuffleCard = new ArrayList<>();
	for (int i = 0; i < Card.RANK.length; i++) {
	  for (int j = 0; j < Card.SUITS.length; j++) {
		Card card = new Card(Card.RANK[i], Card.SUITS[j]);
		shuffleCard.add(k, (card.rank + "-" + card.suit + "\n"));
		Collections.shuffle(shuffleCard);
	  }
	}
	for (Object o : shuffleCard) {
	  System.out.println(o);
	}
  }
}
