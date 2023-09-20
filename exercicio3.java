package lista3;
import java.util.Scanner;
public class exercicio3 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o coeficiente a: ");
			int a = read.nextInt();
		System.out.print("Informe o coeficiente b: ");
			int b = read.nextInt();
		System.out.print("Informe o coeficiente c: ");
			int c = read.nextInt();
			
		double delta = Math.pow(b, 2) - (4 * a * c);
			
		if (a == 0 && b == 0 && c!= 0) {
			System.out.print("Coeficientes informados incorretamente.");
		}
		else if (a == 0 && b != 0) {
			System.out.println("Essa é uma equação de 1° grau.");
			
			float raiz_real = -(c)/b;
			
			System.out.printf("A raíz real desta equação é igual a %f.", raiz_real);
		}
		else if(delta < 0) {
			System.out.print("Esta equação não possui raízes reais.");
		}
		else if (delta == 0) {
			System.out.println("Esta equação possui duas raízes reais iguais.");
			double x = -(b)/(2*a);
			System.out.printf("A raíz real desta equação é igual a %f.", x);
		}
		else {
			System.out.println("Esta equação possui duas raízes reais diferentes.");
			double x1 = (-(b) + Math.sqrt(delta))/(2*a);
			double x2 = (-(b) - Math.sqrt(delta))/(2*a);
			System.out.printf("As raízes reais desta equação são %f e %f.", x1, x2);
		}
	}

}
