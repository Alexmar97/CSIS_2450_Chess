package tools;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tools {

	public static void main(String[] args) {
		new tools();
	}

	public tools() {
	JFrame frame = new JFrame();
		
			//JButton button = new JButton("Hint!");		
			
			JPanel panel = new JPanel();
			panel.setBorder(BorderFactory.createEmptyBorder(150,150,120,150));
			panel.setLayout(new GridLayout(0,1));
			//panel.add(button);
			
			
			frame.add(panel, BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Chess Hint");
			frame.pack();
			frame.setVisible(true);			
	}

}
