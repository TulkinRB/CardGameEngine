package com.tulkinrb.cardgameengine.cards;

/**
 * a single 'physical' card, with orientation, that can be moved from pile to pile.
 * each card consists of a type (Deck.CardType) and an orientation (face up or face down).
 * 
 * @author TulkinRB
 *
 */
public interface Card {

	/**
	 * an orientation a card is facing
	 * 
	 * @author TulkinRB
	 * 
	 */
	public static enum CardOrientation {
		FACEUP, FACEDOWN;
	}
	
	/**
	 * returns this card's type (which card is it, for example ace of clubs)
	 * 
	 * @return the card type of this card
	 */
	public Deck.CardType getType();

	/**
	 * returns this card's orientation (face up or face down)
	 * 
	 * @return the orientation of this card
	 */
	public CardOrientation getOrientation();

}