

public class Main {

	public static void main(String[] args) {
		 Main main = new Main();
		 System.out.println(main.isOdd(22));
		 System.out.println(main.isOdd(5));
	}
	public boolean isOdd(int num) {
		return num % 2 == 0 ? true :  false;
	}

}
