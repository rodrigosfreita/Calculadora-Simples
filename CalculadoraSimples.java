package aula9_Metodos.CalculadoraSimples;

import java.util.Scanner;

/**
 * 
 * @author Fernando
 * 
 * Calculadora Simples
 * 
 * Métodos Operacionais
 * - somar(float n1, float n2): float
 * - subtrair()
 * - multiplicar()
 * - dividir()
 *
 */

public class CalculadoraSimples {
	
	private Scanner input;
	
	public int menu() {
		input = new Scanner(System.in);
		System.out.println("*-* MENU *-*");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Operação: ");
		int op = input.nextInt();
		return op;
		
	}
	
	public float somar(float n1, float n2) {
		System.out.println("*-* SOMAR *-*");
		float resultado = n1+n2;
		return resultado;
	}
	
	public float subtrair(float n1, float n2) {
		System.out.println("*-* SUBTRAIR *-*");
		return n1-n2;
	}
	
	public float multiplicar(float n1, float n2) {
		System.out.println("*-* MULTIPLICAR *-*");
		return n1*n2;
	}
	
	public float dividir(float n1, float n2) {
		System.out.println("*-* DIVIDIR *-*");
		return n1/n2;
	}
}
