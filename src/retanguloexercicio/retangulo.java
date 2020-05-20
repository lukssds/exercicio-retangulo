package retanguloexercicio;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double altura, largura,area,perimetro;
		int opcao;
	
		System.out.print("Digite a largura do retangulo: ");
		largura=sc.nextDouble();
		
		while (largura <= 0.0) { 
			
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		 	largura=sc.nextDouble();
		
		} 
		
		System.out.print("Digite a altura do retangulo: ");
		altura=sc.nextDouble();
		
		while (altura <= 0.0) { 
			
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		 	altura=sc.nextDouble();
		
		} 
		
		System.out.println("");
		System.out.println("Menu:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.println("Digite uma opcao: ");
		opcao=sc.nextInt();
		
		while (opcao !=3) {
			
			

			if (opcao==1) {
				area= largura*altura;
				System.out.printf("AREA = %.1f%n", area);
				
			}
			else if(opcao==2) { 
				perimetro= (largura*2) + (altura * 2);
				System.out.printf("PERIMETRO = %.1f%n",perimetro);
			} 
			else {
				System.out.println("OPÇÃO INVALIDA");
			}
			
			System.out.println("");
			System.out.println("Menu:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.println("Digite uma opcao: ");
			opcao=sc.nextInt();
		}
		
			System.out.println("FIM DO PROGRMA!");
			sc.close();
		
	}

}
