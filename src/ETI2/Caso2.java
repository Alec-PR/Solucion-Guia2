package ETI2;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero: ");
		int n= sc.nextInt();
		
		String mensaje= "";
		
		if (n % 2 == 0)
			mensaje="Numero es par";
		else
			mensaje= "Numero es impar";
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Mensaje....:" + mensaje);

	}

}