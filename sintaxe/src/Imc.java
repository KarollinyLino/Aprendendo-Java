import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
       System.out.println("Olá mundo");
       int idade = 18; // tipo primitivo
       double altura = 1.62;// tipo primitivo
       char inicial = 'K';// tipo primitivo
       boolean ativo = true;// tipo primitivo
       String nome = "Karolliny";// tipo de classe
        //String é classe

        // entrada de dados
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
