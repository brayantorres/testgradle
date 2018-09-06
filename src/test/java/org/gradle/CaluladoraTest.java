package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CaluladoraTest {
	
	Calculadora calculadora;
	
	@Before
	public void instance () {
		calculadora = new Calculadora();
	}
	
	@Test
	public void ingresoCienYDocientosYReciboTrecientos() {
		//arrange
		int numero1 = 100;
		int numero2 = 200;
		
		//act
		int resultadosuma = calculadora.sumar(numero1,numero2);
		
		//assert
		assertEquals(300, resultadosuma);
	}
	
	@Test
	public void ingresoVeinteYQuinceYRecibo() {
		//arrange
		int numero1 = 20;
		int numero2 = 15;
		
		//act
		int resultadosuma = calculadora.sumar(numero1,numero2);
		
		//assert
		assertEquals(35, resultadosuma);
	}
	
	@Test
	public void ingresoDiezYTresYReciboSiete() {
		//arrange
		int numero1 = 10;
		int numero2 = 3;
		
		//act
		int resultadosuma = calculadora.restar(numero1,numero2);
		
		//assert
		assertEquals(7, resultadosuma);
	}
	
	@Test
	public void ingresoMilYQuinientosYReciboQuinientos() {
		//arrange
		int numero1 = 1000;
		int numero2 = 500;
		
		//act
		int resultadosuma = calculadora.restar(numero1,numero2);
		
		//assert
		assertEquals(500, resultadosuma);
	}
	
	@Test
	public void ingresoDiezYTresYReciboTreinta() {
		//arrange
		int numero1 = 10;
		int numero2 = 3;
		
		//act
		int resultadomultiplicacion = calculadora.multiplicar(numero1,numero2);
		
		//assert
		assertEquals(30, resultadomultiplicacion);
	}
	
	@Test
	public void ingresoDosYNueveYReciboDieciocho() {
		//arrange
		int numero1 = 2;
		int numero2 = 9;
		
		//act
		int resultadomultiplicacion = calculadora.multiplicar(numero1,numero2);
		
		//assert
		assertEquals(18, resultadomultiplicacion);
	}
	
	@Test
	public void ingresoDosYDosYReciboCuatro() {
		//arrange
		int numero1 = 2;
		int numero2 = 2;
		
		//act
		int resultadopotenciacion = calculadora.potenciacion(numero1,numero2);
		
		//assert
		assertEquals(4, resultadopotenciacion);
	}
	
	@Test
	public void ingresoDosYCuatroYReciboDieciseis() {
		//arrange
		int numero1 = 3;
		int numero2 = 2;
		
		//act
		int resultadopotenciacion = calculadora.potenciacion(numero1,numero2);
		
		//assert
		assertEquals(8, resultadopotenciacion);
	}
	
	@Test
	public void ingresoCuatroYReciboVeintiCuatro() {
		//arrange
		int numero = 4;
		
		//act
		int resultadofactorial = calculadora.factorial(numero);
		
		//assert
		assertEquals(24, resultadofactorial);
	}
	
	@Test
	public void ingresoDiezYReciboTresMillonesSicientosVeinteOchoMilOchocientos() {
		//arrange
		int numero = 10;
		
		//act
		int resultadofactorial = calculadora.factorial(numero);
		
		//assert
		assertEquals(3628800, resultadofactorial);
	}
}
