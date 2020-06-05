package _08_calculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	double num1;
	double num2;
	double output;

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton addb = new JButton();
	JButton subb = new JButton();
	JButton mulb = new JButton();
	JButton divb = new JButton();

	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();

	public void run() {

		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(addb);
		panel.add(subb);
		panel.add(mulb);
		panel.add(divb);
		panel.add(label);
		Font font = new Font("Arial", Font.PLAIN, 36);
		
		label.setFont(font);
		label.setPreferredSize(new Dimension(200, 75));
		text1.setPreferredSize(new Dimension(200, 35));
		text2.setPreferredSize(new Dimension(200, 35));
		addb.setPreferredSize(new Dimension(100, 50));
		subb.setPreferredSize(new Dimension(100, 50));
		mulb.setPreferredSize(new Dimension(100, 50));
		divb.setPreferredSize(new Dimension(100, 50));

		addb.addActionListener(this);
		subb.addActionListener(this);
		mulb.addActionListener(this);
		divb.addActionListener(this);

		addb.setText("add");
		subb.setText("subtract");
		mulb.setText("multiply");
		divb.setText("division");
		frame.pack();
	}

	public void add() {
		output = num1 + num2;
	}

	public void subtract() {
		output = num1 - num2;
	}

	public void multiply() {
		output = num1 * num2;
	}

	public void divide() {
		if (num2 != 0) {
			output = num1 / num2;
			System.out.println(output);
		} 
		else {
			System.out.println("error");
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String string1 = text1.getText();
		String string2 = text2.getText();

		num1 = Double.parseDouble(string1);
		num2 = Double.parseDouble(string2);

		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed == addb) {
			add();
			label.setText("" + output);
		}

		if (buttonPressed == subb) {
			subtract();
			label.setText("" + output);
		}

		if (buttonPressed == mulb) {
			multiply();
			label.setText("" + output);
		}

		if (buttonPressed == divb) {
			divide();
			label.setText(String.valueOf(output));
		}
	}
}
