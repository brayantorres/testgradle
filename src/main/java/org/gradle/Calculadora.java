package org.gradle;

public class Calculadora {

	public int sumar(int numero1, int numero2) {
		return numero2 + numero1;
	}

	public int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2) {
		int multiplicacion = 0;
		
		for(int i = 0; i < numero2; i++) {
			multiplicacion = sumar(multiplicacion, numero1);
		}
		return multiplicacion;
	}

	public int potenciacion(int numero1, int numero2) {
		int potenciacion = 1;
		for(int i = 0; i < numero1; i++) {
			potenciacion = multiplicar(potenciacion, numero2);
		}
		return potenciacion;
	}

	public int factorial(int numero) {
		int factorial = numero;
		for(int i = numero; i > 1; i--) {
			factorial = multiplicar(factorial, i - 1);
		}
		return factorial;
	}

}
