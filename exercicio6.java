package lista3;
import java.util.Scanner;
import java.util.Random;
public class exercicio6 {
	
	public static void main(String[] args) {
	    Random aleatorio = new Random();
	    Scanner read = new Scanner(System.in);
		    System.out.print("Digite o primeiro número: ");
		        int n1 = read.nextInt();
		    System.out.print("Digite o segundo número: ");
		        int n2 = read.nextInt();
		
		    int maiorNum = Math.max(n1, n2);
		    int menorNum = Math.min(n1, n2);
		
		    int numAleatorio = aleatorio.nextInt(menorNum, maiorNum + 1);
		    System.out.println("Número gerado aleatoriamente: " + numAleatorio);
		    
		    if (numAleatorio % 2 == 0){
		        System.out.print("O número gerado é par!");
		    }
		    else {
		        System.out.print("O número gerado é ímpar!");
		    }
	}
}