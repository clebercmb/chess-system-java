package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
		
	

	public Board(int rows, int columns) {
		
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}

	public int getRows() {
		return rows;
	}



	public int getColumns() {
		return columns;
	}


	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column))  {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if ( !positioExists(position) ) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on postion " + position);
		}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positioExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	private boolean positionExists(int row, int  col) {
		return (row >= 0) && (row < rows) && (col >=0) && (col < columns);
	}
	
	public boolean thereIsAPiece(Position position) {	
		if ( !positioExists(position) ) {
			throw new BoardException("Position not on the board");
		}
		
		return piece(position) != null;
	}
	
	@Override
	public String toString() {
		return rows + ","+columns;
//		return "Board [rows=" + rows + ", columns=" + columns + "]";
	}
	
	public Piece removePiece(Position position) {
		if ( !positioExists(position) ) {
			throw new BoardException("Position not on the board");
		}
		
		if (piece(position) == null) {
			return null;
		}
		
		Piece pieceToBeRemoved = piece(position);
		pieceToBeRemoved.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		
		return pieceToBeRemoved;
	}
		
}
