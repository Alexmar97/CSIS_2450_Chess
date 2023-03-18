package pieces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import board.Board;
import board.Move;
import util.PieceColor;

/*
 * class to represent the bishop to create a new bishop piece
 */
public class Knight extends Piece{

	//constructor that assumes first move is true
	public Knight(int piecePos, PieceColor pieceColor) {
		super(piecePos, pieceColor, true);
	}
	
	//constructor that takes in first move
	public Knight(int piecePos, PieceColor pieceColor, boolean isFirstMove) {
		super(piecePos, pieceColor, isFirstMove);
	}
	
	//the set of integers that piece can move 
	final int[] MOVE_CANDIDATES = {-17, -15, -10, -6, 6, 10, 15, 17};

	
	/*
	 * Method that calculates the moves possible by this piece
	 * needs the board being used to be passed in
	 * returns a collection of move objects
	 */
	@Override
	public Collection<Move> calculateMoves(Board board) {
		//creates an empty list for moves to be added to
		List<Move> moves = new ArrayList<>();
		
		//loops through the possible move integers
		for(int currentMoveCandidate : MOVE_CANDIDATES) {
			int coordinateToCheck = this.piecePos + currentMoveCandidate;
			
			//checking for edge cases
			if(board.isValidCoord(coordinateToCheck)) {
				if(firstColumnEdgeCheck(this.piecePos, currentMoveCandidate) ||
					secondColumnEdgeCheck(this.piecePos, currentMoveCandidate) ||
					seventhColumnEdgeCheck(this.piecePos, currentMoveCandidate) ||
					eigthColumnEdgeCheck(this.piecePos, currentMoveCandidate)) {
					break;
				}
				
				//if no piece is on it add to non attack moves
				if(!board.getTile(coordinateToCheck).isTileOccupied()) {
					moves.add(new Move(board, coordinateToCheck));
				}
				//if their is a piece on coordinate;
				else if(board.getTile(coordinateToCheck).isTileOccupied()) {
					Piece otherPiece = board.getTile(coordinateToCheck).getPiece();
					
					if(otherPiece.getPieceColor() != this.pieceColor) {
						//move.add(aNewAttackMoveObject);
					}
				}
			}
		}
		return moves;
	}


	/*
	 * checks to see if is in first column and move offsets that we can not move to 
	 */
	public boolean firstColumnEdgeCheck(int currentPos, int candidateOffset) {
		return Board.FIRST_COLUMN[currentPos] && (candidateOffset == 6 || candidateOffset == 15 ||
				candidateOffset == -10 || candidateOffset == -17);
	}
	
	/*
	 * checks to see if is in second column and move offsets that we can not move to 
	 */
	public boolean secondColumnEdgeCheck(int currentPos, int candidateOffset) {
		System.out.println(candidateOffset);
		return Board.SECOND_COLUMN[currentPos] && (candidateOffset == 6 || candidateOffset == -10);
	}
	
	/*
	 * checks to see if is in seventh column and move offsets that we can not move to 
	 */
	public boolean seventhColumnEdgeCheck(int currentPos, int candidateOffset) {
		return Board.SEVENTH_COLUMN[currentPos] && (candidateOffset == -6 || candidateOffset == 10);
	}
	
	/*
	 * checks to see if is in eigth column and move offsets that we can not move to 
	 */
	public boolean eigthColumnEdgeCheck(int currentPos, int candidateOffset) {
		return Board.EIGTH_COLUMN[currentPos] && (candidateOffset == -6 || candidateOffset == -15 ||
				candidateOffset == 10 || candidateOffset == 17);
	}

	/*
	 * going to be used to move the piece
	 */
	@Override
	public Piece movePiece(Move move) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "N";
	}

}
