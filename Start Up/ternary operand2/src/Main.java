import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String resultado;
		System.out.println("inserta un numero: ");
		num = sc.nextInt();
		resultado = num > 0 ? "positivo" : num < 0 ? "negativo": "es 0";
		System.out.println(resultado);
	}

}
