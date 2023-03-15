package pieces;

import gui.GUI;
import gui.MouseControls;
import gui.PieceColor;
import gui.Board;

import java.util.ArrayList;

public class Pawn extends Piece
{
    public Pawn(int piecePos, PieceColor pieceColor) {
        super(piecePos, pieceColor);
    }


    @Override
    public ArrayList<Integer> allowedMoves(int currentPos, int endPos)
    {
        currentPos = this.piecePos;
        ArrayList<Integer> allowedMoves = new ArrayList<>();

//        allowedMoves.add(currentPos+8);//regular move
//        allowedMoves.add(currentPos+16);//first turn only
//        allowedMoves.add(currentPos+9);//attack move


//        if(/* tileAtPos(allowedMoves[0]).isEmpty()*/)
//        {
//            allowedMoves.add(currentPos+8);//regular move
//        }
//
//        if(/* tileAtPos(allowedMoves[0]).isEmpty()*/)
//        {
//            allowedMoves.add(currentPos+16);//first turn only
//        }
//
//        if(/* tileAtPos(allowedMoves[0]).isEmpty()*/)
//        {
//            allowedMoves.add(currentPos+9);//attack move
//        }


        MouseControls mc = new MouseControls();



        if(!GUI.board.getTile(mc.idVariable+8).isTileOccupied())
        {
            allowedMoves.add(currentPos+8);//regular move
        }


        return allowedMoves;
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