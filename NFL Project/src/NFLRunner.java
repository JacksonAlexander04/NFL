
import java.util.Scanner;

public class NFLRunner {
	static int team;
	static int record;
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		Teams.fillTeams();
		
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
		System.out.println("Enter a number 1-32 that matches up to the team you would like to change their stats.");
		team = userInput.nextInt();
		
		switch(team){
		case 1:
			Teams.printTeams();
			break;
		case 2:
			
			Teams.printTeams();
			break;
		case 3:
			Teams.printTeams();
			break;
		case 4:
			Teams.printTeams();
			break;
		case 5:
			Teams.printTeams();
			break;
		case 6:
			Teams.printTeams();
			break;
		case 7:
			Teams.printTeams();
			break;
		case 8:
			Teams.printTeams();
			break;
		case 9:
			Teams.printTeams();
			break;
		case 10:
			Teams.printTeams();
			break;
		case 11:
			Teams.printTeams();
			break;
		case 12:
			Teams.printTeams();
			break;
		case 13:
			Teams.printTeams();
			break;
		case 14:
			Teams.printTeams();
			break;
		case 15:
			Teams.printTeams();
			break;
		case 16:
			Teams.printTeams();
			break;
		case 17:
			Teams.printTeams();
			break;
		case 18:
			Teams.printTeams();
			break;
		case 19:
			Teams.printTeams();
			break;
		case 20:
			Teams.printTeams();
			break;
		case 21:
			Teams.printTeams();
			break;
		case 22:
			Teams.printTeams();
			break;
		case 23:
			Teams.printTeams();
			break;
		case 24:
			Teams.printTeams();
			break;
		case 25:
			Teams.printTeams();
			break;
		case 26:
			Teams.printTeams();
			break;
		case 27:
			Teams.printTeams();
			break;
		case 28:
			Teams.printTeams();
			break;
		case 29:
			Teams.printTeams();
			break;
		case 30:
			Teams.printTeams();
			break;
		case 31:
			Teams.printTeams();
			break;
		case 32:
			Teams.printTeams();
			break;
			
		}
		
		
		
	}

}
