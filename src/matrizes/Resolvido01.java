package matrizes;

import java.util.Scanner;

public class Resolvido01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int negativos = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int[] diagonais = new int[n];
		int x = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if (i == j) {
					diagonais[x] = mat[i][j]; //o prof fez só 1 "for", imprimindo mat[i][i]
					x++;
				}
				if (mat[i][j] < 0) {
					negativos += 1;
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < n; i++) {
			System.out.print(diagonais[i] + " ");
		}
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);
		sc.close();
	}

}
