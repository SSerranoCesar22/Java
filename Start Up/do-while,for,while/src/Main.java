import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, j = 0;
		System.out.println("introduce el valor de i:");
		count = sc.nextInt();
		sc.close();
		System.out.println(" loop do while");
		do {
			System.out.println("Hello world");
			
		} while (count == 0);
		
	
		System.out.println("loop for ");
		for (int i = 0; i < count; i++) {
			System.out.println("Hello world");
			
			
		}
		System.out.println(" loop while");
		while(j  != count ) {
			System.out.println("Hello world");
			j++;

		}
		
	}

}
