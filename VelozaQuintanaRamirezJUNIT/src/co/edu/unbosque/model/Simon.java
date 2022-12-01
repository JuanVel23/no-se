package co.edu.unbosque.model;

public class Simon {
	
	private NumeroGenerado numgen;

	
	public Simon() {
		numgen = new NumeroGenerado();
	}

	public NumeroGenerado getNumgen() {
		return numgen;
	}

	public void setNumgen(NumeroGenerado numgen) {
		this.numgen = numgen;
	}

}
