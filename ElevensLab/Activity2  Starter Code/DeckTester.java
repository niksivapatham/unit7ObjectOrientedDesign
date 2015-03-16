/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = {"hearts","spades"};
		String[] ranks = {"3","7","Kings"};
		int[] values= {3 ,7,13};
		Deck deck1 = new Deck(ranks,suits,values);
		
		String[] suits1 = {"aces","spades"};
		String[] ranks1 = {"3","4","5"};
		int[] values1 = {3,4,5};
		Deck deck2 = new Deck(ranks1,suits1,values1);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.toString());
		System.out.println(deck2.toString());
		deck1.deal();
		deck1.deal();
		System.out.println(deck1.toString());
	}
}
