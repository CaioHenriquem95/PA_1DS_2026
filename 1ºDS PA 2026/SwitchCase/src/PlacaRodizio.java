import java.util.Scanner;

public class PlacaRodizio {

	public static void main(String[] args) {
				
			int ultimoDigito;
				
				System.out.println("Digite o ultimo numero da placa, por favor");
				Scanner ler = new Scanner (System.in);
				ultimoDigito = ler.nextInt();
				
				switch(ultimoDigito){
				    case 1:
				    case 2:
				    	System.out.println("você ñ poderá dirigir na segunda!");
				    	break;
				    case 3:
				    case 4:
				    	System.out.println("você ñ poderá dirigir na terça!");
		                break;
				    case 5:
				    case 6:
				    	System.out.println("você ñ poderá dirigir na quarta!");
				    	break;
				    case 7:
				    case 8:
				    	System.out.println("você ñ poderá dirigir na quinta!");
				    	break;
				    case 9:
				    case 0:
				    	System.out.println("você ñ poderá dirigir na sexta!");
				    	break;
				    default:
				    	System.out.println("Número Inválido");
				        
				}
				
				
				

			}

	}