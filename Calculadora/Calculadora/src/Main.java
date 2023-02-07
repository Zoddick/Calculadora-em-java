
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1, n2, operacao, resultado;
        Calculadora c1 = new Calculadora();
        Scanner in = new Scanner(System.in);


        System.out.println("***CALCULADORA***");
        System.out.println("Digite um número: ");
        n1 = in.nextInt();
        System.out.println("Digite outro número: ");
        n2 = in.nextInt();
        System.out.println("Escolha uma operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = in.nextInt();


        switch (operacao){
            case 1:
                resultado = c1.soma(n1, n2);
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case 2:
                resultado = c1.sub(n1, n2);
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = c1.mult(n1, n2);
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                resultado = c1.div(n1, n2);
                System.out.println("O resultado da divisão é: " + resultado);
                break;
        }

    }
}