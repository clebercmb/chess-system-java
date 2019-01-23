package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece() {
		super();
	}

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	
	protected Board getBoard() {
		return board;
	}

	@Override
	public String toString() {
		return "Piece [position=" + position + ", board=" + board + "]";
	}


	
	
}
