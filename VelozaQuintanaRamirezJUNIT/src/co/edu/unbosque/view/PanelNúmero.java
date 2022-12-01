package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelNúmero extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lab;
	private JTextField txtnum1, txtnum2, txtnum3, txtnum4;
	private JButton botgen;
	public static final String GENERAR = "Generar";
	
	public PanelNúmero() {

		setLayout (new GridLayout(2,5));
		TitledBorder border = BorderFactory.createTitledBorder("Numero");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		Font text = new Font("Arial",1,20 );
		lab = new JLabel("Numero Generado: ");
		txtnum1 = new JTextField("");
		txtnum1.setForeground(Color.black);
		txtnum1.setBackground(Color.white);
		txtnum1.setFont(text);
		txtnum1.disable();
		txtnum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtnum2 = new JTextField("");
		txtnum2.setForeground(Color.black);
		txtnum2.setBackground(Color.white);
		txtnum2.setFont(text);
		txtnum2.disable();
		txtnum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtnum3 = new JTextField("");
		txtnum3.setForeground(Color.black);
		txtnum3.setBackground(Color.white);
		txtnum3.setFont(text);
		txtnum3.disable();
		txtnum3.setHorizontalAlignment(SwingConstants.CENTER);
		txtnum4 = new JTextField("");
		txtnum4.setForeground(Color.black);
		txtnum4.setBackground(Color.white);
		txtnum4.setFont(text);
		txtnum4.disable();
		txtnum4.setHorizontalAlignment(SwingConstants.CENTER);
		botgen = new JButton("Generar");
		botgen.setActionCommand(GENERAR);
		
		add(lab);
		add(txtnum1);
		add(txtnum2);
		add(txtnum3);
		add(txtnum4);
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		add(botgen);
		
	}

	public JLabel getLab() {
		return lab;
	}

	public void setLab(JLabel lab) {
		this.lab = lab;
	}

	public JButton getBotgen() {
		return botgen;
	}

	public void setBotgen(JButton botgen) {
		this.botgen = botgen;
	}

	public JTextField getTxtnum1() {
		return txtnum1;
	}

	public void setTxtnum1(JTextField txtnum1) {
		this.txtnum1 = txtnum1;
	}

	public JTextField getTxtnum2() {
		return txtnum2;
	}

	public void setTxtnum2(JTextField txtnum2) {
		this.txtnum2 = txtnum2;
	}

	public JTextField getTxtnum3() {
		return txtnum3;
	}

	public void setTxtnum3(JTextField txtnum3) {
		this.txtnum3 = txtnum3;
	}

	public JTextField getTxtnum4() {
		return txtnum4;
	}

	public void setTxtnum4(JTextField txtnum4) {
		this.txtnum4 = txtnum4;
	}
	
	
	
}
