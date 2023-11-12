public class Main {
    private static String RESET = "\u001b[0;0m";
    private static String BLACK = "\u001b[0;30m";
    private static String RED = "\u001b[0;31m";
    private static String YELLOW = "\u001b[0;33m";
    private static String BLUE_BG = "\u001b[0;44m";
    private static String RED_BG = "\u001b[48;5;196m";  
    private static String YELLOW_BG = "\u001b[48;5;226m";
    private static String WHITE_BG = "\u001b[48;5;15m";
    private static String BLACK_BG = "\u001b[48;5;0m";
    private static String WHITE = "\u001b[0;37m";
	public static void main(String[] args) {
	 String text = "Hola que tal";
	 String respuesta = "bien";
	 formatText(text,respuesta);
	}
public static void formatText(String text, String text2) {
	System.out.printf(WHITE_BG+ text);
	System.out.printf(" "+RED + text2 );
}

}
