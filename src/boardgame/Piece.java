package boardgame;

public class Piece {
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

	@Override
	public String toString() {
		return "Piece [position=" + position + ", board=" + board + "]";
	}


	
	
}
