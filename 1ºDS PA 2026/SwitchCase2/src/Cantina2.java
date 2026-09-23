import java.util.Scanner;

public class Cantina2 {

	public static void main(String[] args) {
		
		int produto;
		
		System.out.println("Insira o produto desejado:");
		Scanner ler = new Scanner (System.in);
		produto = ler.nextInt();
		
		switch (produto) {
		
		case 1:
			System.out.println("Um Cachorro-Quente é R$ 8,00");
			break;
		case 2:
			System.out.println("O Cheeseburger é R$12,00");
			break;
		case 3:
			System.out.println("O X-Salada é R$ 15,00");
			break;
		case 4:
			System.out.println("O Misto-Quente é R$ 11,00");
			break;
		case 5:
			System.out.println("O Pão na Chapa é R$ 6,00");
			break;
		default:
			System.out.println("Produto Inválido");
		}
	
	}

}