package gui;

import pieces.Pawn;
import pieces.Piece;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;



public class GUI {

	Board board;
	JFrame gameFrame;
	JPanel boardPanel;
	JMenuBar menu;
	final Dimension FRAME_SIZE = new Dimension(800,800);
	final Dimension TILE_SIZE = new Dimension(10,10);
	Color darkTileColor = Color.decode("#593E1A");
	Color lightTileColor = Color.decode("#FFFACD");
	String defaultPieceImagesPath = "resources/pixel/";

	
	public GUI(Board board){
		this.gameFrame = new JFrame("Chess");
		this.gameFrame.setLayout(new BorderLayout());
		this.gameFrame.setSize(FRAME_SIZE);
		this.board = board;
		this.boardPanel = new BoardPanel();
		this.gameFrame.add(this.boardPanel, BorderLayout.CENTER);
		this.menu = createTableMenuBar();
		this.gameFrame.setJMenuBar(menu);
		this.gameFrame.setVisible(true);
	}
	
	public class BoardPanel extends JPanel{
		final List<TilePanel> boardTiles;
		
		BoardPanel(){
			super(new GridLayout(8,8));
			this.boardTiles = new ArrayList<>();
			for(int i = 0; i < Board.NUM_TILES; i++) {
				TilePanel tilePanel = new TilePanel(this, i);
				this.boardTiles.add(tilePanel);
				add(tilePanel);
			}
			setPreferredSize(FRAME_SIZE);
			validate();

			//Attempted on getting the piece on each tile
			//in hopes of eventually using this info to display a different color for
			//allowed moves - Still in the works
			addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e)
				{
					super.mouseClicked(e);

					GUI.TilePanel tileCoordinates2 = (GUI.TilePanel) e.getComponent();
					int idVariable = tileCoordinates2.tileId;

					Piece Pawn = new Pawn(0,PieceColor.BLACK);
					if(board.gameBoard.get(idVariable).getPiece().equals(Pawn))
					{
						System.out.println("It's a pawn");
					}


				}
			});
		}


		public void drawBoard(Board board) {
			removeAll();
			for(TilePanel tilePanel : boardTiles) {
				tilePanel.drawTile(board);
				add(tilePanel);
			}
			validate();
			repaint();
		}


	}
	
	public JMenuBar createTableMenuBar() {
		JMenuBar tableMenuBar = new JMenuBar();
		tableMenuBar.add(createFileMenu());
		return tableMenuBar;
	}
	
	public JMenu createFileMenu() {
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem restartMenuItem = new JMenuItem("Restart Game");
		restartMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//restart game
			}
		});
		fileMenu.add(restartMenuItem);
		
		JMenuItem saveMenuItem = new JMenuItem("Save Game");
		saveMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//save game
			}
		});
		fileMenu.add(saveMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(exitMenuItem);
		
		return fileMenu;
	}
	 
	
	public class TilePanel extends JPanel{
		int tileId;
		MouseControls mc = new MouseControls();
		
		public TilePanel(BoardPanel boardPanel, int tileId) {
			super(new GridBagLayout());
			this.tileId = tileId;
			setPreferredSize(TILE_SIZE);
			assignTileColor();
			assignTilePieceIcon(board);
			addMouseListener(mc);
			validate();

		}




		public void drawTile(final Board board) {
			assignTileColor();
			assignTilePieceIcon(board);
			validate();
			repaint();
		}
		
		
		private void assignTilePieceIcon(Board board) {
			this.removeAll();
			if(board.getTile(this.tileId).isTileOccupied()) {
				try {
					Image image = ImageIO.read(new File(defaultPieceImagesPath + board.getTile(this.tileId).getPiece()
							.getPieceColor().toString().substring(0,1)
							+ board.getTile(this.tileId).getPiece().toString() + ".gif"));
					image = image.getScaledInstance(80, 80, image.SCALE_DEFAULT);
					add(new JLabel(new ImageIcon(image)));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public void assignTileColor() {
			if(Board.EIGTH_RANK[this.tileId] ||
					Board.SIXTH_RANK[this.tileId] ||
					Board.FOURTH_RANK[this.tileId] ||
					Board.SECOND_RANK[this.tileId]) {
				setBackground(this.tileId % 2 == 0 ? lightTileColor : darkTileColor);
			}else if(Board.SEVENTH_RANK[this.tileId] ||
					Board.FIFTH_RANK[this.tileId] ||
					Board.THIRD_RANK[this.tileId] ||
					Board.FIRST_RANK[this.tileId]) {
				setBackground(this.tileId % 2 != 0 ? lightTileColor : darkTileColor);
			}	
		}
		
	}

}
