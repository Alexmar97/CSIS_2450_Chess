package pieces;

import gui.PieceColor;

public class Knight extends Piece
{
    public Knight(int piecePos, PieceColor pieceColor) {
        super(piecePos, pieceColor);
    }

    @Override
    public String toString() {
        return "K";
    }

    //all candidate legal moves for knights: when 35 is the position of our knight
//not necessarily legal as it may be taken or out of bounds

//35 + 6
//35 -6
//35 + 10
//35 - 10
//35 + 15
//35 - 15
//35 + 17
//35 - 17

}

