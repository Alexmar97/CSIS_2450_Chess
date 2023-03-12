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



//Allowed moves:
// - Always allowed to move one spot forward if not occupied already by an allied piece
// - Always allowed two moves forward if its first turn for pawn and not already occupied
// - Can move diagonally to take down an enemy piece

// To move one spot forward it will always be the current pos + 8
// To move two spots forward it will always be current pos + 16
// To move one spot diagonally it will always be current pos + 9