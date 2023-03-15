package pieces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import board.Board;
import board.Move;
import util.PieceColor;

/*
 * class to represent the pawn to create a new bishop piece
 */
public class Pawn extends Piece{

	//constructor that assumes first move is true
	public Pawn(int piecePos, PieceColor pieceColor) {
		super(piecePos, pieceColor, true);
	}
	
	//constructor that takes in first move
	public Pawn(int piecePos, PieceColor pieceColor, boolean isFirstMove) {
		super(piecePos, pieceColor, isFirstMove);
	}
	
	//the set of integers that piece can move
	final int[] MOVE_CANDIDATES = {7, 8, 9, 16};
	
	
	/*
	 * Method that calculates the moves possible by this piece
	 * needs the board being used to be passed in
	 * returns a collection of move objects
	 */
	@Override
	public Collection<Move> calculateMoves(Board board) {
		
		//creates an empty list for moves to be added to
		List<Move> moves = new ArrayList<>();
		
		//Looping through each possible move pos
		for(int currentMoveCandidate : MOVE_CANDIDATES) {
			
			//coordinate to check is the pieces position with the offset where we want to move
			int coordinateToCheck = this.piecePos + (currentMoveCandidate * this.pieceColor.getDirection());
			
			//checking to make sure coordinate is on board
			if(!board.isValidCoord(coordinateToCheck)) {
				break;
			}
			
			//checking for one spot in front is open
			if(currentMoveCandidate == 8 && !board.getTile(coordinateToCheck).isTileOccupied()) {
				moves.add(new Move(board, coordinateToCheck));
			}//checking if two spots ahead is open and is first move and in their starting positions
			else if((currentMoveCandidate == 16 && this.isFirstMove()) &&
					(board.SEVENTH_RANK[this.piecePos] && this.getPieceColor().isBlack() ||
					board.SECOND_RANK[this.piecePos] && this.getPieceColor().isWhite()) ){
				
				int skippedTile = this.piecePos + (8 * this.getPieceColor().getDirection());
				
				if(!board.getTile(skippedTile).isTileOccupied() && !board.getTile(coordinateToCheck).isTileOccupied()) {
					moves.add(new Move(board, coordinateToCheck));
				}
			}//checking for attack the 7 offset attack position
			else if((currentMoveCandidate == 7 )&& 
					(board.getTile(coordinateToCheck).isTileOccupied()) &&
					(!(board.EIGTH_COLUMN[this.piecePos] && this.pieceColor.isWhite()) ||
					(!(board.FIRST_COLUMN[this.piecePos] && this.pieceColor.isBlack())))) {
				
				Piece otherPiece = board.getTile(coordinateToCheck).getPiece();
				
				if(this.getPieceColor() != otherPiece.getPieceColor()) {
					//moves.add(ANewMoveObject);
				}
			}//checking for attack on the 9 offset position
			else if(currentMoveCandidate == 9 &&
					(board.getTile(coordinateToCheck).isTileOccupied()) &&
					(!(board.EIGTH_COLUMN[this.piecePos] && this.pieceColor.isBlack()) ||
					(!(board.FIRST_COLUMN[this.piecePos] && this.pieceColor.isWhite())))) {
				
				Piece otherPiece = board.getTile(coordinateToCheck).getPiece();
				
				if(this.getPieceColor() != otherPiece.getPieceColor()) {
					moves.add(new Move(board, coordinateToCheck));
				}
			}
			
		}
		return moves;
	}
	
	/*
	 * going to be used to move the piece
	 */
	@Override
	public Piece movePiece(Move move) {
		//will return a new piece of this type with the move varibales
		return null;
	}
	
	@Override
	public String toString() {
		return "P";
	}

}
