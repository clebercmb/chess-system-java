package boardgame;


import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

	
	@Test(expected = BoardException.class)  
	public void testNewBoard() {
		new Board(-1,8);
	}

	@Test(expected = BoardException.class)  
	public void testNewBoard2() {
		new Board(8,-1);
		
	}

	
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
	public void testGetColumns() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		int rows = board.getColumns();
		
		//Validation
		Assert.assertEquals(String.valueOf(rows), "8");
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

	@Test(expected = BoardException.class)  
	public void  testPiece3() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (-3,4);

		//Action  and Validation
		board.piece(position);		
	}
	
	@Test(expected = BoardException.class)  
	public void  testPiece4() {
		//Scenario
		Board board = new Board(8,8);
		
		//Action and Validation
		board.piece(-3,4);	
	}
	
	@Test(expected = BoardException.class)  
	public void  testPlacePiece() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new Piece(board);
		Position position = new Position (3,4);
		piece.setPosition(position);		
		board.placePiece(piece, position);

		Piece piece2 = new Piece(board);
		Position position2 = new Position (3,4);
		
		//Action and Validation
		board.placePiece(piece2, position2);

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


	
	@Test
	public void  testPositioExists() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new Piece(board);
		Position position = new Position (3,4);
		piece.setPosition(position);		
		board.placePiece(piece, position);
		
		//Action
		boolean positionExist = board.positioExists(position);
		
		//Validation		
		Assert.assertTrue(positionExist);
	}

	@Test
	public void  testPositioExists2() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (9,4);
		
		//Action
		boolean positionExist = board.positioExists(position);
		
		//Validation		
		Assert.assertFalse(positionExist);
	}	
	
	@Test
	public void  testPositioExists3() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (-6,5);
		
		//Action
		boolean positionExist = board.positioExists(position);
		
		//Validation		
		Assert.assertFalse(positionExist);
	}	

	@Test
	public void  testPositioExists4() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (3,-2);
		
		//Action
		boolean positionExist = board.positioExists(position);
		
		//Validation		
		Assert.assertFalse(positionExist);
	}	

	@Test
	public void  testPositioExists5() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (-3,-2);
		
		//Action
		boolean positionExist = board.positioExists(position);
		
		//Validation		
		Assert.assertFalse(positionExist);
	}	
	
	@Test
	public void  testPositioExists6() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (3,10);
		
		//Action
		boolean positionExist = board.positioExists(position);
		
		//Validation		
		Assert.assertFalse(positionExist);
	}		

	@Test
	public void  testThereIsAPiece() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new Piece(board);
		Position position = new Position (3,4);
		piece.setPosition(position);		
		board.placePiece(piece, position);
		
		//Action
		boolean hasPiece = board.thereIsAPiece(position);
		
		//Validation		
		Assert.assertTrue(hasPiece);
	}	
	
		
	@Test
	public void  testThereIsAPiece2() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (3,4);
		
		//Action
		boolean hasPiece = board.thereIsAPiece(position);
		
		//Validation		
		Assert.assertFalse(hasPiece);
	}		
	
	@Test(expected = BoardException.class)  
	public void  testThereIsAPiece3() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (-2,4);
		
		//Action and validation
		board.thereIsAPiece(position);
	}	
	
	@Test
	public void testRemovePiece() {
		//Scenario
		Board board = new Board(8,8);
		Piece piece = new Piece(board);
		Position position = new Position (3,4);
		piece.setPosition(position);		
		board.placePiece(piece, position);
		
		//Action
		Piece pieceToBeRemove = board.removePiece(position);

		//Validations		
		Assert.assertEquals( null, board.piece(position));
		Assert.assertEquals( piece, pieceToBeRemove);		
	}

	@Test(expected = BoardException.class)  
	public void testRemovePiece2() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (-3,4);
		
		//Action and Validation
		board.removePiece(position);

	}
	
	@Test  
	public void testRemovePiece3() {
		//Scenario
		Board board = new Board(8,8);
		Position position = new Position (3,4);
		
		//Action 
		Piece pieceToBeRemove = board.removePiece(position);

		//Validation
		Assert.assertEquals(null, pieceToBeRemove);
	}

	
	
}
