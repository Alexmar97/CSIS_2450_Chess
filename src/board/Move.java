package board;

import pieces.Piece;

/*
 * This class is what we will call to get a certain move
 * and is constructed when a legal move is created
 */
public class Move {

	int destinationCoordinate;
	Board board;
	Piece movedPiece;
	
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
	public int getCurrentCoordinate() {
		return this.getMovedPiece().getPiecePos();
	}
	public Piece getMovedPiece() {
		return this.movedPiece;
	}
	
	public Board makeMove(Board board, Piece movedPiece, int destinationCoordinate) {
		this.movedPiece = movedPiece;
		Board newBoard = new Board(board.blackPlayer);
		for(Piece piece : board.getActivePieces(board.gameBoard)) {
			if(!this.movedPiece.equals(piece)) {
				newBoard.setPiece(piece);
			}
		}
		newBoard.setPiece(movedPiece.movePiece(this));
		newBoard.gameBoard = newBoard.createGameBoard();
		return newBoard;
	}
	
	
	public class NormalMove extends Move{

		public NormalMove(Board board, int destinationCoordinate) {
			super(board, destinationCoordinate);
		}
		
		/*
		 * gets the destination coordinate of this move
		 */
		public int getDestinationCoordinate() {
			return this.destinationCoordinate;
		}
		public int getCurrentCoordinate() {
			return this.getMovedPiece().getPiecePos();
		}
		public Piece getMovedPiece() {
			return this.movedPiece;
		}
		public boolean isAttackMove() {
			return true;
		}
	}
	
	public class AttackMove extends Move{

		public AttackMove(Board board, int destinationCoordinate) {
			super(board, destinationCoordinate);
		}
		
		/*
		 * gets the destination coordinate of this move
		 */
		public int getDestinationCoordinate() {
			return this.destinationCoordinate;
		}
		public int getCurrentCoordinate() {
			return this.getMovedPiece().getPiecePos();
		}
		public Piece getMovedPiece() {
			return this.movedPiece;
		}
		public boolean isAttackMove() {
			return false;
		}
	}
	
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + this.destinationCoordinate;
		result = prime * result + this.movedPiece.hashCode();
		result = prime * result + this.movedPiece.getPiecePos();
		return result;
	}
	
	@Override
	public boolean equals(final Object other) {
		if(this == other) {
			return true;
		}
		if(!(other instanceof Move)) {
			return false;
		}
		final Move otherMove = (Move) other;
		return getCurrentCoordinate() == otherMove.getCurrentCoordinate() &&
				getDestinationCoordinate() == otherMove.getDestinationCoordinate() &&
				getMovedPiece().equals(otherMove.getMovedPiece());
	}
	*/

}
