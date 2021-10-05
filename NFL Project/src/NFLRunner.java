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
		int team = userInput.nextInt();
		System.out.println("Enter 1 if your team wins and eter 2 if they lose this week.");
		int record = userInput.nextInt();
		if(record == 1) {
			Teams.NFLTeams.get(team - 1).setWins(Teams.NFLTeams.get(0).getWins()+ 1);
		}
		else {
			Teams.NFLTeams.get(team - 1).setLosses(Teams.NFLTeams.get(0).getLosses()+ 1);
		}
		switch(team){
		case 1:
			System.out.println(Teams.NFLTeams.get(0).getTeamName());
			System.out.println(Teams.NFLTeams.get(0).getWins());
			System.out.println(Teams.NFLTeams.get(0).getLosses());
			break;
		case 2:
			System.out.println(Teams.NFLTeams.get(1).getTeamName());
			break;
		case 3:
			System.out.println(Teams.NFLTeams.get(2).getTeamName());
			break;
		case 4:
			System.out.println(Teams.NFLTeams.get(3).getTeamName());
			break;
		case 5:
			System.out.println(Teams.NFLTeams.get(4).getTeamName());
			break;
		case 6:
			System.out.println(Teams.NFLTeams.get(5).getTeamName());
			break;
		case 7:
			System.out.println(Teams.NFLTeams.get(6).getTeamName());
			break;
		case 8:
			System.out.println(Teams.NFLTeams.get(7).getTeamName());
			break;
		case 9:
			System.out.println(Teams.NFLTeams.get(8).getTeamName());
			break;
		case 10:
			System.out.println(Teams.NFLTeams.get(9).getTeamName());
			break;
		case 11:
			System.out.println(Teams.NFLTeams.get(10).getTeamName());
			break;
		case 12:
			System.out.println(Teams.NFLTeams.get(11).getTeamName());
			break;
		case 13:
			System.out.println(Teams.NFLTeams.get(12).getTeamName());
			break;
		case 14:
			System.out.println(Teams.NFLTeams.get(13).getTeamName());
			break;
		case 15:
			System.out.println(Teams.NFLTeams.get(14).getTeamName());
			break;
		case 16:
			System.out.println(Teams.NFLTeams.get(15).getTeamName());
			break;
		case 17:
			System.out.println(Teams.NFLTeams.get(16).getTeamName());
			break;
		case 18:
			System.out.println(Teams.NFLTeams.get(17).getTeamName());
			break;
		case 19:
			System.out.println(Teams.NFLTeams.get(18).getTeamName());
			break;
		case 20:
			System.out.println(Teams.NFLTeams.get(19).getTeamName());
			break;
		case 21:
			System.out.println(Teams.NFLTeams.get(20).getTeamName());
			break;
		case 22:
			System.out.println(Teams.NFLTeams.get(21).getTeamName());
			break;
		case 23:
			System.out.println(Teams.NFLTeams.get(22).getTeamName());
			break;
		case 24:
			System.out.println(Teams.NFLTeams.get(23).getTeamName());
			break;
		case 25:
			System.out.println(Teams.NFLTeams.get(24).getTeamName());
			break;
		case 26:
			System.out.println(Teams.NFLTeams.get(25).getTeamName());
			break;
		case 27:
			System.out.println(Teams.NFLTeams.get(26).getTeamName());
			break;
		case 28:
			System.out.println(Teams.NFLTeams.get(27).getTeamName());
			break;
		case 29:
			System.out.println(Teams.NFLTeams.get(28).getTeamName());
			break;
		case 30:
			System.out.println(Teams.NFLTeams.get(29).getTeamName());
			break;
		case 31:
			System.out.println(Teams.NFLTeams.get(30).getTeamName());
			break;
		case 32:
			System.out.println(Teams.NFLTeams.get(31).getTeamName());
			break;
			
		}
		
		
		
	}

}
