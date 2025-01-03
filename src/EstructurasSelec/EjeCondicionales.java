package EstructurasSelec;

import java.util.Scanner;

class EjeCondicionales {

	public static void main(String[] args) {
		
		double sueldo=0;
		int categoria;
		
		
		System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
		
		try (Scanner teclado = new Scanner (System.in)) {
			categoria = teclado.nextInt();
		}
		
		if (categoria == 1) {
			sueldo = 15890 + (15890*0.10);
			
		}
		else {
			if (categoria == 2) {
				sueldo = 25630.09;
			}
			else {
				if (categoria == 3) {
					sueldo = 35560.20 - (35560.20*0.11);
				}
				else {
					System.out.println("Debe ingresar un numero de categoria valida");
				}
			}
		}
		if (categoria == 1 || categoria == 2 || categoria == 3) 
		System.out.println("El total de sueldo para la categoria seleccionada es: " + categoria + "Es igual a: " + sueldo);

	}

}
