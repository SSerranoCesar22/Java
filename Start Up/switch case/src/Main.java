import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.println("elige un numero entre 1-9:");
		key = sc.nextInt();
		switch (key) {
		case 1: System.out.println("uno");
			break;
		case 2: System.out.println("dos");
			break;
		case 3: System.out.println("tres");
			break;
		case 4: System.out.print("cuatro");
			break;
		case 5: System.out.println("cinco");
			break;	
		case 6: System.out.println("seis");
			break;
		case 7: System.out.println("siete");
			break;
		case 8: System.out.println("ocho");
			break;
		case 9: System.out.println("nueve");
			break;
			}
	}

}
