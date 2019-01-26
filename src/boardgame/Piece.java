package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;


	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	
	protected Board getBoard() {
		return board;
	}

	
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove (Position position) {
		return possibleMoves()[position.getRow()] [position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMoves() {
		boolean[][] possibleMoves = possibleMoves();
		
		for(int i=0; i < possibleMoves.length; i++) {
			for(int j =0; j < possibleMoves[i].length; j++) {
				if (possibleMoves[i][j])  {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Piece [position=" + position + ", board=" + board + "]";
	}

	
}
