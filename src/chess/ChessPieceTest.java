package chess;


import org.junit.Assert;
import org.junit.Test;

import boardgame.Board;
import chess.pieces.King;

public class ChessPieceTest {

	@Test
	public void testGetBoard() {
		//Scenario
		Board board = new Board(8,8);
		Color white = Color.WHITE;
		ChessPiece chessPiece =  new King(board, white, new ChessMatch());
		
		//Action
		Color pieceColor  =  chessPiece.getColor();
		
		//Validation
		Assert.assertEquals(pieceColor, Color.WHITE);
	}

}
