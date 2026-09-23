import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1; 
		int m, n; 
		System.out.println("Digite um número inteiro:");
		n = ler.nextInt();
		while (i<11) {
			m = n * i;
			System.out.println(+n+ "x" +i+ "=" +m);
			
			i = i + 1;
		}

	}

}
