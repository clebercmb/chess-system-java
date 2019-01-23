package boardgame;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {


	@Test
	public void testGetRow() {
		
		//Scenario
		Position position = new Position(3, 5);
		
		//Action 
		int row = position.getRow();
		
		//Verification
		Assert.assertEquals( String.valueOf(row), "3");
//		Assert.assertTrue(row == 3);

	}

	@Test
	public void testSetRow() {

		//Scenario
		Position position = new Position();
		
		//Action 
		position.setRow(3);
		int row = position.getRow();
		
		//Verification
		Assert.assertEquals(String.valueOf(row), "3");

		
	}

	@Test
	public void testGetColumn() {
		//Scenario
		Position position = new Position(3,5);
		
		//Action 
		int column = position.getColumn();
		
		//Verification
		Assert.assertEquals(String.valueOf(column), "5");
	}

	@Test
	public void testSetColumn() {
		//Scenario
		Position position = new Position();
		
		//Action 
		position.setColumn(5);
		int column = position.getColumn();
		
		//Verification
		Assert.assertEquals(String.valueOf(column), "5");
	}

	@Test
	public void testToString() {
		//Scenario
		Position position = new Position(3,5);
		
		//Action 
		String text = position.toString();
		
		//Verification
		Assert.assertEquals(text, "3,5");
		
		
	}

}
