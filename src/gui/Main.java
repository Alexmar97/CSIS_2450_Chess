package gui;

import gui.Board;
import gui.GUI;

public class Main {

	public static void main(String[] args)
	{
		Board board = new Board();
		GUI gui = new GUI(board);

		Controller controller = new Controller(gui,board);

	}

}
