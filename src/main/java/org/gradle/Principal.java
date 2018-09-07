package org.gradle;

public class Principal {

	Calculadora calculadora = new Calculadora();

	public int operacion(String operacion, int[] array) {
		int numero1 = array[0];
		int numero2 = 0;
		if (operacion != "factorial") {
			numero2 = array[1];
		}

		int resultado = 0;

		if (operacion == "suma") {
			resultado = calculadora.sumar(numero1, numero2);
		} else if (operacion == "resta") {
			resultado = calculadora.restar(numero1, numero2);
		} else if (operacion == "multiplicacion") {
			resultado = calculadora.multiplicar(numero1, numero2);
		} else if (operacion == "potenciacion") {
			resultado = calculadora.potenciacion(numero1, numero2);
		} else if (operacion == "factorial") {
			resultado = calculadora.factorial(numero1);
		}
		return resultado;
	}

	public int sumadealeatorios() {
		int numeroAleatorio = generarRandom()+generarRandom();
		return numeroAleatorio;
	}

	public int generarRandom(){
		return ((int) (Math.random()*10+0));
	}
}
