import java.util.Scanner;

public class Cantina {

	public static void main(String[] args) {
	
		String produto;
		
		System.out.println("Insira o produto desejado:");
		Scanner ler = new Scanner (System.in);
		produto = ler.next();
		
		switch (produto) {
		
		case "cachorro-quente":
			System.out.println("O Produto é R$ 8,00");
			break;
		case "cheeseburger":
			System.out.println("O Produto é R$12,00");
			break;
		case "x-salada":
			System.out.println("O Produto é R$ 15,00");
			break;
		case "misto-quente":
			System.out.println("O Produto é R$ 11,00");
			break;
		case "pão na chapa":
			System.out.println("O Produto é R$ 6,00");
			break;
		default:
			System.out.println("Produto Inválido");
		}
		
		
		
		
	
	}

}
