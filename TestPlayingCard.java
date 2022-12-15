package part2;
//Name: Daniel Fleming

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPlayingCard {

	public static void main(String[] args) {
// B
		PlayingCard c1 = new PlayingCard(5,4);
		PlayingCard c2 = new PlayingCard(1,4);
		int i = c1.compareTo(c2);
		
		if(i == 2) {
			System.out.println(c1.toString() + " is greater than");
		}
		
		else if(i == 1) {
			System.out.print(c2.toString() + " is greater than");
		}
		
// C
		PlayingCard c3 = new PlayingCard(13,2);
		PlayingCard c4 = new PlayingCard(8,3);
		PlayingCard c5 = new PlayingCard(10,1);
		
		ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
		
		hand.add(c1);
		hand.add(c2);
		hand.add(c3);
		hand.add(c4);
		hand.add(c5);
		
		Collections.sort(hand);
		Object[] sorted = hand.toArray();
		
		for(PlayingCard a : hand){
			System.out.println(a.toString());
		}
	}

}
