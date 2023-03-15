package board;

public class Move {

	int destinationCoordinate;
	Board board;
	
	public Move(Board board, int destinationCoordinate) {
		this.destinationCoordinate = destinationCoordinate;
		this.board = board;
	}
	
	
	
	public int getDestinationCoordinate() {
		return this.destinationCoordinate;
	}

}
