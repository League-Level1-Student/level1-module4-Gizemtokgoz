package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	JButton molebutton;

	public void run() {
		int moleb = rand.nextInt(18);

		for (int i = 0; i < 18; i++) {
			JButton button = new JButton();
			button.setPreferredSize(new Dimension(100, 50));
			button.addActionListener(this);
			panel.add(button);
			if (i == moleb) {
				button.setText("mole");
				molebutton = button;
			}
		}

		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(400, 500));

		frame.add(panel);
		frame.pack();
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		int missed = 0;
		int hit = 1;
		int molesWhacked = missed + hit;
		
		if(buttonPressed == molebutton) {
			System.out.println("yay! you got him :)");
			hit += 1;
			frame.getContentPane().removeAll();
			panel = new JPanel();
			run();
		}
		
		else if (buttonPressed != molebutton) {
			//speak("haha you missed");
			System.out.println("haha you missed");
			missed += 1;
			frame.getContentPane().removeAll();
			panel = new JPanel();
			run();
			
			if (missed == 5) {
				JOptionPane.showMessageDialog(null, "mwhaha you lost!");
			}
		}
		
		if (molesWhacked == 10) {
			
		}
		
	}

}
