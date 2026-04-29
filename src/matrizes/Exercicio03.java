package matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				
				if (mat[i][j] > max) {
					max = mat[i][j];
				}
			}
			System.out.println(max);
		}

		sc.close();
	}

}
