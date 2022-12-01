package co.edu.unbosque.JUNIT.test;

import co.edu.unbosque.model.NumeroGenerado;
import junit.framework.TestCase;

public class NumeroGeneradoTest extends TestCase {

	private NumeroGenerado numgen;
	
	public void setUp()  {
		System.out.println("Inicializando Test");
		numgen = new NumeroGenerado();
	}
	
	public void testNumeroRandom() {
		assertEquals("El numero generado NO no se encuentra en el intervalo de {1 , 4}", Integer.parseInt(numgen.generarDigito()),8);
	}
	
	public void testNumeroCorrecto() {
		assertEquals("El numero generado NO es el esperado", Integer.parseInt(numgen.generarDigito()), 4);
	}
	public void tearDown() {
		System.out.println("Finalizando test");
		numgen = null;
	}
}
