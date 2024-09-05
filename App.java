package aula9_Metodos.CalculadoraSimples;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CalculadoraSimples cs = new CalculadoraSimples();
		
		int op = cs.menu();
		
		System.out.println("N1: ");
		float n1 = input.nextFloat();
		System.out.println("N2: ");
		float n2 = input.nextFloat();
		
		if(op == 1) {
			float resultado = cs.somar(n1, n2);
			System.out.println("Resultado: " + resultado);
		}else if(op == 2) {
			float resultado = cs.subtrair(n1, n2);
			System.out.println("Resultado: " + resultado);
		}else if(op == 3) {
			float resultado = cs.multiplicar(n1, n2);
			System.out.println("Resultado: " + resultado);
		}else if(op == 4) {
			float resultado = cs.dividir(n1, n2);
			System.out.println("Resultado: " + resultado);
		}else {
			System.out.println("Operação inválida!");
		}
	}
}
