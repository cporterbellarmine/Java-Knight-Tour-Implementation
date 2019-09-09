/**
 * This class creates a knight object that uses
 * the Heuristic Board to move around.
 * 
 * @author christinaporter
 * @version 09-09-2019
 * Knight's Tour Project
 * Fall 2019
 */

public class HeuristicKnight {
	
	private int xCoord;// This will be used to represent the x value in my board array.
	private int yCoord;// This will be used to represent the y value in my board array.
	
	HeuristicBoard heuristicBoard = new HeuristicBoard();//This instantiates a fresh heuristic board.
	
	/**
	 * This method is my empty-constructor which initializes my heuristic version of knight.
	 */
	
	public HeuristicKnight() {
		
	}//end constructor
	
	/**
	 * This is my move up then right method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveUpRight() {
		
		this.xCoord = this.xCoord - 2;
		this.yCoord = this.yCoord + 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveRightUp
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveUpRight() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.xCoord - 2 >= 0 && this.yCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
		}//end if
		
	}//end checkMoveUpRight
	
	/**
	 * 	This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
		
	public int heuristicValueUpRight() {
		
		return heuristicBoard.checkSpaceValue(this.xCoord-2, this.yCoord+1);
		
	}//end heuristicValueUpRight
	
	/**
	 * This is my move up then left method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveUpLeft() {
		
		this.xCoord = this.xCoord - 2;
		this.yCoord = this.yCoord - 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveUpLeft
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveUpLeft() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.xCoord - 2 >= 0 && this.yCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveUpLeft
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueUpLeft() {
		
		return heuristicBoard.checkSpaceValue(this.xCoord - 2, this.yCoord - 1);
		
	}//end heuristicValueUpLeft
	
	/**
	 * This is my move down then right method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveDownRight() {
		
		this.xCoord = this.xCoord + 2;
		this.yCoord = this.yCoord + 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveDownRight
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveDownRight() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.xCoord + 2 < 8 && this.yCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveDownRight
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueDownRight() {
		
		return heuristicBoard.checkSpaceValue (this.xCoord + 2, this.yCoord + 1);
		
	}//end heuristicValueDownRight
	
	/**
	 * This is my move down then left method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveDownLeft() {
		
		this.xCoord = this.xCoord + 2;
		this.yCoord = this.yCoord - 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveDownLeft
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveDownLeft() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.xCoord + 2 < 8 && this.yCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
		
		}//end if
		
	}//end checkMoveDownLeft
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueDownLeft() {
		
		return heuristicBoard.checkSpaceValue(this.xCoord + 2, this.yCoord - 1);
		
	}//end heuristicValueDownLeft
	
	/**
	 * This is my move left then down method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveLeftDown() {
		
		this.yCoord = this.yCoord - 2;
		this.xCoord = this.xCoord + 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveLeftDown
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveLeftDown() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.yCoord - 2 >= 0 && this.xCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
		}//end if
		
	}//end checkMoveLeftDown
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueLeftDown(){
		
		return heuristicBoard.checkSpaceValue(this.xCoord + 1, this.yCoord - 2);
		
	}//end heuristicValueLeftDown
	
	/**
	 * This is my move left then up method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveLeftUp() {
		
		this.yCoord = this.yCoord - 2;
		this.xCoord = this.xCoord - 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveLeftUp
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveLeftUp() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.yCoord - 2 >= 0 && this.xCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveLeftUp
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueLeftUp() {
		
		return heuristicBoard.checkSpaceValue(this.xCoord - 1, this.yCoord - 2);
		
	}//end heuristicValueLeftUp
	
	/**
	 * This is my move right then down method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveRightDown() {
		
		this.yCoord = this.yCoord + 2;
		this.xCoord = this.xCoord + 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveRightDown
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveRightDown() {
		
		//if the intended move is within the array indicies, then this will return true.
		if(this.yCoord + 2 < 8 && this.xCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveRightDown
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueRightDown() {
		
		return heuristicBoard.checkSpaceValue(this.xCoord + 1, this.yCoord + 2);
		
	}//end heuristicValueRightDown

	/**
	 * This is my move right then up method where the xCoord and yCoord values are changed
	 * then the heuristics values on the squares are reduced.
	 */
	
	public void moveRightUp() {
		
		this.yCoord = this.yCoord + 2;
		this.xCoord = this.xCoord - 1;
		
		heuristicBoard.setHeuristicValue(this.xCoord, this.yCoord, heuristicBoard.checkSpaceValue(this.xCoord, this.yCoord) - 1);
		
	}//end moveRightUp
	
	/**
	 * This method checks whether or not it is possible to move up and right due to
	 * the array index restrictions.
	 * @return
	 */
	
	public boolean checkMoveRightUp() {
		
		//if the intended move is within the array indicies, then this will return true.
		
		if(this.yCoord + 2 < 8 && this.xCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveRightUp
	
	/**
	 * This method looks ahead and returns the number of possibilities for the intended move.
	 * @return
	 */
	
	public int heuristicValueRightUp() {
		
		return heuristicBoard.checkSpaceValue(this.xCoord - 1, this.yCoord +1);
		
	}//end heuristicValueRightUp
	
	/**
	 * This method sets the start position on the board.
	 * @param x
	 * @param y
	 */
	
	public void setStartPos(int x, int y) {
		
		setxCoord(x);
		setyCoord(y);
		
	}//end setStartSpace

	/**
	 * 
	 * @return the current value of xCoord
	 */
	
	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	/**
	 * 
	 * @param xCoord the value set as xCoord
	 */
	
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}//end setxCoord

	/**
	 * 
	 * @return the current value of yCoord
	 */
	
	public int getyCoord() {
		return yCoord;
	}//end getyCoord
	
	/**
	 * 
	 * @param yCoord the value set as yCoord
	 */

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}//end setyCoord
	

}//endHeuristicKnight
