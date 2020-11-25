package sesion07;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número (cambio)");
            int num = sc.nextInt();
            int maximoTemporal = num;

        while (num != 0) {
            if (num > maximoTemporal) {
                maximoTemporal = num;
            }
            System.out.println("Introduce un número (0 para finalizar)");
            num = sc.nextInt();
        }
        System.out.println("El número mayor que has introducido es: " + maximoTemporal);
    }
}

