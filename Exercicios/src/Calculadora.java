import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = leitor.nextDouble();

        int opcao;

        do {
            System.out.println();
            System.out.println("--- Calculadora ---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Resultado: " + (a + b));
                case 2 -> System.out.println("Resultado: " + (a - b));
                case 3 -> System.out.println("Resultado: " + (a * b));
                case 4 -> {
                    if (b == 0) {
                        System.out.println("Erro: divisão por zero.");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}