package pieces;

import gui.PieceColor;

public class Bishop extends Piece {

	public Bishop(int piecePos, PieceColor pieceColor) {
		super(piecePos, pieceColor);
	}
	
	@Override
	public String toString() {
		return "B";
	}

}
