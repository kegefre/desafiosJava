
package desafios;

import java.util.Scanner;
import java.util.Locale;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("pt", "BR"));

		Double preco, totalC = 0.0, totalE = 0.0, totalV = 0.0;
		int qtd, contador;
		char categoria;

		for (contador = 0; contador < 15; contador++) {
			System.out.printf("Dados do produto %d\n", contador + 1);
			categoria = 'A';
			qtd = 0;
			preco = 0.0;

			System.out.println("Preço: ");
			preco = sc.nextDouble();

			while (preco <= 0) {
				System.out.println("Preço deve ser maior que 0: ");
				preco = sc.nextDouble();
			}

			System.out.println("Quantidade: ");
			qtd = sc.nextInt();

			while (qtd <= 0) {
				System.out.println("Quantidade deve ser maior que 0: ");
				qtd = sc.nextInt();
			}

			System.out.println("Categoria\nC para Cama, mesa e banho.\nE para Eletrodomésticos.\nV para Vestuário.");
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);

			while (categoria != 'C' && categoria != 'E' && categoria != 'V') {
				System.out.println("Categoria apenas C, E ou V: ");
				categoria = sc.next().charAt(0);
				categoria = Character.toUpperCase(categoria);
			}
			
			switch (categoria) {
			case 'C':
				totalC+=preco*qtd;
				break;
			case 'E':
				totalE+=preco*qtd;
				break;
			case 'V':
				totalV+=preco*qtd;
				break;
			}
		}

		System.out.println("Total de cada categoria:");
		System.out.printf("Cama, mesa e banho TOTAL: R$%.2f.\n",totalC);
		System.out.printf("Eletrodomésticos TOTAL: R$%.2f.\n",totalE);
		System.out.printf("Vestuário TOTAL: R$%.2f.\n",totalV);
		
		System.out.println("\nImposto para categoria:");		
		System.out.printf("Cama, mesa e banho : R$%.2f.\n",totalC*0.3741);
		System.out.printf("Eletrodomésticos : R$%.2f.\n",totalE*0.4314);
		System.out.printf("Vestuário : R$%.2f.\n",totalV*0.3842);
		
		System.out.println("\nLucro de cada categoria:");
		System.out.printf("Cama, mesa e banho : R$%.2f.\n",totalC*0.30);
		System.out.printf("Eletrodomésticos : R$%.2f.\n",totalE*0.35);
		System.out.printf("Vestuário : R$%.2f.\n",totalV*0.50);
		sc.close();
	}

}
