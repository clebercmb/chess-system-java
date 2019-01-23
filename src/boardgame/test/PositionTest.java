package boardgame.test;

import org.junit.Assert;
import org.junit.Test;

import boardgame.Position;

public class PositionTest {


	@Test
	public void testGetRow() {
		
		//Scenario
		Position position = new Position(3, 5);
		
		//Action 
		int row = position.getRow();
		
		//Verification
		Assert.assertTrue(row == 3);
	}

	@Test
	public void testSetRow() {

		//Scenario
		Position position = new Position();
		
		//Action 
		position.setRow(3);
		int row = position.getRow();
		
		//Verification
		Assert.assertTrue(row == 3);
		
	}

	@Test
	public void testGetColumn() {
		//Scenario
		Position position = new Position(3,5);
		
		//Action 
		int column = position.getColumn();
		
		//Verification
		Assert.assertTrue(column == 5);
	}

	@Test
	public void testSetColumn() {
		//Scenario
		Position position = new Position();
		
		//Action 
		position.setColumn(5);
		int column = position.getColumn();
		
		//Verification
		Assert.assertTrue(column == 5);
	}

	@Test
	public void testToString() {
		//Scenario
		Position position = new Position(3,5);
		
		//Action 
		String text = position.toString();
		
		//Verification
		Assert.assertTrue(text.equals("3,5"));
		
		
	}

}
