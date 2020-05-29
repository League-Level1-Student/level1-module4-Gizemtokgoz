package _08_calculator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
	int num1;
	int num2;
	
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton addb = new JButton();
		JButton subb = new JButton();
		JButton mulb = new JButton();
		JButton divb = new JButton();
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.add(panel);
		panel.add(addb);
		panel.add(subb);
		panel.add(mulb);
		panel.add(divb);
		addb.setPreferredSize(new Dimension(100, 50));
		subb.setPreferredSize(new Dimension(100, 50));
		mulb.setPreferredSize(new Dimension(100, 50));
		divb.setPreferredSize(new Dimension(100, 50));
		addb.setText("add");
		subb.setText("subtract");
		mulb.setText("multiply");
		divb.setText("division");
		frame.pack();
		
		add();
		subtract();
		multiply();
		divide();
	}
	
	public void add() {
		//num1 ++ num2;
	}

	public void subtract() {

	}

	public void multiply() {

	}

	public void divide() {

	}
}
