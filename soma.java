import java.util.Scanner;
public class Soma
{
    public static void main (String[]args){
        int a;
        int b;

        Scanner ler = new Scanner(System.in);

        System.out.println("Fale um número: ");
        a = ler.nextInt();

        System.out.println("Fale outro número: ");
        b = ler.nextInt();

        int resultado = a + b;

        somar(resultado);
    }

    public static void somar(int resultado){
        System.out.println("O resultado da soma é: " + resultado);}
}
