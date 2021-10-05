import java.util.ArrayList;
import java.util.Scanner;

public class NFLRunner {
	static int team;
	
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
		System.out.println("Enter a number 1-32 that matches up to the team you would like to change their stats.");
		int team = userInput.nextInt();
		System.out.println("Enter 1 if your team wins and enter 2 if they lose this week.");
		int record = userInput.nextInt();
		System.out.println("How many points does your team score this week?");
		int pointsScored = userInput.nextInt();
		System.out.println("How many points are scored against you team this week?");
		int pointsAgainst = userInput.nextInt();
		if(record == 1) {
			Teams.NFLTeams.get(team - 1).setWins(Teams.NFLTeams.get(team - 1).getWins()+ 1);
		}
		else {
			Teams.NFLTeams.get(team - 1).setLosses(Teams.NFLTeams.get(team - 1).getLosses()+ 1);
		}
		Teams.NFLTeams.get(team - 1).setPointsScored(Teams.NFLTeams.get(team - 1).getPointsScored()+ pointsScored);
		Teams.NFLTeams.get(team - 1).setPointsAllowed(Teams.NFLTeams.get(team - 1).getPointsAllowed()+ pointsAgainst);
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
