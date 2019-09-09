/**
 * This method makes an attempt to complete a knight's tour using a specific
 * pattern of moves.
 * 
 * @author christinaporter
 * @version 09-09-2019
 * Knight's Tour Project
 * Fall 2019
 */


import java.io.FileWriter;
import java.io.IOException;

public class NoHeuristic {

	public static void main(String[] args) {
		
		FileWriter tourResults = null;//This initializes my filewriter object
		
		try {
		
			try {
				tourResults = new FileWriter("NoHeuristicResults.txt");//This creates my text file
			
				//This will run my program 100 times
				for(int i = 1; i < 1001; i++) {
					
					Knight knight = new Knight();//This instantiates my knight object
					Board board = new Board();//This instantiates a blank board object.
					int z = 0;//This initializes my counter for moves.
					
					knight.setStartPos();//This sets my start position on the board.
			
					//These values are set to my start position so I can access them later.
					int startx = knight.getxCoord();
					int starty = knight.getyCoord();
					
					board.setVisited(knight.getxCoord(), knight.getyCoord(), 0);
					
					//This loop will iterate 64 times to represent the number of possible spaces/moves
					//on the board.
					for(int j = 1; j < 65; j++) {
						
						//This if statement will check to see if a move is legal and has not been
						//visited before. If it has not, then it will make the first move that works
						//then restart and increasing the move counter. If there are no possible
						//moves, it will return nothing.
						if(knight.checkMoveUpRight() != false && board.checkSpace(knight.getxCoord() - 2,knight.getyCoord() + 1) == 0) {
							knight.moveUpRight();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveUpLeft() != false && board.checkSpace(knight.getxCoord() - 2,knight.getyCoord() - 1) == 0) {
							
							knight.moveUpLeft();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveDownRight() != false && board.checkSpace(knight.getxCoord() + 2,knight.getyCoord() + 1) == 0) {
							
							knight.moveDownRight();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveDownLeft() != false && board.checkSpace(knight.getxCoord() + 2,knight.getyCoord() - 1) == 0) {
							
							knight.moveDownLeft();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveLeftDown() != false && board.checkSpace(knight.getxCoord() + 1,knight.getyCoord() - 2) == 0) {
							
							knight.moveLeftDown();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveLeftUp() != false && board.checkSpace(knight.getxCoord() - 1,knight.getyCoord() - 2) == 0) {
							
							knight.moveLeftUp();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveRightDown() != false && board.checkSpace(knight.getxCoord() + 1,knight.getyCoord() + 2) == 0) {
							
							knight.moveRightDown();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else if(knight.checkMoveRightUp() != false && board.checkSpace(knight.getxCoord() - 1,knight.getyCoord() + 2) == 0) {
							
							knight.moveRightUp();
							z++;
							board.setVisited(knight.getxCoord(), knight.getyCoord(), z);
							
						}else {
							
							
						}//end nested-if statement
					
					}//end for
					
					//This will check whether or not there was a complete tour before printing
					//the values to the document.
					if(startx == knight.getxCoord() && starty == knight.getyCoord() && z == 64) {
						
						tourResults.write("[" + startx + " , " + starty + "]" + " , " + z + " , " + "[" + knight.getxCoord() + " , " + knight.getyCoord() + "]*" + System.getProperty("line.separator"));
						
					}else {
						
						tourResults.write("[" + startx + " , " + starty + "]" + " , " + z + " , " + "[" + knight.getxCoord() + " , " + knight.getyCoord() + "]" + System.getProperty("line.separator"));
					}//end else
					
				}//end for
				
			//This will close my document after my loop.
			}finally {
	
			tourResults.close();
			
			}//end finally
			
		//This catches any IO Exception that may occur and prints it to the screen.
		}catch(IOException exception) {
			
			System.out.println(exception);
			
		}//end catch
		
	}//end main

}//end class