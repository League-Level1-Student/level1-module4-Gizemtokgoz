package _09_latest_tweet;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet {
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton search = new JButton();
		JTextField enter = new JTextField();
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(500, 500));
		enter.setPreferredSize(new Dimension(200, 50));
		search.setPreferredSize(new Dimension(200, 50));
		frame.add(panel);
		panel.add(enter);
		panel.add(search);
		search.setText("search the twitterverse...");
		
		
	}

}
