package vetores;

import java.util.Scanner;

public class Resolvido01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // este sera o tamanho do vetor, quantos indices
		int[] vet = new int[N]; // inicializando o vetor "vet" com N posicoes dentro dele.

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt(); // "aproveita-se" a variavel i para percorrer o vetor e armazenar 
									// o valor lido em cada posicao do vetor.
		}

		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}

		sc.close();
	}

}
