public class Main {
	 private static String RESET = "\u001b[0;0m";
	    private static String BLACK = "\u001b[0;30m";
	    private static String RED = "\u001b[0;31m";
	    private static String GREEN = "\u001b[0;32m";
	    private static String YELLOW = "\u001b[0;33m";
	    private static String BLUE = "\u001b[0;34m";
	    private static String MAGENTA = "\u001b[0;35m";
	    private static String CYAN = "\u001b[0;36m";
	    private static String WHITE = "\u001b[0;37m";
	    private static String BLACK_BG = "\u001b[48;5;0m";
	    private static String RED_BG = "\u001b[48;5;196m";
	    private static String GREEN_BG = "\u001b[48;5;34m";
	    private static String YELLOW_BG = "\u001b[48;5;226m";
	    private static String BLUE_BG = "\u001b[48;5;21m";
	    private static String MAGENTA_BG = "\u001b[48;5;165m";
	    private static String CYAN_BG = "\u001b[48;5;51m";
	    private static String WHITE_BG = "\u001b[48;5;15m";
	    private static String BOLD = "\u001b[1m";
	    private static String ITALIC = "\u001b[3m";
	    private static String UNDERLINE = "\u001b[4m";
	public static void main(String[] args) {
		  String arr1[] = {"\u001b[0;30m","\u001b[0;31m","\u001b[0;32m","\u001b[0;33m","\u001b[0;34m", "\u001b[0;35m","\u001b[0;36m","\u001b[0;37m" };
		  String[] arr2 = {"\u001b[48;5;0m","\u001b[48;5;196m","\u001b[48;5;34m","\u001b[48;5;226m","\u001b[48;5;21m","\u001b[48;5;165m","\u001b[48;5;51m","\u001b[48;5;15m"};
		  String[] arr3 = {"\u001b[1m","\u001b[3m", "\u001b[4m"};
		  for (int i = 0; i < arr1.length ; i++) {
			System.out.println(arr1[i]+"hello");
	}
		  for (int i = 0; i < arr2.length ; i++) {
				System.out.println(arr2[i]+"hello");
		}
		  for (int i = 0; i < arr3.length ; i++) {
				System.out.println(RESET+arr3[i]+"hello");
		}
	}
}
