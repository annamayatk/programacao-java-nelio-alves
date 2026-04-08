package curso_programacao;
import java.util.Scanner;

public class ExercicioAula26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double B = sc.nextDouble();
		double A = sc.nextDouble();
		
		double area = A * B;
		double perimetro = (2 * A) + (2 * B);
		double diagonal = Math.sqrt((Math.pow(A, 2)) + (Math.pow(B, 2)));
		
		sc.close();
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);

	}

}
