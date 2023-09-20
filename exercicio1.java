package lista3;
import java.util.Scanner;
public class exercicio1 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
	
		System.out.print("Informe os 3 números: ");
			int n1 = read.nextInt();
			int n2 = read.nextInt();
			int n3 = read.nextInt();
		
			int maior = n1;
			int menor = n1;
	
			if(n2 > maior) {
				maior = n2;
			}
			else if (n2 < menor) {
				menor = n2;
			}
	
			if (n3 > maior) {
				maior = n3;
			}
			else if (n3 < menor){
				menor = n3;
			}
	
			double media_aritmetica = (n1 + n2 + n3) / 3;
	
			System.out.printf("O maior número informado é %d, o menor é %d e a média entre os 3 números é igual a %.1f", maior, menor, media_aritmetica);
	}
}