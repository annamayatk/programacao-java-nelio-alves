package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vet = new double[n]; //criei o vetor (instanciação)
		
		for (int i = 0; i <n; i++) {
			vet[i] = sc.nextDouble(); // vou ler o valor de entrada e guardar na posição i
		}
		
		for (int i =0; i<n; i++) {
			System.out.printf("%.2f%n", vet [i]); //imprimo os valores do vetor (ACESSO)
		}
		
		sc.close();
	}

}
