package matrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		int[] soma = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
				soma[i] += matriz[i][j];
			}
			System.out.println(soma[i]);
		}

		sc.close();
	}

}
