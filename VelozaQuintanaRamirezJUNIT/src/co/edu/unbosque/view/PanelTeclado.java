package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelTeclado extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton bot1,bot2,bot3, bot4;
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";
	
	
	public PanelTeclado () {
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Juega");
		border.setTitleColor(Color.black);
		setBorder(border);
		Font text = new Font("Arial",3,40 );
		bot1 = new JButton();
		
		bot1.setText("");
		bot1.setFont(text);
		bot1.setActionCommand(UNO);
		ImageIcon img1 = new ImageIcon(getClass().getResource("/NumerosSimon/Numero1.0.png"));
		ImageIcon icono1 = new ImageIcon(img1.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT));
		bot1.setIcon(icono1);
		bot1.setEnabled(false);
		bot2 = new JButton();
		bot2.setText("");
		bot2.setFont(text);
		bot2.setActionCommand(DOS);
		ImageIcon img2 = new ImageIcon(getClass().getResource("/NumerosSimon/Numero2.png"));
		ImageIcon icono2 = new ImageIcon(img2.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT));
		bot2.setIcon(icono2);
		bot2.setEnabled(false);
		bot3 = new JButton();
		bot3.setText("");
		bot3.setFont(text);
		bot3.setActionCommand(TRES);
		ImageIcon img3 = new ImageIcon(getClass().getResource("/NumerosSimon/Numero3.png"));
		ImageIcon icono3 = new ImageIcon(img3.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT));
		bot3.setIcon(icono3);
		bot3.setEnabled(false);
		bot4 = new JButton();
		bot4.setText("");
		bot4.setFont(text);
		bot4.setActionCommand(CUATRO);
		ImageIcon img4 = new ImageIcon(getClass().getResource("/NumerosSimon/Numero4.png"));
		ImageIcon icono4 = new ImageIcon(img4.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT));
		bot4.setIcon(icono4);
		bot4.setEnabled(false);
		
		add(bot1);
		add(bot2);
		add(bot3);
		add(bot4);
		
		}

	public JButton getBot1() {
		return bot1;
	}

	public void setBot1(JButton bot1) {
		this.bot1 = bot1;
	}

	public JButton getBot2() {
		return bot2;
	}

	public void setBot2(JButton bot2) {
		this.bot2 = bot2;
	}

	public JButton getBot3() {
		return bot3;
	}

	public void setBot3(JButton bot3) {
		this.bot3 = bot3;
	}

	public JButton getBot4() {
		return bot4;
	}

	public void setBot4(JButton bot4) {
		this.bot4 = bot4;
	}
	
	
}
