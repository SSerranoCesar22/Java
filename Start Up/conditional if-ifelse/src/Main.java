import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float temperatura;
		int key;
		String clima = "";
		String categoria = "";
		System.out.println("introduce la temperatura: ");
		temperatura = sc.nextFloat();
		/*
		 * if (temperatura < 10) { categoria = "Climas fríos ";
		 * 
		 * if (temperatura < 5) { clima = "Polar"; } if (temperatura >= 5 && temperatura
		 * < 10) { clima = "Alta montaña"; } if (temperatura >= 10 && temperatura <
		 * 13.5) { clima = "Alta Oceánico"; } } if (temperatura >= 10 && temperatura <
		 * 20) { categoria = "Climas tempaldos"; if (temperatura >= 13.5 && temperatura
		 * < 16.5) { clima = "Mediterráneo"; } if (temperatura >= 16.5 && temperatura <
		 * 20) { clima = "Continental"; }
		 * 
		 * } if (temperatura >= 20) { categoria = "Climas cálidos"; if (temperatura >=
		 * 20 && temperatura < 23.5) { clima = "Ecuatorial"; } if (temperatura >= 23.5
		 * && temperatura < 26.5) { clima = "Tropical"; } if (temperatura >= 26.5) {
		 * clima = "Desértico"; }
		 * 
		 * }
		 * 
		 * System.out.
		 * printf("la temperatura es: %f, por lo tanto la categoria de clima es: %s, y el clima: %s"
		 * , temperatura, categoria, clima);
		 */
		
		

		if (temperatura < 10) {
			categoria = "Climas fríos ";

			if (temperatura < 5) {
				clima = "Polar";
			}
			else if (temperatura >= 5 && temperatura < 10) {
				clima = "Alta montaña";
			}
			
		}
		else if (temperatura >= 10 && temperatura < 20) {
			categoria = "Climas tempaldos";
			if(temperatura >= 10 && temperatura < 13.5) {
				clima = "Alta Oceánico";
			}
			else if (temperatura >= 13.5 && temperatura < 16.5) {
				clima = "Mediterráneo";
			}
			else {
				clima = "Continental";
			}

		}
		else{
			categoria = "Climas cálidos";
			if (temperatura >= 20 && temperatura < 23.5) {
				clima = "Ecuatorial";
			}
			else if (temperatura >= 23.5 && temperatura < 26.5) {
				clima = "Tropical";
			}
			else{
				clima = "Desértico";
			}

		}

		System.out.printf("la temperatura es: %f, por lo tanto la categoria de clima es: %s, y el clima: %s", temperatura,
				categoria, clima);
	}

}
