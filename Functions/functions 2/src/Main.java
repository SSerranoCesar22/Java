

public class Main {

	public static void main(String[] args) {
		 Main main = new Main();
		 System.out.println(main.login("admin" , "1234"));
		 System.out.println(main.login("user", "22134"));
	}
	public String login(String login, String password) {
		return login == "admin" && password == "1234" ? "Login true" : "Login false";
	}

}
