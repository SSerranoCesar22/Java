

public class Main {

	public static void main(String[] args) {
		String alfabeto[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for (int i = 0; i < alfabeto.length; i++) {
				for (int z = alfabeto.length -1 -i ; z >= 0; z--) {
					 System.out.print(alfabeto[z]);
				}
				System.out.println("");
			}
				
	for (int j = 0; j < alfabeto.length; j++) {
		for (int x = 0; x <= j; x++) {
			 System.out.print(alfabeto[x]);
		}
		System.out.println("");
	}


}

}
