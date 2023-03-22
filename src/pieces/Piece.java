package pieces;

import java.util.Collection;

import board.Board;
import board.Move;
import util.PieceColor;

/*
 * abstract class for all pieces for layout of pieces
 */
public abstract class Piece {

	int piecePos;
	PieceColor pieceColor;
	boolean isFirstMove;
	
	/*
	 * constructor for pieces needs
	 * position
	 * color
	 * and if its first move
	 */
	public Piece(int piecePos, PieceColor pieceColor, boolean isFirstMove) {
		this.piecePos = piecePos;
		this.pieceColor = pieceColor;
		this.isFirstMove = isFirstMove;
	}
	
	/*
	 * getter for position
	 */
	public int getPiecePos() {
		return this.piecePos;
	}
	
	/*
	 * getter for piece color
	 */
	public PieceColor getPieceColor() {
		return this.pieceColor;
	}
	
	/*
	 * getter for if first move
	 */
	public boolean isFirstMove() {
		return this.isFirstMove;
	}
	
	//abstract methods for calculating mvoes and moving piece
	public abstract Collection<Move> calculateMoves(Board board);
	//public abstract Collection<Move> getAttackMoves(Board board);
 	public abstract Piece movePiece(Move move);
}
