package pieces;

import gui.PieceColor;
import gui.PieceColor;

public class Piece {

	int piecePos;
	PieceColor pieceColor;
	
	public Piece(int piecePos, PieceColor pieceColor) {
		this.piecePos = piecePos;
		this.pieceColor = pieceColor;
	}
	
	public int getPiecePos() {
		return this.piecePos;
	}
	
	public PieceColor getPieceColor() {
		return this.pieceColor;
	}
}
