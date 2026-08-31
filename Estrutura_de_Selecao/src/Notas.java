import java.util.Scanner;
//ATV_03 DIA 17/08/26
public class Notas {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Infome a nota:");
        double nota = leitor.nextDouble();
        char conceito ;
        if(nota >= 9 && nota <= 10){
            conceito = 'A';
        }
        else if (nota >= 7 && nota < 9) {
            conceito = 'B';
        }
        else if (nota >= 5 && nota <7) {
           conceito = 'C';
        }
        else if (nota >= 3 && nota <5) {
            conceito = 'D';
        }
        else if (nota >= 0 && nota < 3){
            conceito = 'E';
        }
        else {
            conceito = 'X';
        }
        if (conceito == 'X'){
            System.out.println("Nota inválida");
        }
        else {
            System.out.println("O conceito é: " + conceito);
        }
    }
}
