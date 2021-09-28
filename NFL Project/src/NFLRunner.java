import java.util.ArrayList;
import java.util.Scanner;

public class NFLRunner {
	static ArrayList<Stats>NFLTeams = new ArrayList<Stats>();
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("This is a program that will ask for the user to plug in new stats for an NFL team, and it will add them to the current stats that the team has. What NFL team would you like to research?");
		//String team = userInput.nextLine();
		NFLTeams.add(new Stats("Texans", 1, 2, 35, 50));
		
System.out.println("cool");
	}

}
