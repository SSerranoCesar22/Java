
public class Main {

	public static void main(String[] args) {
		int randNum = (int) (Math.random()* 2);
		String resultado ;
		if(randNum == 1) {
			System.out.printf("rojo %s %n",true);
		}
		if(randNum == 1) {
			System.out.printf("rojo %s %n",true);
		}
		else {
			System.out.printf("negro %s %n",false);
		}
		resultado = randNum == 1 ? "rojo " + true : "negro " + false;
		System.out.printf("%s",resultado);
	}

}
