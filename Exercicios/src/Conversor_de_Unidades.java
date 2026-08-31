import java.util.Scanner;

public class Conversor_de_Unidades {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double valor;
        int opcao;
        do{
            System.out.println();
            System.out.println("---Conversor de Unidade---");
            System.out.println("1-Quilometros para Milhas");
            System.out.println("2-Celsius para Fahrenheit");
            System.out.println("3-Quilograma para Libras");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leitor.nextInt();
            switch (opcao){
                case 1 -> {
                    System.out.println("Informe o valor do Quilômetros: ");
                    valor = leitor.nextInt();
                    System.out.println("Resultado em Milhas: "+(valor*0.621));
                }
                case 2 -> {
                    System.out.println("Informe o valor do Celsius: ");
                    valor = leitor.nextInt();
                    System.out.println("Resultado em Fahrenheit:"+((valor*(9.0/5.0))+32));
                }
                case 3 -> {
                    System.out.println("Informe o valor do Quilograma: ");
                    valor = leitor.nextInt();
                    System.out.print("Resultado em Libras:"+(valor*2.205));
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida");

            }
        }while (opcao != 0);
    }
}
