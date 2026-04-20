package estrutura_repeticao;

import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int quantia = 0;
		char tipoCobaia = 'x';
		int total = 0, totalC = 0, totalR = 0, totalS = 0;
		double percentualC = 0, percentualR = 0, percentualS = 0;
		
		for (int i = 0; i < n; i++) {
			
			quantia = sc.nextInt();
			tipoCobaia = sc.next().charAt(0);
			total = total + quantia;
			
			switch (tipoCobaia) {
			case 'C':
				totalC = totalC + quantia;
				break;
			case 'R':
				totalR = totalR + quantia;
				break;
			case 'S':
				totalS = totalS + quantia;
				break;
			}
	
		} 
		percentualC = (double) totalC * 100 / total; 
		percentualR = (double) totalR * 100 / total; 
		percentualS = (double) totalS * 100 / total; 
				
		System.out.printf("Total: %d cobaias%n", total);
		
		System.out.printf("Total de coelhos: %d%n", totalC);
		System.out.printf("Total de ratos: %d%n", totalR);
		System.out.printf("Total de sapos: %d%n", totalS);
		
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualC);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualR);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualS);
		
		sc.close();
	}

}
