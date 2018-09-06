package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PrincipalTest {
	
	Principal principal;
	
	@Before
	public void instanciaprincipal () {
		principal = new Principal();
	}
	
	@Test
	public void ingresoArrayDosYCincoYReciboSiete() {
		//arrange
		String operacion = "suma";
		int [] array = {2,5};
		
		//act
		int resultadosuma = principal.operacion(operacion,array);
		
		//assert
		assertEquals(7, resultadosuma);
	}
	
	@Test
	public void ingresoArrayCincoYTresYReciboDos() {
		//arrange
		String operacion = "resta";
		int [] array = {5,3};
		
		//act
		int resultadoresta = principal.operacion(operacion,array);
		
		//assert
		assertEquals(2, resultadoresta);
	}
	
	@Test
	public void ingresoArrayCuatroYCincoYReciboVeinte() {
		//arrange
		String operacion = "multiplicacion";
		int [] array = {4,5};
		
		//act
		int resultadomultiplicacion = principal.operacion(operacion,array);
		
		//assert
		assertEquals(20, resultadomultiplicacion);
	}
	
	@Test
	public void ingresoArrayDosYtresYReciboOcho() {
		//arrange
		String operacion = "potenciacion";
		int [] array = {3,2};
		
		//act
		int resultadopotenciacion = principal.operacion(operacion,array);
		
		//assert
		assertEquals(8, resultadopotenciacion);
	}
	
	@Test
	public void ingresoArrayTresYReciboSeis() {
		//arrange
		String operacion = "factorial";
		int [] array = {3};
		
		//act
		int resultadofactorial = principal.operacion(operacion,array);
		
		//assert
		assertEquals(6, resultadofactorial);
	}
	
	@Test
	public void ingresoCeroYReciboAleatorio() {
		//arrange
		
		//act
		int resultadoaleatorio = principal.sumadealeatorios();
		
		//assert
		assertEquals(2, resultadoaleatorio);
	}
}
