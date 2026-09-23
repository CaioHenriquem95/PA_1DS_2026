import java.util.Scanner;

public class SomaValores {

	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int v1, v2, v3, v4, soma;
		
		System.out.println("Entre com o 1º Valor");
		v1 = ler.nextInt ();
		
		System.out.println("Entre com o 2º Valor");
		v2 = ler.nextInt ();
		
		System.out.println("Entre com o 3º Valor");
		v3 = ler.nextInt ();
		
		System.out.println("Entre com o 4º Valor");
		v4 = ler.nextInt ();
		
		soma=v1+v2+v3+v4;
		System.out.println("A Soma é:" +soma);
	}
}