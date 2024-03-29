public class Calculadora {

    public static int calculadora(int a , int b , char operacao) {
        
        switch (operacao) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Erro: divisão por zero");
                    return 0;
                }
            default:
                System.out.println("Operação inválida");
                return 0;
        }
    }

    public static void main(String[] args) {
        int resultado = calculadora(20, 5, '=');
        System.out.println(resultado);
    }
}
