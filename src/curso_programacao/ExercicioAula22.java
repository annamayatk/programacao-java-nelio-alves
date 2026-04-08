package curso_programacao;
import java.util.Scanner;

public class ExercicioAula22 {

	public static void main(String[] args) {
		//Ler largura e comprimento de terreno
		//mostrar área e preço
		double largura, comprimento, metroQuadrado, area, preco = 0.0;
		
		System.out.println("Digite a largura do terreno: ");
		Scanner sc = new Scanner(System.in);
		largura = sc.nextDouble();	
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();			 
		
		System.out.println("Digite o preço do metro quadrado do terreno: ");
		metroQuadrado = sc.nextDouble();			 
		sc.close();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		System.out.printf("area %.2f%n", area);
		System.out.printf("Preco %.2f%n", preco);
		
	}

}
