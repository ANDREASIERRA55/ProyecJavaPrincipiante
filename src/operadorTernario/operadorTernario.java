package operadorTernario;

import java.util.Scanner;


public class operadorTernario {
    public static void main(String[] args) {

        double promedio;
        String condicionFinal;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese el promedio general de alumno en TodoCode");
            promedio = teclado.nextDouble();

            condicionFinal = promedio>=6 ? "Aprobado" : "Desaprobado";
            System.out.println("El alumno esta: " + condicionFinal);
        }
    }
}
