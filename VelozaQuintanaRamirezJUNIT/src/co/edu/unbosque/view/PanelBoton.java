package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelBoton extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botter;
	private JTextField num1, num2, num3, num4;
	public static final String TERMINAR = "Terminar";
	
	public PanelBoton(){
		setLayout(new GridLayout(1,8));
		botter = new JButton("Terminar");
		botter.setActionCommand(TERMINAR);
		num1 = new JTextField("");
		num2 = new JTextField("");
		num3 = new JTextField("");
		num4 = new JTextField("");
		botter.setVisible(false);

		add(new JLabel());
		add(botter);
		add(new JLabel());
	}

	public JButton getBotter() {
		return botter;
	}

	public void setBotter(JButton botter) {
		this.botter = botter;
	}

	public JTextField getNum1() {
		return num1;
	}

	public void setNum1(JTextField num1) {
		this.num1 = num1;
	}

	public JTextField getNum2() {
		return num2;
	}

	public void setNum2(JTextField num2) {
		this.num2 = num2;
	}

	public JTextField getNum3() {
		return num3;
	}

	public void setNum3(JTextField num3) {
		this.num3 = num3;
	}

	public JTextField getNum4() {
		return num4;
	}

	public void setNum4(JTextField num4) {
		this.num4 = num4;
	}

	
}
