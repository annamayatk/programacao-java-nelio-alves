package matrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int diagonal = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				
				if (j > i)
					diagonal += mat[i][j]; //esse nao entendi tão bem, só depois vi que era elementos ACIMA da diagonal!
			}
		}
		
		System.out.println(diagonal);
		sc.close();
	}

}
