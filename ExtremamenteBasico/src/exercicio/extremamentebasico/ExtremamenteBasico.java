package exercicio.extremamentebasico;

import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A;
		int B;
		int X;
		
		A = Integer.parseInt(scanner.next());
		B = Integer.parseInt(scanner.next());
		
		scanner.close();
		X = A + B;
		
		System.out.println("X = " + X);
		
		
	}

}