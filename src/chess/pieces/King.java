package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	private ChessMatch chessMatch;
	
	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean possibleMoves[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//above
		p.setValues(position.getRow()-1, position.getColumn());
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}

		//bellow
		p.setValues(position.getRow()+1, position.getColumn());
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//left
		p.setValues(position.getRow(), position.getColumn()-1);
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}

		//right
		p.setValues(position.getRow(), position.getColumn()+1);
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//nw
		p.setValues(position.getRow()-1, position.getColumn()-1);
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}

		//ne
		p.setValues(position.getRow()+1, position.getColumn()+1);
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//sw
		p.setValues(position.getRow()+1, position.getColumn()-1);
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
	
		//se
		p.setValues(position.getRow()+1, position.getColumn()+1);
		if(  getBoard().positioExists(p) && canMove(p) ) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//#special move castling
		if(getMoveCount() == 0 && !chessMatch.getCheck()) {
			//special move castling king side rook
			Position posT1 = new Position(position.getRow(), position.getColumn()+3);
			if (testRookCastling(posT1)) {
				Position p1 = new Position (position.getRow(), position.getColumn()+1);
				Position p2 = new Position (position.getRow(), position.getColumn()+2);
				
				if ( getBoard().piece(p1) == null && getBoard().piece(p2) == null ) {
					possibleMoves[position.getRow()][position.getColumn()+2] = true;										
				}				
			}

			//special move castling queen side rook
			Position posT2 = new Position(position.getRow(), position.getColumn()-4);
			if (testRookCastling(posT2)) {
				Position p1 = new Position (position.getRow(), position.getColumn()-1);
				Position p2 = new Position (position.getRow(), position.getColumn()-2);
				Position p3 = new Position (position.getRow(), position.getColumn()-3);
				
				if ( getBoard().piece(p1) == null && getBoard().piece(p2) == null && getBoard().piece(p3) == null ) {
					possibleMoves[position.getRow()][position.getColumn()-2] = true;										
				}				
			}
			
		
		}
		
		
		return possibleMoves;
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	private boolean  testRookCastling (Position position) {
		
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		
		
		return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
		
		
	}
	
}
