package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import co.edu.unbosque.model.Simon;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	private Simon sm;
	private int i;
	
	public Controller () {
		gui = new View(this);
		sm = new Simon();
		this.i = 0;
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getActionCommand().equals(gui.getPn().GENERAR)) {
			gui.borrarNumeros();
			gui.getPn().getTxtnum1().setText(sm.getNumgen().generarDigito());
			gui.getPn().getTxtnum2().setText(sm.getNumgen().generarDigito());
			gui.getPn().getTxtnum3().setText(sm.getNumgen().generarDigito());
			gui.getPn().getTxtnum4().setText(sm.getNumgen().generarDigito());
			gui.getPn().getBotgen().setVisible(false);
			gui.getPt().getBot1().setEnabled(true);
			gui.getPt().getBot2().setEnabled(true);
			gui.getPt().getBot3().setEnabled(true);
			gui.getPt().getBot4().setEnabled(true);
		
		}
		
	
		if(i == 0) {
			if(evento.getActionCommand().equals(gui.getPt().UNO)) {
				gui.getPb().getNum1().setText(1 + "");
				i = 1;
				
			}else if(evento.getActionCommand().equals(gui.getPt().DOS)) {
				gui.getPb().getNum1().setText(2 + "");
				i = 1;
		
			}else if(evento.getActionCommand().equals(gui.getPt().TRES)) {
				gui.getPb().getNum1().setText(3 + "");
				i = 1;
				
				
			}else if(evento.getActionCommand().equals(gui.getPt().CUATRO)) {
				gui.getPb().getNum1().setText(4 + "");
				i = 1;
			}	
		}else if(i == 1) {	
			if(evento.getActionCommand().equals(gui.getPt().UNO)) {
				gui.getPb().getNum2().setText(1 + "");
				i = 2;
			}else if(evento.getActionCommand().equals(gui.getPt().DOS)) {
				gui.getPb().getNum2().setText(2 + "");
				i = 2;
			}else if(evento.getActionCommand().equals(gui.getPt().TRES)) {
				gui.getPb().getNum2().setText(3 + "");
				i = 2;
			}else if(evento.getActionCommand().equals(gui.getPt().CUATRO)) {
				gui.getPb().getNum2().setText(4 + "");
				i = 2;
			}
		}else if(i == 2) {	
				if(evento.getActionCommand().equals(gui.getPt().UNO)) {
					gui.getPb().getNum3().setText(1 + "");
					i = 3;
				}else if(evento.getActionCommand().equals(gui.getPt().DOS)) {
					gui.getPb().getNum3().setText(2 + "");
					i = 3;
				}else if(evento.getActionCommand().equals(gui.getPt().TRES)) {
					gui.getPb().getNum3().setText(3 + "");
					i = 3;
				}else if(evento.getActionCommand().equals(gui.getPt().CUATRO)) {
					gui.getPb().getNum3().setText(4 + "");
					i = 3;
				}
		}else if (i == 3) {
			if(evento.getActionCommand().equals(gui.getPt().UNO)) {
				gui.getPb().getNum4().setText(1 + "");
				i = 4;
				gui.getPb().getBotter().setVisible(true);
			}else if(evento.getActionCommand().equals(gui.getPt().DOS)) {
				gui.getPb().getNum4().setText(2 + "");
				i = 4;
				gui.getPb().getBotter().setVisible(true);
			}else if(evento.getActionCommand().equals(gui.getPt().TRES)) {
				gui.getPb().getNum4().setText(3 + "");
				i = 4;
				gui.getPb().getBotter().setVisible(true);
			}else if(evento.getActionCommand().equals(gui.getPt().CUATRO)) {
				gui.getPb().getNum4().setText(4 + "");
				i = 4;
				gui.getPb().getBotter().setVisible(true);
		}
	}
		
		
		if(evento.getActionCommand().equals(gui.getPb().TERMINAR)) {
			if((Integer.parseInt(gui.getPn().getTxtnum1().getText()) == Integer.parseInt(gui.getPb().getNum1().getText())) && (Integer.parseInt(gui.getPn().getTxtnum2().getText()) == Integer.parseInt(gui.getPb().getNum2().getText()))
				&& (Integer.parseInt(gui.getPn().getTxtnum3().getText()) == Integer.parseInt(gui.getPb().getNum3().getText())) && (Integer.parseInt(gui.getPn().getTxtnum4().getText()) == Integer.parseInt(gui.getPb().getNum4().getText()))) {
				gui.devolverInformacionAcierto("!!Secuencia exitosa!! :D");
				System.exit(0);
			}else {
				gui.devolverInformacionError("Pero para que te traje :(");
				System.exit(0);
		}
}		
	
	}
	
	
}	
