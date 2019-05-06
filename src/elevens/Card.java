package elevens;

public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;



	 public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit= cardSuit;
		pointValue = cardPointValue;
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String suit() {
	return suit;
   }

	
	public String rank() {
	return rank;
	}

   
	public int pointValue() {
		return pointValue;
	}


	public boolean matches(Card otherCard) {
		return this.toString().equals(otherCard.toString());
	}


	public String toString() {
		return rank + " of " + suit + " point value " + pointValue;
	}
}
