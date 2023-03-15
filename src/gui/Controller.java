package gui;

import pieces.Piece;


//Alex you still need to find a way to tell if a tile is ocupied or not
// I do not see anywhere where we are indicating when the tiles are occupied when
//creating the pieces in the default layout in Board


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controller {
    private GUI gui;
    private Board board;

    public Controller(GUI gui, Board board)
    {
        this.board = board;
        this.gui = gui;

        gui.addPieceListener(new PieceListener());
    }

    class PieceListener implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e)
        {
            GUI.TilePanel tileCoordinates2 = (GUI.TilePanel) e.getComponent();
            int idVariable = tileCoordinates2.tileId;

//            if(board.gameBoard.get(idVariable).isTileOccupied())
//            {
//                System.out.println("Tile is occupied");
//            }
//
//            else
//            {
//                System.out.println("Tile is empty");
//                board.getTile(idVariable).isTileOccupied()
//            }

            if(board.getTile(idVariable).isTileOccupied())
            {
                System.out.println("Tile is occupied");
            }

            else System.out.println("Tile is empty");


        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
