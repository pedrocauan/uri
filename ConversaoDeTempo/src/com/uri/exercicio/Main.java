package com.uri.exercicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int seconds = scanner.nextInt();
		System.out.printf("%s:%s:%s", seconds /(60 * 60) % 60, seconds / 60 % 60 , seconds % 60);
		scanner.close();
	}

}
