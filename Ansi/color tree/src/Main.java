public class Main {
    private static String GREEN_BG = "\u001b[48;5;34m";
    private static String RESET = "\u001b[0;0m";
    private static String BLACK_BG = "\u001b[48;5;0m";
    private static String BLUE_BG = "\u001b[0;44m";
    private static String YELLOW = "\u001b[0;33m";


    public static void main(String[] args) {
        int niveles = 12;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print(BLUE_BG + " " + RESET);
            }

            for (int k = 1; k <= 2 * i; k++) {
               if(k %2 == 0) {
            	   System.out.print(""+YELLOW + GREEN_BG +"*"+RESET);
               }
               
               else{System.out.print(GREEN_BG + "*" + RESET);
               }
            }

            for (int l = 1; l <= niveles - i; l++) {
                System.out.print(BLUE_BG + " " + RESET);
            }

            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= niveles - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 4; k++) {
                System.out.print(RESET + BLACK_BG + "*" + RESET);
            }

            System.out.println();
        }
    }
}
