package pieces;

import gui.PieceColor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Knight extends Piece
{
    public Knight(int piecePos, PieceColor pieceColor)
    {
        super(piecePos, pieceColor);
    }

    @Override
    public ArrayList<Integer> allowedMoves(int currentPos, int endPos)
    {
        currentPos = this.piecePos;
        ArrayList<Integer> allowedMoves = new ArrayList<>();

        allowedMoves.add(currentPos-17);
        allowedMoves.add(currentPos-15);
        allowedMoves.add(currentPos-10);
        allowedMoves.add(currentPos-6);
        allowedMoves.add(currentPos+6);
        allowedMoves.add(currentPos+10);
        allowedMoves.add(currentPos-15);
        allowedMoves.add(currentPos+17);



//        allowedMoves[0] = currentPos-17;
//        allowedMoves[1] = currentPos-15;
//        allowedMoves[2] = currentPos-10;
//        allowedMoves[3] = currentPos-6;
//        allowedMoves[4] = currentPos+6;
//        allowedMoves[5] = currentPos+10;
//        allowedMoves[6] = currentPos+15;
//        allowedMoves[7] = currentPos-17;

//        for(int i = 0; i<allowedMoves.length; i++)
//        {
//            if(/* tile.atPos(allowedMoves[0].isEmpty*/)
//        }


        return allowedMoves;
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

