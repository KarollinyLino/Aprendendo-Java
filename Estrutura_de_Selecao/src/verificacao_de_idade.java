import java.util.Scanner;
//ATV_01 DIA: 17/08/26
public class verificacao_de_idade {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Infome sua idade:");
        int idade = leitor.nextInt();
        if(idade>=0 && idade<12){
            System.out.println("Você é criança");
        } else if (idade>=12 && idade<18) {
            System.out.println("Você é adolescente");
        } else if (idade>=18 && idade<60) {
            System.out.println("Você é adulto");
        }else if (idade>=60){
            System.out.println("Você é idoso");
        }
        else {
            System.out.println("Idade inválida");
        }
    }
}