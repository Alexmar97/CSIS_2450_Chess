package pieces;

import gui.PieceColor;

import java.util.ArrayList;

public class Bishop extends Piece {

	public Bishop(int piecePos, PieceColor pieceColor) {
		super(piecePos, pieceColor);
	}

	@Override
	public ArrayList<Integer> allowedMoves(int currentPos, int endPos) {
		return null;
	}

	@Override
	public String toString() {
		return "B";
	}

}
