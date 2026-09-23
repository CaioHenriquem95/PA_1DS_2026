import java.util.Scanner;

public class Prestacao {
	
	public static void main (String [] args) {
		Scanner ler= new Scanner (System.in);
		double valor, taxa, tempo, valorAtual;
		
		System.out.println("Entre com o valor da Prestação");
		valor = ler.nextInt();
		
		System.out.println("Entre com a Taxa");
		taxa = ler.nextInt();
		
		System.out.println("Entre com o Tempo");
		tempo = ler.nextInt();
		
		valorAtual = valor + (valor * (taxa/100) * tempo);
		System.out.println("O valor do atraso da prestação é:" +valorAtual);
	}
}
