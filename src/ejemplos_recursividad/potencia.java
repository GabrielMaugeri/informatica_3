import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a potenciar: ");
        int numero = scanner.nextInt();
        System.out.println("Ingrese la potencia: ");
        double potencia = scanner.nextDouble();
        System.out.println("El numero "+numero+" elevado a la "+potencia+" es de: "+potencia(numero,potencia));
    }
    public static double potencia(int numero, double potencia){
        if(potencia == 0){
            return 1;
        }
        return numero * potencia(numero, (potencia -1));
    }
}
