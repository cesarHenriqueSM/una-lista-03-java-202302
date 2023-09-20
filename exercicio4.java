package lista3;
import java.util.Scanner;
public class exercicio4 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.println("Selecione uma opção, sendo elas: ");
		System.out.println("1. Calcular o perímetro do círculo");
		System.out.println("2. Calcular a área do círculo");
		System.out.println("3. Calcular o volume da esfera");
			int opcao = read.nextInt();
		
			switch (opcao) {
			case 1:
				System.out.print("Informe o raio do círculo: ");
				int raio = read.nextInt();
				double perimetro = 2 * Math.PI * raio;
				System.out.printf("O perímetro do círuclo equivale a %.2f.", perimetro);
				break;
			case 2:
				System.out.print("Informe o raio do círculo: ");
				int raio1 = read.nextInt();
				double area = Math.PI * Math.pow(raio1, 2);
				System.out.printf("A área do círuclo equivale a %.2f.", area);
				break;
			case 3:
				System.out.print("Informe o raio do círculo: ");
				int raio2 = read.nextInt();	
				double volume = (4 * Math.PI * Math.pow(raio2, 3))/3;
				System.out.printf("O volume da esfera equivale a %.2f.", volume);
				break;
			default:
				System.out.print("CÓDIGO DA OPERAÇÃO INVÁLIDO!");
		}
	}

}
