
import java.util.Scanner;

public class Potencia2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double base,exp,res;
		int i=0;
		System.out.println("base: ") ;
		base = ler.nextDouble();
		System.out.println("expoente: ");
		exp = ler.nextDouble();
		res = 1;
		do {
			i++;
			res*=base;
		} while (i<exp);
		
			System.out.println("resultado: " +res);
			ler.close();
		}
	

	}


