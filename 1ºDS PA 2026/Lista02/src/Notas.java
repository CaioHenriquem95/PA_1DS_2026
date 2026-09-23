import java.util.Scanner;

public class Notas {

	public static void main (String [] args) {
		Scanner  ler = new Scanner (System.in);
		int nota1, nota2, nota3, nota4, media;
		
		System.out.println("entre com o 1ª Nota");
		nota1 = ler.nextInt();
		
		System.out.println("entre com o 2ª Nota");
		nota2 = ler.nextInt();
		
		System.out.println("entre com o 3ª Nota");
		nota3 = ler.nextInt();
		
		System.out.println("entre com o 4ª Nota");
		nota4 = ler.nextInt();
		
		media=nota1+nota2+nota3+nota4 / 4;
		System.out.println("A média é:" +media);
	}
}
