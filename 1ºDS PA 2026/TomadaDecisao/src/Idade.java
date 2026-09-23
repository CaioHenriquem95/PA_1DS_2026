import java.util.Scanner;
public class Idade {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int anoA,anoN,idade;
		
		System.out.println("coloque o ano atual");
		anoA = ler.nextInt();
		
		System.out.println("coloque seu ano de nascimento");
		anoN = ler.nextInt();
		idade = anoA - anoN;
		
		System.out.printf("sua idade é:"+idade);
		if(idade<18) { 
			System.out.println(", você, é criança, pirralho! ");
			System.out.println("Vai estudar seu nutellinha!");
		}
		else {
			
			System.out.println(", beba a vontade e/ou dirija ");
			System.out.println("ou vai trabaia CLT");
		}
		ler.close();
		
	}
	

}
