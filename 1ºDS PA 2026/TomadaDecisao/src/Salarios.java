import java.util.Scanner;
public class Salarios {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	Double salm, salp;
		
		System.out.println ("Entre com o seu salário minimo");
		salm = ler.nextDouble();
		System.out.println("Entre com o salário pessoal");
	    salp = ler.nextDouble();
	    if (salp>salm) {
	    	System.out.println("o salário está dentro da lei");
	    }
	    else {
	    	System.out.println("o salário não está dentro da lei");
	    	
	    }
	    	
	}

}
