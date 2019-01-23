package boardgame;


import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testGetRows() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		int rows = board.getRows();
		
		//Validation
		Assert.assertEquals(String.valueOf(rows), "7");
		
	}

	@Test
	public void testSetRows() {

		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		board.setRows(9);
		int rows = board.getRows();
		
		//Validation
		Assert.assertEquals(String.valueOf(rows), "9");

	}

	@Test
	public void testGetColumns() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		int rows = board.getColumns();
		
		//Validation
		Assert.assertEquals(String.valueOf(rows), "8");
	}

	@Test
	public void testSetColumns() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		board.setColumns(10);
		int columns = board.getColumns();
		
		//Validation
		Assert.assertEquals(String.valueOf(columns), "10");
	}

	@Test
	public void  testPiece() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new Piece(board);
		Position position = new Position (3,4);
		piece.setPosition(position);		
		board.placePiece(piece, position);
		
		//Action
		Piece  pieceTest = board.piece(position);
		
		//Validation		
		Assert.assertEquals(pieceTest, piece);
	}
	

	@Test
	public void  testPiece2() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new Piece(board);
		Position position = new Position (3,4);
		piece.setPosition(position);		
		board.placePiece(piece, position);
		
		//Action
		Piece  pieceTest = board.piece(3,4);
		
		//Validation		
		Assert.assertEquals(pieceTest, piece);
	}

	
	
	@Test
	public void testToString() {

		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		String boardString = board.toString();
		
		//Validation
		Assert.assertEquals(boardString, "7,8");
	}

	
	
	
}
