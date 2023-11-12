
public class Main {
	static int num = 0;
	public static void main(String[] args) {
			
		incrementar();
		decrementar();
	}
	public static void incrementar() {
		num++;
		System.out.printf("el numero vale: %d %n",num);
		
	}
	public static void decrementar() {
		num -= 2;
		System.out.printf("el numero vale: %d",num);
		
	}

}
