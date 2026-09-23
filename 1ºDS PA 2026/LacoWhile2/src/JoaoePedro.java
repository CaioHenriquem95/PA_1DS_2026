import java.util.Scanner;

public class JoaoePedro {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double joao = 1.34;
		double pedro = 1.45;
		int anos = 0;
		
		while (joao<= pedro) {
			joao += 0.025;
			pedro += 0.02;
		anos++;
		}
		System.out.println("vai demorar "+anos+" anos pra chegar");

	}

}
