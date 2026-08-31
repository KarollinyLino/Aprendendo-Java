import java.util.Scanner;
public class Vericacao_de_numero_primo {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = leitor.nextInt();
        boolean primo = true;
        for (int i = 2 ; i < num ; i++){
            if(num % i == 0){
                primo = false;
                break;
            }
        }
        if(num >= 2 && primo){
            System.out.println("O número: "+num+" é primo");
        }
        else {
            System.out.println("O número: "+num+" não é primo");
        }
    }
}
