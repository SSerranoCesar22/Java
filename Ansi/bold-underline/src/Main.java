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
        ukraine(BLUE_BG);
        ukraine(BLUE_BG);
        ukraine(YELLOW_BG);
        ukraine(YELLOW_BG);
        System.out.printf(WHITE_BG+"UCRANIA " );
        System.out.printf(BLACK+"UCRANIA" );
        System.out.println();
        france(BLUE_BG);
        france(WHITE_BG);
        france(RED_BG);
        System.out.println();
        france(BLUE_BG);
        france(WHITE_BG);
        france(RED_BG);
        System.out.println();
        france(BLUE_BG);
        france(WHITE_BG);
        france(RED_BG);
        System.out.println("");
        System.out.print(RED_BG+"FRANCIA " );
        System.out.printf(BLACK+"FRANCIA" );
        System.out.println("");
        spain(RED_BG);
        spain(YELLOW_BG);
        spain(YELLOW_BG);
        spain(RED_BG);
        System.out.printf(RED_BG+"ESPAÑA " );
        System.out.printf(BLACK+"ESPAÑA" );
        System.out.println("");
        catalonia(YELLOW_BG);
        catalonia(RED_BG);
        catalonia(YELLOW_BG);
        catalonia(RED_BG);
        catalonia(YELLOW_BG);
        System.out.printf(YELLOW_BG+"CATALUÑA " );
        System.out.printf(BLACK+"CATALUÑA" );
        System.out.println("");
        germany(BLACK_BG);
        germany(RED_BG);
        germany(YELLOW_BG);
        System.out.printf(RED_BG+"ALEMANIA " );
        System.out.printf(BLACK+"ALEMANIA" );
        
    }

    private static void ukraine(String color) {
        System.out.println(color + "           " + RESET);
    }

    private static void france(String color1) {
        System.out.print(color1 + "    "+ RESET);
    }
    private static void spain(String color) {
        System.out.println(color + "           " + RESET);
    }
    private static void catalonia(String color) {
        System.out.println(color + "           " + RESET);
    }
    private static void germany(String color) {
        System.out.println(color + "           " + RESET);
    }
    

}
