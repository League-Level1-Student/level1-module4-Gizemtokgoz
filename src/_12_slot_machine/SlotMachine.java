package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JButton spin = new JButton();
	String order = new String("");
	boolean addedAL = false;

	public void run() {
		frame.setPreferredSize(new Dimension(2000, 800));
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(2000, 800));
		Random rand = new Random();
		spin.setPreferredSize(new Dimension(100, 50));
		
		if(!addedAL) {
			spin.addActionListener(this);
			addedAL = true;
		}
		
		order = new String("");

		for (int i = 0; i < 3; i++) {
			int picture = rand.nextInt(3);
			order += picture;
			JLabel firstImage = null;
			JLabel secondImage = null;
			JLabel thirdImage = null;

			if (picture == 0) {
				firstImage = createLabelImage("cherry.png");
				panel.add(firstImage);
			} else if (picture == 1) {
				secondImage = createLabelImage("orange.png");
				panel.add(secondImage);
			} else if (picture == 2) {
				thirdImage = createLabelImage("seven.png");
				panel.add(thirdImage);
			}
		}

		frame.add(panel);
		panel.add(spin);
		frame.pack();
		frame.setVisible(true);
	}

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == spin) {
			frame.getContentPane().removeAll();
			run();

			System.out.println(order);

			if (order.equals("000")) {
				JOptionPane.showMessageDialog(null, "YAY YOU WON");
			}

			if (order.equals("111")) {
				JOptionPane.showMessageDialog(null, "YAY YOU WON");
			}

			if (order.equals("222")) {
				JOptionPane.showMessageDialog(null, "YAY YOU WON");
			}
		}
	}

}
