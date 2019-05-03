package com.amandabezerra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.amandabezerra.util.Calculadora;



public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		Scanner in = new Scanner(System.in);
		
		Integer opcaoOperacao = 0;
		String opcaoContinuar = "";
		
		List<Integer> opcoesValidas = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		
		Double valorA;
		Double valorB;
		Double resultado = 0.0;
		
		do {
			System.out.println("Digite o número da opção desejada: \n"
					+ "1 - Adição \n"
					+ "2 - Subtração \n"
					+ "3 - Multiplicação \n"
					+ "4 - Divisão \n"
					);
			
			opcaoOperacao = in.nextInt();
			
			if (!opcoesValidas.contains(opcaoOperacao)) {
				System.out.println("Parece que você digitou uma opção inválida, por favor tente novamente. \n");
				opcaoContinuar = "S";
				continue;
			}
			
			System.out.print("Digite um número: ");
			valorA = in.nextDouble();
			System.out.print("Digite outro número: ");
			valorB = in.nextDouble();
			
			switch(opcaoOperacao) {
				case 1: resultado = calculadora.soma(valorA, valorB);
					break;
				case 2: resultado = calculadora.subtrai(valorA, valorB);
					break;
				case 3: resultado = calculadora.multiplica(valorA, valorB);
					break;
				case 4: resultado = calculadora.divide(valorA, valorB);
					break;
				default:
					break;
			}
			
			System.out.println("Resultado = " + String.format("%.2f", resultado));
			
			System.out.println("Deseja realizar outra operação? (S/N):");
			opcaoContinuar = in.next();

		} while (opcaoContinuar.equals("S") || opcaoContinuar.equals("s"));
		
		System.out.println("Até mais!");
		
		in.close();
	}

}