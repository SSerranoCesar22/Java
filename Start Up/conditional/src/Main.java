import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = (int) (Math.random() * 100); 
		String resultado;
		System.out.println("inserta un numero:");
		num1 = sc.nextInt();
		resultado = num1 % 2 == 0 ? "par" : "impar";
		System.out.printf("el numero introducido %d es: %s %n", num1,resultado);
		resultado = num2 % 2 == 0 ? "blanco" : "negro";
		System.out.printf("el numero introducido %d es: %s ", num2,resultado);
	}	

}
