package Variable;

public class Ejercicioslogicos {

	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 20;
		int aux;
		
		System.out.println("-----Antes-----");
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		
		
		//20   //20
		aux = num2;
		
		//35  //35
		num2 = num1;
		
		//20  //20
		num1 = aux;
		
		
		System.out.println("-----Despues-----");
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		
		
	}

}
