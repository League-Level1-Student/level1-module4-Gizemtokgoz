package _11_whack_a_mole;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		for (int i = 0; i < 18; i++) {
			JButton button = new JButton();
			button.setPreferredSize(new Dimension(100, 50));
			panel.add(button);
		}
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(400, 500));
		
		frame.add(panel);
		frame.pack();
	}
	
	void drawButtons(int randInt) {
		
	}
}
