import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		int n, r = 1;
		
		System.out.println("Informe o numero");
		n = ler.nextInt();
		
		while(n>1) {
			r=n*r;
			System.out.println(r);
			n= n - 1;
		}
		System.out.println("o resultado é:" +r);

	}

}
