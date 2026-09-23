import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1, id, f1=0, f2=0, f3=0, f4=0, f5=0; 
				
		
		
		while(i<=10) {
			System.out.println("Idade"+i+": ");
			id = ler.nextInt();
			i++;
			if(id<=15) {
				f1++;
			}
			else if(id<=30) {
				f2++;
				}
			else if(id<=45) {
				f3++;
			}
			else if(id<=60) {
				f4++;
				}
			else f5++;
		}
	
		System.out.println("1a: "+f1+"-"+(f1*10)+"%");
		System.out.println("2a: "+f2+"-"+(f2*10)+"%");
		System.out.println("3a: "+f3+"-"+(f3*10)+"%");
		System.out.println("4a: "+f4+"-"+(f4*10)+"%");
		System.out.println("5a: "+f5+"-"+(f5*10)+"%");
		ler.close();
		}

	}

