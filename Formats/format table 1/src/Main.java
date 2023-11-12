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
        System.out.printf(RED+"----------------------------------------");
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf("|"+RESET+ BLUE+ " INFORMACIÓN" + RESET + RED +"%-14s|"+ BLUE + " DATO"+ RESET + RED+"%-6s|", "","" );
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf(RED+"----------------------------------------"); 
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf("|"+RESET+ GREEN+ " El tipo de datos:" + RESET + RED +"%-8s|"+ GREEN + " byte"+ RESET + RED+"%-6s|", "","" );
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf(RED+"----------------------------------------");
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf("|"+RESET+ GREEN+ " Esta formado por:" + RESET + RED +"%-8s|"+ GREEN + " 1 Bytes"+ RESET + RED+"%-3s|", "","" );
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf(RED+"----------------------------------------");
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf("|"+RESET+ GREEN+ " Un byte esta formado por:" + RESET + RED +"|%-2s"+ GREEN + " 8 Bits "+ RESET + RED+"%-1s|", "","" );
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf(RED+"----------------------------------------");
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf("|"+RESET+ GREEN+ " Su rango va del:" + RESET + RED +"%-9s|"+ GREEN + " -128 a 127"+ RESET + RED+"|", "" );
        System.out.println();
        System.out.printf("|%-26s|%-11s|", "","");
        System.out.println();
        System.out.printf(RED+"----------------------------------------");
    }
}
