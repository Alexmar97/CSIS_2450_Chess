package pieces;

import gui.PieceColor;

public class Pawn extends Piece
{
    public Pawn(int piecePos, PieceColor pieceColor) {
        super(piecePos, pieceColor);
    }

    @Override
    public String toString() {
        return "K";
    }

}
