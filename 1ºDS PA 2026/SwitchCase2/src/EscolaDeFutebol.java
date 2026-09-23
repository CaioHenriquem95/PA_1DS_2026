import java.util.Scanner;

public class EscolaDeFutebol {

	public static void main(String[] args) {

		int idade;
		
		System.out.println("Insira a idade do jogador:");
		Scanner ler = new Scanner (System.in);
		idade = ler.nextInt();
		
		switch(idade) {
		
		case 6:
			System.out.println("Dente de Leite");
			break;
		case 7:
			System.out.println("Júnior");
			break;
		case 8:
			System.out.println("Júnior Max");
			break;
		case 9:
			System.out.println("Júnior Master");
			break;
		case 10:
			System.out.println("Master");
			break;
		default:
			System.out.println("Idade Inválida");
		}
	}

} 