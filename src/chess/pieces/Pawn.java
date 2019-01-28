package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);

	}

	@Override
	public boolean[][] possibleMoves() {
		boolean possibleMoves[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		if (getColor() == Color.WHITE) {
			p.setValues(position.getRow() - 1, position.getColumn());
			if (getBoard().positioExists(p) && !getBoard().thereIsAPiece(p) ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow() - 2, position.getColumn());
			Position p2 = new Position (position.getRow() - 1, position.getColumn());
			if (getBoard().positioExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positioExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0 ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}

			p.setValues(position.getRow() - 1, position.getColumn()-1);
			if (getBoard().positioExists(p) && isThereOpponentPiece(p) ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow() - 1, position.getColumn()+1);
			if (getBoard().positioExists(p) && isThereOpponentPiece(p) ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
			
		} 
		else {

			p.setValues(position.getRow() + 1, position.getColumn());
			if (getBoard().positioExists(p) && !getBoard().thereIsAPiece(p) ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}

/*			
			p.setValues(position.getRow() + 2, position.getColumn());
			Position p2 = new Position (position.getRow() - 1, position.getColumn());
			if (getBoard().positioExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positioExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0 ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
*/
			
			p.setValues(position.getRow() +2, position.getColumn());
			Position p2 = new Position (position.getRow() + 1, position.getColumn());
			if (getBoard().positioExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positioExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0 ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
		
			
			p.setValues(position.getRow() + 1, position.getColumn()-1);
			if (getBoard().positioExists(p) && isThereOpponentPiece(p) ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow() + 1, position.getColumn()+1);
			if (getBoard().positioExists(p) && isThereOpponentPiece(p) ) {
				possibleMoves[p.getRow()][p.getColumn()] = true;
			}
			
		}
		
	
		return possibleMoves;
	}

	@Override
	public String toString() {
		return "P";
	}

}
