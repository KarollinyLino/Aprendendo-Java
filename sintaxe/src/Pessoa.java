import java.util.Scanner;
//ATV_02 dia 10/08/26
public class Pessoa {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Informe sua idade:");
        int idade = leitor.nextInt();
        System.out.println("Informe sua altura:");
        double altura = leitor.nextDouble();
        System.out.printf("Seu nome é: %s sua idade é: %d e a altura é: %.2f",nome,idade,altura);
    }
}
