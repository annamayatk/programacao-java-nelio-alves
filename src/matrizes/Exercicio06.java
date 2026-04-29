package matrizes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] mat = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		// a) soma dos elementos positivos da matriz
		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0)
					soma += mat[i][j];
			}
		}
		System.out.println("SOMA DOS POSITIVOS: " + soma);

		// imprimir elementos da linha do indice que usuario digitar
		int indice = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");

		for (int j = 0; j < n; j++) {
			System.out.print(mat[indice][j] + " ");
		}
		System.out.println();

		// imprimir elementos da coluna do indice que usuario digitar
		int indice2 = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][indice2] + " ");
		}
		System.out.println();

		// imprimir elementos da diagonal principal da matriz
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		// matriz alterada

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0)
					mat[i][j] = Math.pow(mat[i][j], 2);
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
