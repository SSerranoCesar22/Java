
public class Main {

	public static void main(String[] args) {
		Boolean bool1 = true, bool2 = false, bool3 = false,isTrue;
		
		isTrue = bool1 == bool2 ? true : false;
		System.out.printf("los valores son iguales: %s %n",isTrue);
		isTrue = bool3 == bool2 ? true : false;
		System.out.printf("los valores son iguales: %s %n",isTrue);
	}

}
