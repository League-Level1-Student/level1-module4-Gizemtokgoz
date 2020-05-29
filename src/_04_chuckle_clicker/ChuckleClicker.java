package _04_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}

	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);

		button1.setPreferredSize(new Dimension(100, 50));
		button2.setPreferredSize(new Dimension(100, 50));
		button1.setText("joke");
		button2.setText("punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Why can't elsa have a baloon?");
		}

		if (arg0.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "Because she would let it go :)");
		}
	}
}
