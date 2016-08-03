package com.tulkinrb.cardgameengine.cards;

/**
 * a basic implementation of the Card interface
 * 
 * @author TulkinRB
 *
 */
public class SimpleCard implements Card{
	
	/**
	 * the type of this card
	 */
	private Deck.CardType type;
	/**
	 * the orientation of this card
	 */
	private CardOrientation orientation;
	
	/**
	 * constructs a SimpleCard object with the specified type and orientation
	 * 
	 * @param type the new card's type
	 * @param orientation the new card's orientation
	 */
	public SimpleCard(Deck.CardType type, CardOrientation orientation){
		this.type = type;
		this.orientation = orientation;
	}
	
	@Override
	public Deck.CardType getType(){
		return this.type;
	}
	
	@Override
	public CardOrientation getOrientation(){
		return this.orientation;
	}
	
}
