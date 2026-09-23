import java.util.Scanner;

public class Fatorial2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		int n, r = 1;
		
		System.out.println("Informe o numero");
		n = ler.nextInt();
		
		do {
			r=n*r;
			System.out.println(r);
			n= n - 1;
		} while(n > 1);
		System.out.println("o resultado é:" +r);
		
		ler.close();
	}

}
