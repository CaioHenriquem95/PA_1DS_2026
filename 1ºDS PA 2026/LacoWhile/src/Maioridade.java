import java.util.Scanner;
public class Maioridade {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int i = 1;
	int anoN, anoA, id;
	
	
	while (i <= 6) {
	System.out.println("Coloque o ano atual");
	anoA = ler.nextInt();
	
	System.out.println("Coloque seu ano de nascimento");
	anoN = ler.nextInt();
	id = anoA - anoN;
	
	System.out.printf("Sua idade é:"+id);
	if(id<18) { 
		System.out.println(", você, é criança, pirralho! ");
		System.out.println("Vai estudar!");
	}
	else {
		
		System.out.println(", beba a vontade e/ou dirija ");
		System.out.println("ou vai trabaia CLT");
	}
	i = i + 1;
	}
}
}
