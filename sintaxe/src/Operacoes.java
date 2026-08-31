import java.util.Scanner;
//ATV_01 dia 10/08/26
public class Operacoes {
    public static void main(String[] args){//main é a porta de entrada do programa
        Scanner leitor = new Scanner(System.in);
        //entrada do número 1
        System.out.println("Informe primeiro número: ");
        double num1 = leitor.nextDouble();
        //entrada do número 2
        System.out.println("Informe segundo número: ");
        double num2 = leitor.nextDouble();
        //operações
        double soma = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        //mostra resultado
        System.out.println("\nSoma: "+soma+ " Subtração: "+sub+ " Multiplicação: "+mul+ " Divisão:"+div);
    }
}
