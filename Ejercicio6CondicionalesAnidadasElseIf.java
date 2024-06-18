import java.util.Scanner;

public class Ejercicio6CondicionalesAnidadasElseIf{
	static void main(String [] args){
		/*Realizar un programa que pueda realizar una suma, una resta, una multiplicación o una división de dos números enteros, dependiendo de la desición del usuario
		- Si operación es igual a 1, realizar una suma.
		- Si operación es igual a 2, realizar una resta.
		- Si operación es igual a 3, realizar una multiplicación.
		- Si operación es igual a 4, realizar una división.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona operación a realizar \n1. Suma.\n2. Resta. \n3. Multiplicación. \n4. División.");
		int num1, num2;
		int result;
		int opcion = sc.nextInt();			
	
		if(opcion == 1){
			System.out.println("Introduce número 1");
			num1 = sc.nextInt();
			
			System.out.println("Introduce número 2");
			num2 = sc.nextInt();

			result = num1 + num2;
			System.out.println("Resultado de la suma: " + result);
		}else if(opcion == 2){
			System.out.println("Introduce número 1");
			num1 = sc.nextInt();
			
			System.out.println("Introduce número 2");
			num2 = sc.nextInt();

			result = num1 - num2;
			System.out.println("Resultado de la resta: " + result);
		}else if(opcion == 3){
			System.out.println("Introduce número 1");
			num1 = sc.nextInt();
			
			System.out.println("Introduce número 2");
			num2 = sc.nextInt();

			result = num1 * num2;
			System.out.println("Resultado de la multiplicación: " + result);
		}else if(opcion == 4){
			System.out.println("Introduce número 1");
			num1 = sc.nextInt();
			
			System.out.println("Introduce número 2");
			num2 = sc.nextInt();

			result = num1 / num2;
			System.out.println("Resultado de la división: " + result);
		}else{
			System.out.println("La opción que has introducido no es válida");
		}
	}
}