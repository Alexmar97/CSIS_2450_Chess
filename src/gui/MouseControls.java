package gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import gui.Board;

import javax.swing.*;


public class MouseControls implements MouseListener{

	//Board board;

	public int idVariable;

	@Override
//	public void mouseClicked(MouseEvent e) {
//		if(SwingUtilities.isRightMouseButton(e)) {
//			System.out.println("right click");
//		}else if(SwingUtilities.isLeftMouseButton(e)) {
//			System.out.println("left click");
//		}
//
//	}


	public void mouseClicked(MouseEvent e)
	{

//		int tileCoordinates = board.getTile();

		GUI.TilePanel tileCoordinates2 = (GUI.TilePanel) e.getComponent();
		System.out.println(tileCoordinates2);

		idVariable = tileCoordinates2.tileId;
		System.out.println(idVariable);

//		if(board.gameBoard.get(val) ==)

	//	System.out.println(board.gameBoard.get(idVariable));


//		if(board.gameBoard.get(idVariable).isTileOccupied())
//		{
//			System.out.println("Tile is occupied");
//		}
//
//		else
//		{
//			System.out.println("Tile is empty");
//		}


		//Had to make the board instance in GUI static for this to work
		if(GUI.board.getTile(idVariable).isTileOccupied())
		{
			System.out.println("Tile is occupied");
		}

		else System.out.println("Tile is empty");


	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
