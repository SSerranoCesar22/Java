
public class Main {

	public static void main(String[] args) {
		int num = 0;
		long nuum = 123;
		byte n;
		short nu;
		Integer nuuum = 0;
//		System.out.println(nuuum instanceof Integer );
		
		Main m = new Main();
		m.checkClass(num);
		m.checkClass(nuum);
		
	}

	public Object checkClass(Object inputClass) {
		System.out.println(((Object) inputClass).getClass().getSimpleName());
		return inputClass;
	}
}
