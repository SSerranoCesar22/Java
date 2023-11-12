
public class Main {

	public static void main(String[] args) {

		int num1 = 1, num2 = 2, num3 = 3, num4 = 2;
		Boolean isEqual =  false;
		Boolean isLower =  false;
		Boolean isHigher = false;
		isEqual = num4 == num2 ? true : false;
		System.out.printf("num1: %d num2: %d num3: %d num4: %d %n%n", num1,num2,num3,num4);
		System.out.printf("numero 4 y numero 2 son iguales: %s %n",isEqual);
		isEqual = num2 == num3 ? true : false;
		System.out.printf("numero 3 y numero 2 son iguales: %s %n",isEqual);
		isEqual = num1 != num3 ? true : false;
		System.out.printf("numero 1 y numero 3 son distintos: %s %n",isEqual);
		isEqual = num2 != num2 ? true : false;
		System.out.printf("numero 2 y numero 2 son distintos: %s %n",isEqual);
		isLower = num4 < num3 ? true : false;
		System.out.printf("numero 4 es menor que numero 3: %s %n",isLower);
		isLower = num3 < num1 ? true : false;
		System.out.printf("numero 3 es menor que numero 1: %s %n",isLower);
		isHigher = num1 > num3 ? true : false;
		System.out.printf("numero 1 es mayor que numero 3: %s %n",isHigher);
		isHigher = num2 > num4 ? true : false;
		System.out.printf("numero 2 es mayor que numero 4: %s %n",isHigher);
		isHigher = num2 > num3 ? true : false;
		System.out.printf("numero 2 es mayor que numero 4: %s %n",isHigher);
		isHigher = num2 <= num3 ? true : false;
		System.out.printf("numero 2 es igual o menor que numero 3: %s %n",isHigher);
		isHigher = num2 <= num4 ? true : false;
		System.out.printf("numero 2 es igual o menor que numero 4: %s %n",isHigher);
		isHigher = num2 <= num1 ? true : false;
		System.out.printf("numero 2 es igual o menor que numero 1: %s %n",isHigher);
		isHigher = num1 <= num2 ? true : false;
		System.out.printf("numero 2 es igual o mayor que numero 1: %s %n",isHigher);
		isHigher = num2 <= num1 ? true : false;
		System.out.printf("numero 1 es igual o mayor que numero 2: %s %n",isHigher);
		isHigher = num2 <= num2 ? true : false;
		System.out.printf("numero 2 es igual o mayor que numero 2: %s %n",isHigher);
		
	}

}
