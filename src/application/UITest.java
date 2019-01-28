package application;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;
import chess.pieces.King;

public class UITest {

	@Test
	public void testPrintBoard() {
		// Scenario
		ChessMatch chessMatch = new ChessMatch();

		// Action / Validation
		UI.printBoard(chessMatch.getPieces());
	}

	@Test
	public void testPrintBoard2() {
		// Scenario
		ChessPiece[][] chessPiece = new ChessPiece[8][8];

		// Action / Validation
		UI.printBoard(chessPiece);
	}

	@Test
	public void testPrintBoard3() {
		// Scenario
		ChessPiece[][] chessPiece = new ChessPiece[8][8];
		Board board = new Board(8, 8);
		chessPiece[0][0] = new King(board, Color.WHITE,  new ChessMatch());
		UI ui = new UI();
		ui.toString();

		// Action / Validation
		UI.printBoard(chessPiece);
	}

	@Test
	public void testReadChessPosition() {

		//Scenario
		String data = "a8";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);

		// Action
		ChessPosition chessPosition = UI.readChessPosition(scanner);

		// Action / Validation
		Assert.assertEquals("a8", chessPosition.toString());
	}

	@Test(expected = InputMismatchException.class)  
	public void testReadChessPosition2() {

		//Scenario
		String data = "aa";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);

		// Action and Validation
		UI.readChessPosition(scanner);
	}	
	
}
