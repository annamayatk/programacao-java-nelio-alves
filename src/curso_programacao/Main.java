package curso_programacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);  //formatar para exibir 2 casa decimais
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); //configurar para ficar com ponto ao inves de virgula ABNT
		System.out.printf("%.4f%n", x);
		System.out.println("Bom dia");
		
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Anna";
		int idade = 27;
		double renda = 2500.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais", nome, idade, renda);
		
	}

}
