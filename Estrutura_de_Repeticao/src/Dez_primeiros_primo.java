public class Dez_primeiros_primo {
    public static void main(String[] args){
        int cont = 0;
        int num = 2;
        System.out.println("Os 10 primeiros números primos:");
        while (cont<10){
            boolean primo = true;
            for (int i = 2 ; i < num ; i++){
                if(num % i == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println(num+" é primo");
                cont++;
            }
            num++;
        }
    }
}
