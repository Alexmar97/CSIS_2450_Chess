package pieces;

import gui.PieceColor;

import java.util.ArrayList;

public class Queen extends Piece
{
    int count;
    public Queen(int piecePos, PieceColor pieceColor) {
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
