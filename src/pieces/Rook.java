package pieces;

import java.util.Collection;

import board.Board;
import board.Move;
import util.PieceColor;

/*
 * class to represent the bishop to create a new bishop piece
 */
public class Rook extends Piece{

	//constructor that assumes first move is true
	public Rook(int piecePos, PieceColor pieceColor) {
		super(piecePos, pieceColor, true);
	}
	

	/*
	 * Method that calculates the moves possible by this piece
	 * needs the board being used to be passed in
	 * returns a collection of move objects
	 */
	@Override
	public Collection<Move> calculateMoves(Board board) {
		// TODO Auto-generated method stub
		return null;
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
		return "R";
	}

}
