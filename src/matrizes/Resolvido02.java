package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		double[] vet = new double[m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) { 
				mat[i][j] = sc.nextDouble(); // professor fez criando uma variavel soma, por didática.
				vet[i] += mat[i][j];
			}
		}
		
		for(int i=0; i<m; i++) {
			System.out.println(vet[i]);
		}

		sc.close();
	}

}
