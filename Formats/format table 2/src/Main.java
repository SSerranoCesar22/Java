public class Main {
    private static String GREEN_BG = "\u001b[48;5;34m";
    private static String RESET = "\u001b[0;0m";
    private static String BLACK_BG = "\u001b[48;5;0m";
    private static String BLUE_BG = "\u001b[0;44m";
    private static String YELLOW = "\u001b[0;33m";
    private static String RED = "\u001b[0;31m";
    private static String BLUE = "\u001b[0;34m";
    private static String GREEN = "\u001b[0;32m";


    public static void main(String[] args) {
    	System.out.printf(RED+"--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf(RESET+ BLUE+ " Rango byte desde: -128" + RESET + RED +"%-7s"+ BLUE + "hasta: 127"+ RESET + RED,"" );
        System.out.println();
        System.out.println();
        System.out.printf(RED+"--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf(RESET+ GREEN+ " Rango short desde: -32768" + RESET + RED +"%-8s"+ GREEN + "hasta: 32767"+ RESET + RED,"" );
        System.out.println();
        System.out.println();
        System.out.printf(RED+"--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf(RESET+ GREEN+ " Rango int desde: -2147483648" + RESET + RED +"%-8s"+ GREEN + "hasta: 2147483647"+ RESET + RED,"" );
        System.out.println();
        System.out.println();
        System.out.printf(RED+"--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf(RESET+ GREEN+ " Rango long desde: -9223372036854775808" + RESET + RED +"%-2s"+ GREEN + "hasta: 9223372036854775807"+ RESET + RED,"" );
        System.out.println();
        System.out.println();
        System.out.printf(RED+"--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf(RESET+ GREEN+ " Rango float desde: 1.4E-45" + RESET + RED +"%-9s"+ GREEN + " hasta: 3.4028235E38"+ RESET + RED,"" );
        System.out.println();
        System.out.println();
        System.out.printf(RED+"--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf(RESET+ GREEN+ " Rango double desde: 4.9E-324" + RESET + RED +"%-9s"+ GREEN + " hasta: 1.7976931348623157E308"+ RESET + RED,"" );
        System.out.println();
        System.out.println();
        System.out.printf(RED+"--------------------------------------------------------------------");
    }
}
