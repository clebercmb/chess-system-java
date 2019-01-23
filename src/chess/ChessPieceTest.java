package chess;


import org.junit.Assert;
import org.junit.Test;

import boardgame.Board;

public class ChessPieceTest {

	@Test
	public void testGetBoard() {
		//Scenario
		Board board = new Board(8,8);
		Color white = Color.WHITE;
		ChessPiece chessPiece =  new ChessPiece(board, white);
		
		//Action
		Color pieceColor  =  chessPiece.getColor();
		
		//Validation
		Assert.assertEquals(pieceColor, Color.WHITE);
	}

}
