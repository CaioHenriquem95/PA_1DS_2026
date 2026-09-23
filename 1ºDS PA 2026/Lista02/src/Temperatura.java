import java.util.Scanner;

public class Temperatura {

	public static void main (String [] args) {
		Scanner ler= new Scanner (System.in);
		int Farenheit, Celsius, conversao;
		
		System.out.println("Entre com Farenheit");
		Farenheit = ler.nextInt();
		
		conversao=Farenheit-32*5/9;
		System.out.println("A Conversão final é: " +conversao);
	}
}
