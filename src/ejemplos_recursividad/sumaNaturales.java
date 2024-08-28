
import java.util.Scanner;

public class sumaNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere calcular su factorial: ");
        int numero = scanner.nextInt();
        System.out.println("La suma de los numeros naturales de "+ numero + " es de: "+ sumaNaturales(numero));

    }
    public static int sumaNaturales (int numero){
        if (numero == 0){
            return 0;
        }
        return numero + sumaNaturales(numero-1);
    }
}
