package com.urijudge.exercicios;

import java.util.Scanner;

public class Cedulas {
	public static void main(String args[]) {
		/*
		 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
		 * (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
		 *  A seguir mostre o valor lido e a relação de notas necessárias.
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		int value =scanner.nextInt();
		int [] cedules = new int[] {100, 50, 20, 10, 5, 2, 1}; //array com as notas de dinheiro
		
		for(int i = 0; i < cedules.length; i++) {
			System.out.println(value / cedules[i] + " nota(s) de R$ " + cedules[i] + ",00");
			value %= cedules[i];
		}
		
		scanner.close();
		
	}
}
