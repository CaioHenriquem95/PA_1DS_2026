import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, a=0, b=1, c,i=1;
		
		System.out.println("Informe quantos termos deseja: ");
		n = ler.nextInt();
		
		if(n>=1) {
			System.out.println(a+" ");
	}
		if (n>=2) {
			System.out.println(b+" ");
		}
		
		while(i <= n) {
			c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            i++;
			
		}
	}

}
