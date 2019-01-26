package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {

		// TODO Auto-generated method stub
		boolean possibleMoves[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
//		ChessPiece[][] piecesMat = getPieces()
//		for(int i = 0; i < )
		
		
		return possibleMoves;
	}
}
