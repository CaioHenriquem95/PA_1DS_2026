import java.util.Scanner;

public class Mencao {

	public static void main(String[] args) {
		
		String mencao;
		
		System.out.println("Insira a sua Menção:");
		Scanner ler = new Scanner (System.in);
		mencao = ler.next();
		
		switch (mencao) {
		
		case "i":
			System.out.println("Desempenho Insatisfatório");
			break;
		case "r":
			System.out.println("Desempenho Regular");
			break;
		case "b":
			System.out.println("Desempenho Bom");
			break;
		case "mb":
			System.out.println("Desempenho Muito Bom");
			break;
		default:
			System.out.println("Menção Inválida");
		}
		
		

	}

}
