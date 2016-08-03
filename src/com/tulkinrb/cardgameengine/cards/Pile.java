package com.tulkinrb.cardgameengine.cards;

import java.util.List;

/**
 * a group of cards, stacked on top of each other.
 * 
 * @author TulkinRB
 *
 */
public class Pile {
	
	/**
	 * a list consisting of all the cards in the pile, in the order they are stacked
	 * (first card is the bottom card, last is the top card)
	 */
	private List<Card> cards;
	
	/**
	 * adds a card to the top of the pile. same as addCard(card, this.size()).
	 * 
	 * @param card the card to be added
	 */
	public void addCard(Card card){
		this.cards.add(card);
	}
	/**
	 * inserts a card to a specified location in the pile, below the card that was in that position previously
	 * 
	 * @param card the card to be added
	 * @param position the position which the card will be inserted in
	 * @pre position >= 0 && position <= this.size()
	 */
	public void addCard(Card card, int position){
		this.cards.add(position, card);
	}
	
	/**
	 * removes and returns the card at the top of the pile. same as removeCard(this.size() - 1). 
	 * 
	 * @return the removed card
	 * @pre this.size() > 0
	 */
	public Card removeCard(){
		return this.removeCard(this.size() - 1);
	}
	/**
	 * removes and returns a card from a specified position.
	 * 
	 * @param position the position of the card that will be removed
	 * @return the removed card
	 * @pre position >= 0 && position < this.size()
	 */
	public Card removeCard(int position){
		return this.cards.remove(position);
	}
	
	/**
	 * returns the number of cards in this pile
	 * 
	 * @return the number of cards in this pile
	 */
	public int size(){
		return this.cards.size();
	}
}
