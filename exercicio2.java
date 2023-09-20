package lista3;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o valor da compra: R$");
			float valor_compra = read.nextFloat();
		System.out.print("Informe o valor do pagamento: R$");
			float valor_pago = read.nextFloat();
			
		float troco = valor_pago - valor_compra;
			
		if (valor_pago < valor_compra) {
			System.out.print("ERRO! O valor pago é insuficiente para finalização da compra.");
		}
		else {
		
			float troco1 = troco;
			int nota50 = (int) (troco1 / 50);
	            troco1 %= 50;

	        int nota20 = (int) (troco1 / 20);
	            troco1 %= 20;

	        int nota10 = (int) (troco1 / 10);
	            troco1 %= 10;

	        int nota5 = (int) (troco1 / 5);
	            troco1 %= 5;

	        int nota2 = (int) (troco1 / 2);
	            troco1 %= 2;

	        int moeda1 = (int) (troco1);
	        
	        System.out.println("Troco: R$" + troco);
	        System.out.println("Notas de R$50,00: " + nota50);
            System.out.println("Notas de R$20,00: " + nota20);
            System.out.println("Notas de R$10,00: " + nota10);
            System.out.println("Notas de R$5,00: " + nota5);
            System.out.println("Notas de R$2,00: " + nota2);
            System.out.println("Moedas de R$1,00: " + moeda1);
		}
	}
}