package lista3;
import java.util.Scanner;
public class exercicio5 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o 1° número: ");
			double n1 = read.nextDouble();
		System.out.print("Informe o 2° número: ");
			double n2 = read.nextDouble();
		System.out.print("Selecione a natureza da operação, sendo + (soma), - (substração), * (multiplicação), / (divisão) e ^ (potenciação): ");
			String opcao = read.next();
		
		if (opcao.equals("+")) {
			double resultado_soma = n1 + n2;
			System.out.printf("%f + %f = %.1f", n1, n2, resultado_soma);
		}
		else if (opcao.equals("-")) {
				double resultado_substracao = n1 - n2;
				System.out.printf("%f - %f = %.1f", n1, n2, resultado_substracao);
		}
		else if (opcao.equals("*")) {
			double resultado_multiplicacao = n1 * n2;
			System.out.printf("%f x %f = %.1f", n1, n2, resultado_multiplicacao);
		}
		else if (opcao.equals("/")) {
			double resultado_divisao = n1 / n2;
			System.out.printf("%f / %f = %.1f", n1, n2, resultado_divisao);
		}
		else if (opcao.equals("^")) {
			double resultado_pow = Math.pow(n1, n2);
			System.out.printf("%f ^ %f = %.1f", n1, n2, resultado_pow);
		}
		else {
			System.out.print("Operação inválida!");
		}
	}
}