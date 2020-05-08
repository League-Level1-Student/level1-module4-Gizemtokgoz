package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public void run() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		frame.setVisible(true);

		frame.add(button2);
		frame.add(button1);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Trick");
		button2.setText("Treat");

		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	private static void showPictureFromTheInternet(String imageUrl) {
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
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (button1 == arg0.getSource()) {
			showPictureFromTheInternet("https://sites.psu.edu/siowfa16/files/2016/09/baby-seal-29vsgyf.jpg");
		}
		if (button2 == arg0.getSource()) {
			showPictureFromTheInternet("https://images.squarespace-cdn.com/content/v1/570405a1d51cd4b95e81525f/1462918441305-IF2LSXOTX00V4ZFEAQ4T/ke17ZwdGBToddI8pDm48kLhMlLwYgSAJViDq_sTcenwUqsxRUqqbr1mOJYKfIPR7wHSwpYRrzxWb3AxhO8KtM2-Qb3owRQnKfwtlZH1xBOdCRW4BPu10St3TBAUQYVKcjtgLuq5WH139_psKpOVmSC34SdJiS68KEErY-3JLMyOm7d2ATm884V39MIiDyr0T/Jack-o-27-Lantern-300x2661.jpg");
		}
	}
}