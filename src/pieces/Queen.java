package pieces;

import gui.PieceColor;

public class Queen extends Piece
{
    int count;
    public Queen(int piecePos, PieceColor pieceColor) {
        super(piecePos, pieceColor);
    }

    @Override
    public String toString() {
        return "K";
    }


    public int getCount()
    {
        return count;
    }


    //We need setter for count so that any time a piece is taken by the opponent
    //the count reflects the change
    public void setCount(int count)
    {
        this.count = count;
    }
}
