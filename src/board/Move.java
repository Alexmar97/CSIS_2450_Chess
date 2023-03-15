package board;

/*
 * This class is what we will call to get a certain move
 * and is constructed when a legal move is created
 */
public class Move {

	int destinationCoordinate;
	Board board;
	
	/*
	 * the constructor needs the board that this move is using
	 * and the destination coordinate of this being made
	 */
	public Move(Board board, int destinationCoordinate) {
		this.destinationCoordinate = destinationCoordinate;
		this.board = board;
	}
	
	
	/*
	 * gets the destination coordinate of this move
	 */
	public int getDestinationCoordinate() {
		return this.destinationCoordinate;
	}

}
