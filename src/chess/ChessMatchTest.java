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

}
