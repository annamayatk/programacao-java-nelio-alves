package matrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] inteiros = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				inteiros[i][j] = sc.nextInt();
			}
		}

		
		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (inteiros[i][j] < 0) {
					System.out.println(inteiros[i][j]); 
				}
			}
		}
		sc.close();
	}

}
