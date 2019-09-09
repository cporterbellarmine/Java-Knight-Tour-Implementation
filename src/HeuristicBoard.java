/**
 * This method initializes my board involving the possible times
 * that each square could be moved to.
 * @author christinaporter
 * @version 09-09-2019
 * Knight's Tour Project
 * Fall 2019
 *
 */


public class HeuristicBoard {
	
	int heuristicBoard[][];//this reserves the name for my array for the board
	
	/**
	 * This constructor uses the set board constructor to initialize 
	 * my fresh heuristics board.
	 */
	public HeuristicBoard() {
		
		setHeuristicBoard();
		
	}//end constructor
	
	/**
	 * This method accepts an x value and an y value in order
	 * to return the current value of the space in the array.
	 * @param x as the inserted value for x
	 * @param y as the inserted value for y
	 * @return the current value of the chosen space
	 */
	public int checkSpaceValue(int x, int y) {
		
		int z = this.heuristicBoard[x][y];
		
		return z;
		
	}//end checkSpaceValue
	
	/**
	 * This method prints out the current heuristic board.
	 */
	public void getHeuristicBoard() {
		
		setHeuristicBoard();
		
		//This will initialize my x values (i) as my y values (j) change until
		//my entire array is filled.
		for(int i = 0; i < heuristicBoard.length; i++) {
			for(int j = 0; j < heuristicBoard[i].length; j++) {
				
				System.out.print(this.heuristicBoard[i][j] + "\t");
				
			}//end for j
			
			System.out.println();
			
		}//end for i
		
	}//end getHeuristicBoard
	
	/**
	 * This method accepts inserted values x and y to change
	 * the current value in that space.
	 * @param x as the provided x value
	 * @param y as the provided y value
	 * @param z as the desired space value
	 */
	
	public void setHeuristicValue(int x, int y, int z) {
		
		heuristicBoard[x][y] = z;
		
	}//end setHeuristicValue

	/**
	 * This method manually initializes the default values for my heuristic array.
	 */
	private void setHeuristicBoard() {
		heuristicBoard = new int[8][8];
		
		heuristicBoard[0][0] = 2; heuristicBoard[7][0] = 2; heuristicBoard[7][7] = 2; heuristicBoard[0][7] = 2; heuristicBoard[7][6] = 3;
		heuristicBoard[0][1] = 3; heuristicBoard[0][6] = 3; heuristicBoard[1][0] = 3; heuristicBoard[1][7] = 3; heuristicBoard[6][0] = 3;
		heuristicBoard[0][2] = 4; heuristicBoard[0][3] = 4; heuristicBoard[0][4] = 4; heuristicBoard[0][5] = 4; heuristicBoard[1][1] = 4;
		heuristicBoard[1][6] = 4; heuristicBoard[2][0] = 4; heuristicBoard[2][7] = 4; heuristicBoard[3][0] = 4; heuristicBoard[3][7] = 4;
		heuristicBoard[4][0] = 4; heuristicBoard[4][7] = 4; heuristicBoard[5][0] = 4; heuristicBoard[5][7] = 4; heuristicBoard[6][1] = 4;
		heuristicBoard[6][6] = 4; heuristicBoard[7][2] = 4; heuristicBoard[7][3] = 4; heuristicBoard[7][4] = 4; heuristicBoard[7][5] = 4;
		heuristicBoard[1][2] = 6; heuristicBoard[1][3] = 6; heuristicBoard[1][4] = 6; heuristicBoard[1][5] = 6; heuristicBoard[2][1] = 6;
		heuristicBoard[2][6] = 6; heuristicBoard[3][1] = 6; heuristicBoard[3][6] = 6; heuristicBoard[4][1] = 6; heuristicBoard[4][6] = 6;
		heuristicBoard[5][1] = 6; heuristicBoard[5][6] = 6; heuristicBoard[6][2] = 6; heuristicBoard[6][3] = 6; heuristicBoard[7][1] = 3;
		heuristicBoard[6][4] = 6; heuristicBoard[6][5] = 6; heuristicBoard[2][2] = 8; heuristicBoard[2][3] = 8; heuristicBoard[2][4] = 8;
		heuristicBoard[2][5] = 8; heuristicBoard[3][2] = 8; heuristicBoard[3][3] = 8; heuristicBoard[3][4] = 8; heuristicBoard[3][5] = 8;
		heuristicBoard[4][2] = 8; heuristicBoard[4][3] = 8; heuristicBoard[4][4] = 8; heuristicBoard[4][5] = 8; heuristicBoard[5][2] = 8;
		heuristicBoard[5][3] = 8; heuristicBoard[5][4] = 8; heuristicBoard[5][5] = 8; heuristicBoard[6][7] = 3;
		
		
	}//end setHeuristicBoard
	
}//end HeuristicBoard
