import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //informe o peso
        System.out.println("Informe seu peso");
        double peso = leitor.nextDouble();
        System.out.println("Informe sua altura");
        double alt = leitor.nextDouble();
        // calcula imc
        double imc = peso / (alt * alt);
        System.out.printf("Seu imc é %.2f",imc);

    }
}
