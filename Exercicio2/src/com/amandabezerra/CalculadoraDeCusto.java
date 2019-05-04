package com.amandabezerra;

import java.util.Scanner;

public class CalculadoraDeCusto {
	
	public static void main(String[] args) {
		
		final int PERCENTUAL_DISTRIBUIDOR = 12;
		final int IMPOSTOS = 5;
		
		Scanner in = new Scanner(System.in);
		
		Double custoFabrica = 0.0;
		Double custoDistribuidor = 0.0;
		Double custoFinal = 0.0;
		
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica = in.nextDouble();
		
		custoDistribuidor = custoFabrica + ((custoFabrica * PERCENTUAL_DISTRIBUIDOR) / 100.0);
		
		custoFinal = custoDistribuidor + ((custoDistribuidor * IMPOSTOS) / 100.0);
		
		System.out.println("O custo final de fabricação do carro é R$" + String.format("%.2f", custoFinal));
		
		in.close();
	}

}
