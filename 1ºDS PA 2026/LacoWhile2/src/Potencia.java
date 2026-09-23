import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double base,exp,res;
		int i=0;
		System.out.println("base: ") ;
		base = ler.nextDouble();
		System.out.println("expoente: ");
		exp = ler.nextDouble();
		res = 1;
		while(i<exp) {
			i++;
			res*=base;
		}
			System.out.println("resultado: " +res);
		}

	}


