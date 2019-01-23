package boardgame.test;


import org.junit.Assert;
import org.junit.Test;

import boardgame.Board;
import boardgame.Piece;

public class PieceTest {

	@Test
	public void testGetBoard() {
		// Scenario
		Board board = new Board(7,8);
		Piece piece = new Piece(board);
		
		//Action 
		String boardString = piece.toString();
		
	
		//System.out.println(boardString);
		
		//Verification
		Assert.assertTrue(boardString.equals("Piece [position=null, board=7,8]"));
	}

	@Test
	public void testToString() {
		// Scenario
		Board board = new Board(7,8);
		Piece piece = new Piece(board);
		
		//Action 
		String boardString = piece.toString();
		
	
		//System.out.println(boardString);
		
		//Verification
		Assert.assertTrue(boardString.equals("Piece [position=null, board=7,8]"));
	}

}
