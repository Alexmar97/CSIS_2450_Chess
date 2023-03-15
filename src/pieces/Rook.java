package pieces;

import gui.PieceColor;

import java.util.ArrayList;

public class Rook extends Piece
{
    public Rook(int piecePos, PieceColor pieceColor) {
        super(piecePos, pieceColor);
    }

    @Override
    public ArrayList<Integer> allowedMoves(int currentPos, int endPos) {
        return null;
    }

    @Override
    public String toString() {
        return "K";
    }
}

//Allowed moves:
//- Can move how many spots it wants horizontally as long as it is not occupied by an allied piece
//- Can move how many spots it wants vertically as long as it is not occupied by an allied piece

//To move horizantally: Can move from currentPos to edges of the board (not necessarily +7 spots)
//To move vertically: Can move from currentPost to edges of the board