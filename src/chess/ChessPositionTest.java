package chess;


import org.junit.Assert;
import org.junit.Test;

import boardgame.Position;

public class ChessPositionTest {

	@Test
	public void testChessPosition() {
		new ChessPosition('a', 6);
	}

	@Test(expected = ChessException.class)  
	public void testChessPosition2() {
		new ChessPosition( (char )('a' - 1) , 6);

	}

	@Test(expected = ChessException.class)  
	public void testChessPosition3() {
		new ChessPosition( (char )('h' + 1) , 6);

	}

	@Test(expected = ChessException.class)  
	public void testChessPosition4() {
		new ChessPosition( 'a' , -1);

	}

	@Test(expected = ChessException.class)  
	public void testChessPosition5() {
		new ChessPosition( 'a' , 9);

	}

	
	@Test
	public void testToPosition() {
		//Scenario
		ChessPosition ver = new ChessPosition('e',8);
		
		//Action 
		Position position = ver.toPosition();
		
		//Validation
		Assert.assertEquals("0,4", position.toString());
	
	}

	@Test
	public void testFromPosition() {
		//Scenario
		Position position =  new Position(0,4);
		
		//Action
		ChessPosition chessPosition = ChessPosition.fromPosition(position);
		
		//Validation
		Assert.assertEquals("e8", chessPosition.toString());

	}

	@Test
	public void testGetColumn() {
		//Scenario
		ChessPosition ver = new ChessPosition('e',8);
		
		//Action 
		char column = ver.getColumn();
		

		//Validation
		Assert.assertEquals('e', column);
	}

	@Test
	public void testGetRow() {
		//Scenario
		ChessPosition ver = new ChessPosition('e',8);
		
		//Action 
		int row = ver.getRow();
		

		//Validation
		Assert.assertEquals(8, row);
	}

	@Test
	public void testToString() {
		//Scenario
		ChessPosition ver = new ChessPosition('e',8);
		
		//Action 
		String out = ver.toString();
		

		//Validation
		Assert.assertEquals("e8", out);
	}

}
