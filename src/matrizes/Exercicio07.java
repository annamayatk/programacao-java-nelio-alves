package matrizes;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] pelotao = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pelotao[i][j] = sc.nextInt();
			}
		}

		int girarFila = sc.nextInt();
		int linhaReal = girarFila - 1;
		int ultimo = pelotao[linhaReal][n - 1];
		pelotao[linhaReal][0] = ultimo;

		for (int i = n - 1; i > 0; i--) {
			pelotao[linhaReal][i] = pelotao[linhaReal][i - 1];
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(pelotao[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
