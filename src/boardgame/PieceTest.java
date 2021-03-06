package boardgame;


import org.junit.Assert;
import org.junit.Test;

import chess.ChessMatch;
import chess.Color;
import chess.pieces.King;

public class PieceTest {

	@Test
	public void testGetBoard() {
		// Scenario
		Board board = new Board(7,8);
		Piece piece = new King(board, Color.BLACK, new ChessMatch());
		
		//Action 
		String boardString = piece.toString();
		
	
		//System.out.println(boardString);
		
		//Verification
		Assert.assertTrue(boardString.equals("Piece [position=null, board=7,8]"));
	}

	
	@Test
	public void testGetBoard2() {
		Board board = new Board(8,8);
		Piece piece = new King(board, Color.BLACK, new ChessMatch());
		
		//Action
		Board boardTest = piece.getBoard();
		
		//Validation		
		Assert.assertTrue(boardTest.equals(board));
		
	}

	@Test
	public void testGetPosition() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new King(board, Color.BLACK, new ChessMatch());
		Position position = new Position (3,4);
		piece.setPosition(position);		
		
		//Action
		Position postionTest = piece.getPosition();
		
		//Validation		
		Assert.assertTrue(postionTest.equals(position));		
	}
	
	
	@Test
	public void testToString() {
		// Scenario
		Board board = new Board(7,8);
		Piece piece = new King(board, Color.BLACK, new ChessMatch());
		
		//Action 
		String boardString = piece.toString();
		
	
		//System.out.println(boardString);
		
		//Verification
		Assert.assertTrue(boardString.equals("Piece [position=null, board=7,8]"));
	}

}
