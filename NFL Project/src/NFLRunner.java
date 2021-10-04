import java.util.ArrayList;
import java.util.Scanner;

public class NFLRunner {
	
	
	public static void main(String[] args) {
		Teams.fillTeams();
		Scanner userInput = new Scanner(System.in);
		System.out.println("This is a program that will ask for the user to plug in new stats for an NFL team, and it will add them to the current stats that the team has. What NFL team would you like to research?");
		for(int i = 0; i < Teams.NFLTeams.size(); i++) {
			System.out.print((i + 1) + ": ");
			System.out.println(Teams.NFLTeams.get(i).getTeamName());
			System.out.println("Wins: " + Teams.NFLTeams.get(i).getWins());
			System.out.println("Losses: " + Teams.NFLTeams.get(i).getLosses());
			System.out.println("Total points scored: " + Teams.NFLTeams.get(i).getPointsScored());
			System.out.println("Total points allowed: " + Teams.NFLTeams.get(i).getPointsAllowed());
			System.out.println(" ");
		}	
		String team = userInput.nextLine();
		switch(team){
		case "Arizona Cardinals":
			System.out.println(Teams.NFLTeams.get(0).getTeamName());
			
		default:
			System.out.println("Hello");
		}
		
		
		
	}

}
