import java.util.Scanner;
public class Shoras
{
	public static void main(String[] args) {
	    int hora;
	    
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Que horas são?");
		 hora = ler.nextInt();
		        if (hora>= 5 && hora<=11){System.out.println("BOM DIA!!!");}
		        else if (hora>= 12 && hora<= 18){System.out.println("BOA TARDE!!");}
		        else if (hora>= 19 && hora<= 23){System.out.println("BOA NOITE!");}
		        else {System.out.println("VAI DOORMIIIRR!:(");}
	     	
	}
}
