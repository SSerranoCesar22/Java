

public class Main {

	public static void main(String[] args) {
		 Main main = new Main();
		 System.out.println(main.javaOrNull("java"));
		 System.out.println(main.javaOrNull("c"));
	}
	public String javaOrNull(String var) {
		return var == "java" ? "java" : null;
	}

}
