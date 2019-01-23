package application;



import org.junit.Test;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class UITest {

	@Test
	public void testPrintBoard() {
		//Scenario
		ChessMatch chessMatch = new ChessMatch();
		
		//Action / Validation
		UI.printBoard(chessMatch.getPieces());
	}

	@Test
	public void testPrintBoard2() {
		//Scenario
		ChessPiece[][] chessPiece = new ChessPiece[8][8];
		
		//Action / Validation
		UI.printBoard(chessPiece);
	}
	
	@Test
	public void testPrintBoard3() {
		//Scenario
		ChessPiece[][] chessPiece = new ChessPiece[8][8];
		Board board = new Board(8,8);
		chessPiece[0][0] = new ChessPiece(board, Color.WHITE);		
		UI ui = new UI();
		ui.toString();
		
		//Action / Validation
		UI.printBoard(chessPiece);
	}	
	
}
