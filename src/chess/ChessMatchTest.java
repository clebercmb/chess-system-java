package chess;
import org.junit.Assert;
import org.junit.Test;



public class ChessMatchTest {

	@Test
	public void testGetPieces() {
		//Scenario
		ChessMatch chessMatch = new ChessMatch();
		
		//Action
		ChessPiece[][] pieces = chessMatch.getPieces();
		
		//Validation
		//System.out.println(pieces.length);
		Assert.assertEquals(String.valueOf(pieces.length), "8");

	}

	
	@Test
	public void testGetPieces2() {
		//Scenario
		ChessMatch chessMatch = new ChessMatch();
		
		//Action
		ChessPiece[][] pieces = chessMatch.getPieces();
		
		//Validation
		//System.out.println(pieces.length);
		Assert.assertEquals(String.valueOf(pieces.length), "8");

	}
	
	@Test
	public void testPerformChessMove() {
		//Scenario
		ChessMatch chessMatch = new ChessMatch();
		ChessPiece[][] chessPieces = chessMatch.getPieces();
		ChessPiece pieceSource = chessPieces[1][2];

		ChessPosition sourcePosition = new ChessPosition('c',7);
		ChessPosition targetPosition = new ChessPosition('c',6);
		
		//Action
		ChessPiece piece = chessMatch.performChessMove(sourcePosition, targetPosition);
		ChessPiece pieceTarget = chessMatch.getPieces()[2][2];
		
		//Validation
		Assert.assertEquals(pieceTarget, pieceSource );
		Assert.assertNull(piece);

	}
	
	@Test
	public void testPerformChessMove2() {
		//Scenario
		ChessMatch chessMatch = new ChessMatch();
		ChessPiece[][] chessPieces = chessMatch.getPieces();
		ChessPiece pieceSource = chessPieces[0][3];
		ChessPiece pieceTarget = chessPieces[7][4];

		ChessPosition sourcePosition = new ChessPosition('d',8);
		ChessPosition targetPosition = new ChessPosition('e',1);
		
		//Action
		ChessPiece piece = chessMatch.performChessMove(sourcePosition, targetPosition);
		ChessPiece pieceTarget2 = chessMatch.getPieces()[7][4];
			
		//Validation
		Assert.assertEquals(pieceTarget2, pieceSource );
		Assert.assertEquals(piece, pieceTarget);

	}
	

	@Test(expected = ChessException.class)  
	public void testPerformChessMove3() {
		//Scenario
		ChessMatch chessMatch = new ChessMatch();

		ChessPosition sourcePosition = new ChessPosition('c',5);
		ChessPosition targetPosition = new ChessPosition('e',1);
		
		//Action and Validation
		chessMatch.performChessMove(sourcePosition, targetPosition);

	}
	
	
}
