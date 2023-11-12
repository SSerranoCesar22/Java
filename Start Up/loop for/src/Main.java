import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		 int niveles = 12;
	        for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= niveles - i; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= 2 * i; k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	        for (int i = 1; i <= 2; i++) {
	            for (int j = 1; j <= niveles - 2; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 4; k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	}

}
