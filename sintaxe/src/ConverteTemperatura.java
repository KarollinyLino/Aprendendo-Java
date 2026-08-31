import java.util.Scanner;
//ATV_03 dia 10/08/26
public class ConverteTemperatura {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informa temperatura em Celsius");
        double celsius = leitor.nextDouble();
        //converte para fahrenheit
        double fahrenheit = celsius * (9.0/5.0) + 32;
        System.out.printf("Temperatura em Fahrenheit: %.2f", fahrenheit);
    }
}
