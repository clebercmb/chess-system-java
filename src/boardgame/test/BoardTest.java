package boardgame.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import boardgame.Board;

public class BoardTest {

	@Test
	public void testGetRows() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		int rows = board.getRows();
		
		//Validation
		Assert.assertTrue(rows == 7);
		
	}

	@Test
	public void testSetRows() {

		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		board.setRows(9);
		int rows = board.getRows();
		
		//Validation
		Assert.assertTrue(rows == 9);

	}

	@Test
	public void testGetColumns() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		int rows = board.getColumns();
		
		//Validation
		Assert.assertTrue(rows == 8);
	}

	@Test
	public void testSetColumns() {
		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		board.setColumns(10);
		int columns = board.getColumns();
		
		//Validation
		Assert.assertTrue(columns == 10);
	}


	@Test
	public void testToString() {

		// Scenario
		Board board = new Board(7,8);
		
		//Action 
		String boardString = board.toString();
		
		//Validation
		Assert.assertTrue(boardString.equals("7,8"));
	}

}
