/**
 * This class represents my empty chess board that I will use
 * to move my Knight object around.
 * @author christinaporter
 * @version 09-09-2019
 * Knight's Tour Project
 * Fall 2019
 *
 */


public class Board {
	
	int board[][];//this value instantiates a 2D array as my board.

	/**
	 * The empty-argument instructor initializes my Board as an [8][8] array.
	 */
	public Board() {
		
		setBoard(8,8);
		
	}//end empty-argument constructor
	
	/**
	 * This space takes the input values and returns the current space value on the board.
	 * @param x as the desired x value
	 * @param y as the desired y value
	 * @return the current space value for the input x and y
	 */
	public int checkSpace(int x, int y) {
		
		int z = this.board[x][y];
		
		return z;
		
	}//end checkSpace
	
	/**
	 * This board will takes the input values and changes the current space value on the board.
	 * @param x as the desired x value
	 * @param y as the desired y value
	 * @param z as the desired value for the current space for the input x and y
	 */
	public void setVisited(int x, int y, int z) {
		
		this.board[x][y] = z;
		
	}//end setSpaceToVisited

	/**
	 * This method prints out the current board.
	 */
	public void getBoard() {
		
		//This loop automatically calls the index values of the board to 
		//retrieve the values for that current space and print them out.
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
				System.out.print(this.board[i][j] + "\t");
				
			}//end for j
			
			System.out.println();
			
		}//end for i
		
		
	}//end getBoard

	/**
	 * This method initializes an empty board.
	 * @param x as the desired length
	 * @param y as the desired width
	 */
	private void setBoard(int x, int y) {
		
		board = new int[x][y];
		
		//This method iterates though the index numbers for the designated values
		//as length and width to initialize the valuese as 0.
		for(int i = 0; i < board. length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
				this.board[i][j] = 0;
				//System.out.print(this.board[i][j] + "\t");
				
			}//end for j
			
			//System.out.println();
			
		}//end for i
		
		
	}//end setBoard

}//end class
