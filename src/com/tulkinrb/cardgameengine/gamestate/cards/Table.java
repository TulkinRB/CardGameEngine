package com.tulkinrb.cardgameengine.gamestate.cards;

/**
 * A table unit, which card piles can be on. The piles are arranged in a grid, which size is determined at construction.
 * 
 * @author TulkinRB
 *
 */
public class Table {
	
	/**
	 * a 2d array of piles, representing the piles on the table
	 */
	private Pile[][] matrix;
	
	/**
	 * constructs a new table with a specified size (in card piles)
	 * 
	 * @param m the number of rows in the new table
	 * @param n the number of columns in the new table
	 */
	public Table(int m, int n){
		this.matrix = new Pile[m][n];
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				this.matrix[i][j] = new Pile();
			}
		}
	}
	
	/**
	 * returns the pile object representing the pile of cards in the specified position
	 * 
	 * @param i the row of the returned pile
	 * @param j the column of the returned pile
	 * @return the pile object in the (i, j) position on this table
	 */
	public Pile getPile(int i, int j){
		return this.matrix[i][j];
	}
	
	/**
	 * returns the table's length (in card piles)
	 * 
	 * @return the table's length
	 */
	public int getM(){
		return this.matrix.length;
	}
	/**
	 * returns the table's width (in card piles)
	 * 
	 * @return the table's width
	 */
	public int getN(){
		return this.matrix[0].length;
	}
}
