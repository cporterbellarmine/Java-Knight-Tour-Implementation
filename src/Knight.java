/**
 * This class creates my Knight object that I will use to move around the board.
 * @author christinaporter
 *
 */

import java.util.*;

public class Knight {
	
	private int xCoord;//as the x space on the board
	private int yCoord;//as the y space on the board
	
	Random generator = new Random();//this instantiates a new random generator
	
	/**
	 * My empty constructor initializes a new knight object.
	 * 
	 */
	
	public Knight() {
		
		
	}//end empty-constructor
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveUpRight() {
		
		if(this.xCoord - 2 >= 0 && this.yCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
		}//end if
		
	}//end checkMoveUpRight
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveUpRight() {
			
			this.xCoord = this.xCoord - 2;
			this.yCoord = this.yCoord + 1;
			
	}//end moveDownRight
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveUpLeft() {
		
		if(this.xCoord - 2 >= 0 && this.yCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveUpLeft
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveUpLeft() {
			
			this.xCoord = this.xCoord - 2;
			this.yCoord = this.yCoord - 1;
		
	}//end moveDownLeft
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveDownRight() {
		
		if(this.xCoord + 2 < 8 && this.yCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveDownRight
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveDownRight() {
			
			this.xCoord = this.xCoord + 2;
			this.yCoord = this.yCoord + 1;
		
	}//end moveUpRight
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveDownLeft() {
		
		if(this.xCoord + 2 < 8 && this.yCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveDownLeft
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveDownLeft() {
			
			this.xCoord = this.xCoord + 2;
			this.yCoord = this.yCoord - 1;
			
	}//end moveUpLeft
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveLeftDown() {
		
		if(this.yCoord - 2 >= 0 && this.xCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveLeftDown
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveLeftDown() {
			
			this.yCoord = this.yCoord - 2;
			this.xCoord = this.xCoord + 1;
			
	}//end moveRightUp
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveLeftUp() {
		
		if(this.yCoord - 2 >= 0 && this.xCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveLeftUp
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveLeftUp() {
			
			this.yCoord = this.yCoord - 2;
			this.xCoord = this.xCoord - 1;
			
	}//end moveRightDown
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveRightDown() {
		
		if(this.yCoord + 2 < 8 && this.xCoord + 1 < 8) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveRightDown
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveRightDown() {
			
			this.yCoord = this.yCoord + 2;
			this.xCoord = this.xCoord + 1;
		
	}//end moveLeftUp
	
	/**
	 * This method checks whether or not a move is possible
	 * by checking to see if it is within the bounds of an array.
	 * @return
	 */
	
	public boolean checkMoveRightUp() {
		
		if(this.yCoord + 2 < 8 && this.xCoord - 1 >= 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end if
		
	}//end checkMoveRightUp
	
	/**
	 * This method changes my xCoord and yCoord values to move
	 * the piece
	 */
	
	public void moveRightUp() {
		
			this.yCoord = this.yCoord + 2;
			this.xCoord = this.xCoord - 1;
			
	}//end moveLeftDown
	
	/**
	 * This method uses the setxCoord and setyCoord methods to set the random start position on
	 * the board.
	 */
	
	public void setStartPos() {
		
		setxCoord();
		setyCoord();
		
	}//end setStartPos()
	
	/**
	 * This method returns your current [x,y] coordinate.
	 * @return
	 */
	
	public String getPos() {
		
		return "Your position on the board is: [" + this.xCoord + " , " + this.yCoord + "].";
		
	}//end setGetPos

	/**
	 * This method returns your current x coordinate.
	 * @return
	 */
	
	public int getxCoord() {
		
		return this.xCoord;
		
	}//end getxCoord

	/**
	 * This method uses a random generator to produce a random value to set the x coordinate.
	 */
	
	private void setxCoord() {
		
		this.xCoord = generator.nextInt(8);
		
	}//end setxCoord

	/**
	 * This method returns the current y coordinate.
	 * @return
	 */
	
	public int getyCoord() {
		
		return this.yCoord;
		
	}//end getyCoord

	/**
	 * This method uses a random generator to produce a random value to set the y coordinate.
	 */
	
	private void setyCoord() {
		
		this.yCoord = generator.nextInt(8);
		
	}//end setyCoord

}//end class