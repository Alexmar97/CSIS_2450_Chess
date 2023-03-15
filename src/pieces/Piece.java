package pieces;

import gui.PieceColor;
import gui.Tile;

import java.util.ArrayList;

public abstract class Piece {

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


	 public abstract ArrayList<Integer> allowedMoves(int currentPos, int endPos);

}
