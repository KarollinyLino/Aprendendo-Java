import java.util.Scanner;
//DIA: 17/08/26
public class Par_ou_Impar {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = leitor.nextInt();
        String nome = (num % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("Esse número é: "+nome);
    }
}
