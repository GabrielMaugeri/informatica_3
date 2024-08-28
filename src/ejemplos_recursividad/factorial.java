
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere calcular su factorial: ");
        int numero = scanner.nextInt();
        System.out.println("El valor del factorial de " +numero + " es de: "+ Factorial(numero));
        
    }
    public static int Factorial(int numero){
        if (numero == 0){
            return 1;
        }
        
        return numero*Factorial(numero-1) ;
    }
}
