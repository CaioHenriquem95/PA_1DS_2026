import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, a=0, b=1, c,i=1;
		
		System.out.println("Informe quantos termos deseja: ");
		n = ler.nextInt();
		
	
		do  {
			c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            i++;
		}while (i <= n);
			
			ler.close();
		}
	}


