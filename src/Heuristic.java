/**
 * This method implements my HeuristicKnight, HeuristicBoard, and Board classes in
 * an attempt to create a full knight's tour based off of heuristics.
 * @author christinaporter
 * @version 09-09-2019
 * Knight's Tour Project
 * Fall 2019
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class Heuristic {

	public static void main(String[] args) {
		
		FileWriter tourResults = null;//initializes my filewriter object
		
		int upRightValue;//This is used to hold the heuristic value for move up and right.
		int upLeftValue;//This is used to hold the heuristic value for move up and left.
		int downRightValue;//This is used to hold the heuristic value for move down and right.
		int downLeftValue;//This is used to hold the heuristic value for move down and left.
		int leftDownValue;//This is used to hold the heuristic value for move left and down.
		int leftUpValue;//This is used to hold the heuristic value for move left and up.
		int rightDownValue;//This is used to hold the heuristic value for move right and down.
		int rightUpValue;//This is used to hold the heuristic value for move right and up.
		
		//This will catch my IO Exception.
		try {
			
			try {
				tourResults = new FileWriter("HeuristicResults.txt");//creates my text file
		
				//This loop will iterate through to determine the different starting 
				//positions for each run.
				for(int x = 0; x < 8; x++) {
					for(int y = 0; y < 8; y++) {
				
					//A new heuristicKnight object is created for each different starting value.	
					HeuristicKnight heuristicKnight = new HeuristicKnight();
					
					//A new Board object is created for each different starting value.
					Board board = new Board();
					
					//The counter for z is reset for each different starting value.
					int z = 0;//Counts how many moves have been taken for each starting value.
					
					heuristicKnight.setStartPos(x,y);
					
					int startx = heuristicKnight.getxCoord();//This will be used to refer back to my starting x value.
					int starty = heuristicKnight.getyCoord();//This will be used to refer back to my starting y value.
					
					board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), 64);//This sets my starting value to 64 so it cannot be moved to.
					
					
					//This value represents the number of possible moves per run. This is determined 
					//as 64 because there are 64 spaces on the board, and therefore, 64 possible moves.
					for(int i = 0; i < 64; i++) {
					
						//This statement calls the checkMoveUpRight method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveUpRight() != false && board.checkSpace(heuristicKnight.getxCoord() - 2, heuristicKnight.getyCoord() + 1) <= 0) {
							
							upRightValue = heuristicKnight.heuristicValueUpRight();
							
						}else {
							
							upRightValue = 10;
							
						}//end ifUpRightValue
						
						//This statement calls the checkMoveUpLeft method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveUpLeft() != false && board.checkSpace(heuristicKnight.getxCoord() - 2, heuristicKnight.getyCoord() - 1 ) <= 0) {
							
							upLeftValue = heuristicKnight.heuristicValueUpLeft();
							
						}else {
							
							upLeftValue = 10;
							
						}//end ifUpLeftValue
						
						//This statement calls the checkMoveDownRight method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveDownRight() != false && board.checkSpace(heuristicKnight.getxCoord() +2, heuristicKnight.getyCoord() + 1) <= 0) {
							
							downRightValue = heuristicKnight.heuristicValueDownRight();
							
						}else {
							
							downRightValue = 10;
							
						}//end ifDownRightValue
						
						//This statement calls the checkMoveDownLeft method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveDownLeft() != false && board.checkSpace(heuristicKnight.getxCoord() + 2, heuristicKnight.getyCoord() - 1) <= 0) {
							
							downLeftValue = heuristicKnight.heuristicValueDownLeft();
							
						}else {
							
							downLeftValue = 10;
							
						}//end ifDownLeftValue
						
						//This statement calls the checkMoveLeftDown method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveLeftDown() != false && board.checkSpace(heuristicKnight.getxCoord() + 1, heuristicKnight.getyCoord() - 2) <= 0) {
							
							leftDownValue = heuristicKnight.heuristicValueLeftDown();
							
						}else {
							
							leftDownValue = 10;
							
						}//end ifLeftDownValue
						
						//This statement calls the checkMoveLeftUp method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveLeftUp() != false && board.checkSpace(heuristicKnight.getxCoord() - 1, heuristicKnight.getyCoord() - 2) <= 0) {
							
							leftUpValue = heuristicKnight.heuristicValueLeftUp();
							
						}else {
							
							leftUpValue = 10;
							
						}//end ifLeftUpValue
						
						//This statement calls the checkMoveRightDown method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveRightDown() != false && board.checkSpace(heuristicKnight.getxCoord() + 1, heuristicKnight.getyCoord() + 2) <= 0) {
							
							rightDownValue = heuristicKnight.heuristicValueRightDown();
							
						}else {
							
							rightDownValue = 10;
							
						}//end ifRightDownValue
						
						//This statement calls the checkMoveRightUp method to determine whether or not this move is possible and
						//checks that the space has not already been moved to. If these parameters are met, the method
						//retrieves the value of the heuristic from the space. If these parameters are not met, the method
						//sets the heuristic value as 10.
						if(heuristicKnight.checkMoveRightUp() != false && board.checkSpace(heuristicKnight.getxCoord() - 1, heuristicKnight.getyCoord() + 2) <= 0) {
							
							rightUpValue = heuristicKnight.heuristicValueRightUp();
							
						}else {
							
							rightUpValue = 10;
							
						}//end ifRightUpValue
						
						
						
						//This if checks to make sure that the values are valid and not equal to -10 first
						//then compares the value to see if it is less than or equal to all of the other
						//values. If it is, then the move is officially made on Board and the number of moves
						//is increased.
						if(upRightValue != 10 && upRightValue <= upLeftValue && upRightValue <= downRightValue && upRightValue <= downLeftValue
								&& upRightValue <= leftDownValue && upRightValue <= leftUpValue && upRightValue <= rightDownValue
								&& upRightValue <= rightUpValue) {
							
							heuristicKnight.moveUpRight();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(upLeftValue != 10 && upLeftValue <= upRightValue && upLeftValue <= downRightValue && upLeftValue <= downLeftValue
								&& upLeftValue <= leftDownValue && upLeftValue <= leftUpValue && upLeftValue <= rightDownValue
								&& upLeftValue <= rightUpValue) {
							
							heuristicKnight.moveUpLeft();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(downRightValue != 10 && downRightValue <= upRightValue && downRightValue <= upLeftValue && downRightValue <= downLeftValue
								&& downRightValue <= leftDownValue && downRightValue <= leftUpValue && downRightValue <= rightDownValue
								&& downRightValue <= rightUpValue) {
							
							heuristicKnight.moveDownRight();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(downLeftValue != 10 && downLeftValue <= upRightValue && downLeftValue <= upLeftValue && downLeftValue <= downRightValue
								&& downLeftValue <= leftDownValue && downLeftValue <= leftUpValue && downLeftValue <= rightDownValue
								&& downLeftValue <= rightUpValue) {
							
							heuristicKnight.moveDownLeft();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(leftDownValue != 10 && leftDownValue <= upRightValue && leftDownValue <= upLeftValue && leftDownValue <= downRightValue
								&& leftDownValue <= downLeftValue && leftDownValue <= leftUpValue && leftDownValue <= rightDownValue
								&& leftDownValue <= rightUpValue) {
							
							heuristicKnight.moveLeftDown();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(leftUpValue != 10 && leftUpValue <= upRightValue && leftUpValue <= upLeftValue && leftUpValue <= downRightValue
								&& leftUpValue <= downLeftValue && leftUpValue <= leftDownValue && leftUpValue <= rightDownValue 
								&& leftUpValue <= rightUpValue) {
							
							heuristicKnight.moveLeftUp();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(rightDownValue != 10 && rightDownValue <= upRightValue && rightDownValue <= upLeftValue && rightDownValue <= downRightValue
								&& rightDownValue <= downLeftValue && rightDownValue <= leftDownValue && rightDownValue <= leftUpValue
								&& rightDownValue <= rightUpValue) {
							
							heuristicKnight.moveRightDown();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						}else if(rightUpValue != 10 && rightUpValue <= upRightValue && rightUpValue <= upLeftValue && rightUpValue <= downRightValue
								&& rightUpValue <= downLeftValue && rightUpValue <= leftDownValue && rightUpValue <= leftUpValue
								&& rightUpValue <= rightDownValue) {
							
							heuristicKnight.moveRightUp();
							z++;
							board.setVisited(heuristicKnight.getxCoord(), heuristicKnight.getyCoord(), z);
							
						//If a move is not made, which in this case means there are no more possible moves,
						//then the statement will not return or make a move.
						}else {
							
						}//end if statement
						
					}//end for statement for one board
					
					//This checks whether or not a full tour was made before printing out to the screen.
					if(startx == heuristicKnight.getxCoord() && starty == heuristicKnight.getyCoord() && z == 64) {
						
						tourResults.write("[" + startx + " , " + starty + "]" + " , " + z + " , " + "[" + heuristicKnight.getxCoord() + " , " + heuristicKnight.getyCoord() + "]*" + System.getProperty("line.separator"));
						
					}else {
						
						tourResults.write("[" + startx + " , " + starty + "]" + " , " + z + " , " + "[" + heuristicKnight.getxCoord() + " , " + heuristicKnight.getyCoord() + "]" + System.getProperty("line.separator"));
					}//end else
					
				
					}//end for y
				}//end for x
				
				//This will close my document.
			}finally {
				tourResults.close();
				}//end finally
				
		//This will catch any IOException that may occur and print it to the screen
		//before continuing with the code.
		}catch(IOException exception) {
			System.out.println(exception);
		}//end catch
			
	}//end main

}//end Heuristic
