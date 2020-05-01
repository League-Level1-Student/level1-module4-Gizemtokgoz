package _01_nasty_surprise;

import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NastySurprise {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(button1);
	button1.setText("Trick");
	frame.add(button2);
	button2.setText("Treat");
	frame.pack();
	
	/*private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame2 = new JFrame();
	        frame2.add(imageLabel);
	        frame2.setVisible(true);
	        frame2.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	} */
}
}
