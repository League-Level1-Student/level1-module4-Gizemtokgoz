package _05_typing_tutor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JLabel label;
	JFrame frame;
	
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public void start() {
		currentLetter = generateRandomLetter();

		frame = new JFrame();
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setTitle("type or die");
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);

		label = new JLabel();
		frame.add(label);
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if (e.getKeyChar()==currentLetter) {
			System.out.println("correct!");
			frame.getContentPane().setBackground(Color.green);
			frame.setBackground(Color.green);
		}
		
		else {
			frame.getContentPane().setBackground(Color.red);
			frame.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
