import java.util.Scanner;
public class Nome
{
	public static void main(String[] args) {
	    
	      for (int i = 0; i < 10; i++) {
	    
	    String nome;
	    
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("informe o nome");
		 nome = ler.next();
		
		System.out.println("Bom Dia "+ nome + (i + 1));
		
	     }	
	}
}
