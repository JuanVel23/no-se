package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private PanelNúmero pn;
	private PanelTeclado pt;
	private PanelBoton pb;
	private Timer timer;
	private static final long serialVersionUID = 1L;

	
	public View (Controller control) {
		
		
		setSize(700, 700);
		setResizable(false);
		setTitle("Simon");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		pn = new PanelNúmero();
		add(pn, BorderLayout.NORTH);
		
		pt = new PanelTeclado();
		add(pt, BorderLayout.CENTER);
		
		pb = new PanelBoton();
		add(pb, BorderLayout.SOUTH);
		
		
		pt.getBot1().addActionListener(control);
		pt.getBot2().addActionListener(control);
		pt.getBot3().addActionListener(control);
		pt.getBot4().addActionListener(control);
		pb.getBotter().addActionListener(control);
		pn.getBotgen().addActionListener(control);
	}

	public void devolverInformacionAcierto(String mensaje) {
		JOptionPane.showMessageDialog(pn, mensaje, "Felicidades", JOptionPane.CLOSED_OPTION);
	}
	public void devolverInformacionError(String mensaje) {
		JOptionPane.showMessageDialog(pb, mensaje, "Perdiste", JOptionPane.OK_OPTION);
	}
	public void borrarNumeros() {
		Timer timer = new Timer();
		TimerTask tarea = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				pn.getTxtnum1().setVisible(false);
				pn.getTxtnum2().setVisible(false);
				pn.getTxtnum3().setVisible(false);
				pn.getTxtnum4().setVisible(false);
	
			}
		};
		
		timer.schedule(tarea, 1500);
	}	
	

	public PanelNúmero getPn() {
		return pn;
	}


	public void setPn(PanelNúmero pn) {
		this.pn = pn;
	}


	public PanelTeclado getPt() {
		return pt;
	}


	public void setPt(PanelTeclado pt) {
		this.pt = pt;
	}


	public PanelBoton getPb() {
		return pb;
	}


	public void setPb(PanelBoton pb) {
		this.pb = pb;
	}


	public Timer getTimer() {
		return timer;
	}


	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	
}
