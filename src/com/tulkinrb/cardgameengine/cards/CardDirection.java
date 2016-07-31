package com.tulkinrb.cardgameengine.cards;

/**
 * a direction a card is facing in a pile
 * 
 * @author TulkinRB
 * 
 */
public enum CardDirection {
	FACEUP, FACEDOWN;
	
	/**
	 * @return the opposite of this card direction
	 */
	public CardDirection flipped(){
		return (this == FACEUP)? FACEDOWN: FACEUP;
	}
}
