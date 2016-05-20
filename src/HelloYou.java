/**
 *   File Name: HelloYou.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 19, 2016
 *   
 */

/**
 * HelloYou //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Hamilton, James
 * @version     1.0.0
 * @since       1.0
 *
 */
import java.util.*;

public class HelloYou {
	static Scanner scanner = new Scanner(System.in);

	static String[] userVars;
	static String[] details;

	public static void exitApplication() {

		System.out.println("\nThank you for using the SQA Greeting Application!");
		System.exit(0);
	}

	public static void main(String[] args) {

		String name;

		System.out.println("Hello, and welcome to SQA Selenium Boot Camp");

		System.out.print("Could I please get your name? ");

		name = scanner.nextLine();

		details = requestUserInfo(name, "age", "city of residence", "favorite color", "current mood");

		outputUserDetails(name);

		exitApplication();
	}

	public static void outputUserDetails(String name) {

		System.out.println("\nWell " + name + ", it seems I have learned enough about you.");

		for (int i = userVars.length - 1; i > 0; i--) {

			System.out.println("Your " + details[i] + " is " + userVars[i] + ".");

		}
	}

	public static String[] requestUserInfo(String name, String... details) {

		userVars = new String[details.length];

		System.out.println("I am excited to learn more about you " + name + "!");

		for (int i = 0; i < details.length; i++) {

			System.out.print("Can I get your " + details[i] + ", please? ");

			userVars[i] = scanner.nextLine();
		}

		return details;
	}
}
