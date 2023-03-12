package pieces;

import gui.PieceColor;

public class Rook extends Piece
{
    public Rook(int piecePos, PieceColor pieceColor) {
        super(piecePos, pieceColor);
    }

    @Override
    public String toString() {
        return "K";
    }
}
