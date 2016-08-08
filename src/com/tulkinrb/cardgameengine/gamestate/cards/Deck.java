package com.tulkinrb.cardgameengine.gamestate.cards;

import java.util.List;
import java.util.Map;

/**
 * a collection of cards. a deck object represents the deck type (for example standard 52 deck), and contains card objects that belong to it.
 * the cards in a deck have a specific order and indexing. the cards of the deck are set at the deck's creation and cannot change.
 * 
 * @author TulkinRB
 *
 */
public class Deck {
	
	/**
	 * a single card that belongs to a deck. represents the card type (for example ace of spades), and multiple cards may have this type.
	 * a card type object is only created with a deck and belongs to that deck.
	 * a card type's attributes are set at the card type's creation and cannot change.
	 * 
	 * @author TulkinRB
	 *
	 */
	public class CardType {
		
		// todo: use a generic object of the implemented language when it is created
		/**
		 * a mapping from an attribute name, to the attribute's value for this card
		 */
		private Map<String, Object> attributes;
		
		/**
		 * constructs a card object with attributes as given by the specified map
		 * @param attributes a mapping from an attribute name, to the value which will be assigned to it
		 */
		private CardType(Map<String, Object> attributes){
			// todo: find a way to deep clone the map so it can't be changed from outside
			this.attributes = attributes;
		}
		
		/**
		 * 
		 * @param attributeName the name of the card's attribute
		 * @return the value of this card's given attribute
		 */
		public Object getAttribute(String attributeName){
			return this.attributes.get(attributeName);
		}
		
	}
	
	/**
	 * an ordered list that contains all of the deck's card in their specific order
	 */
	private List<CardType> cards;
	
	
	/**
	 * 
	 * @param index	the index of the card to be returned
	 * @return the card in this deck with the given index
	 * @pre index >= 0 && index < this.size()
	 */
	public CardType getCardByIndex(int index){
		return this.cards.get(index);
	}
	
	/**
	 * 
	 * @return the number of unique cards in the deck
	 */
	public int size(){
		return this.cards.size();
	}
}
