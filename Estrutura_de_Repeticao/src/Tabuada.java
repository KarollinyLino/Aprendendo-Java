import java.util.Scanner;
public class Tabuada {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe um número:");
        int num = leitor.nextInt();
        System.out.println("A Tabuada desse Número é:");
        //Gera tabuada
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println( i + "X" + num + "=" + i*num);
        }
    }
}
