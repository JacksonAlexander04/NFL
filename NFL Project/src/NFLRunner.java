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
		switch(team){
		case 1:
			System.out.println(Teams.NFLTeams.get(0).getTeamName());
		case 2:
			System.out.println(Teams.NFLTeams.get(1).getTeamName());
		case 3:
			System.out.println(Teams.NFLTeams.get(2).getTeamName());
		case 4:
			System.out.println(Teams.NFLTeams.get(3).getTeamName());
		case 5:
			System.out.println(Teams.NFLTeams.get(4).getTeamName());
		case 6:
			System.out.println(Teams.NFLTeams.get(5).getTeamName());
		case 7:
			System.out.println(Teams.NFLTeams.get(6).getTeamName());
		case 8:
			System.out.println(Teams.NFLTeams.get(7).getTeamName());
		case 9:
			System.out.println(Teams.NFLTeams.get(8).getTeamName());
		case 10:
			System.out.println(Teams.NFLTeams.get(9).getTeamName());
		case 11:
			System.out.println(Teams.NFLTeams.get(10).getTeamName());
		case 12:
			System.out.println(Teams.NFLTeams.get(11).getTeamName());
		case 13:
			System.out.println(Teams.NFLTeams.get(12).getTeamName());
		case 14:
			System.out.println(Teams.NFLTeams.get(13).getTeamName());
		case 15:
			System.out.println(Teams.NFLTeams.get(14).getTeamName());
		case 16:
			System.out.println(Teams.NFLTeams.get(15).getTeamName());
		case 17:
			System.out.println(Teams.NFLTeams.get(16).getTeamName());
		case 18:
			System.out.println(Teams.NFLTeams.get(17).getTeamName());
		case 19:
			System.out.println(Teams.NFLTeams.get(18).getTeamName());
		case 20:
			System.out.println(Teams.NFLTeams.get(19).getTeamName());
		case 21:
			System.out.println(Teams.NFLTeams.get(20).getTeamName());
		case 22:
			System.out.println(Teams.NFLTeams.get(21).getTeamName());
		case 23:
			System.out.println(Teams.NFLTeams.get(22).getTeamName());
		case 24:
			System.out.println(Teams.NFLTeams.get(23).getTeamName());
		case 25:
			System.out.println(Teams.NFLTeams.get(24).getTeamName());
		case 26:
			System.out.println(Teams.NFLTeams.get(25).getTeamName());
		case 27:
			System.out.println(Teams.NFLTeams.get(26).getTeamName());
		case 28:
			System.out.println(Teams.NFLTeams.get(27).getTeamName());
		case 29:
			System.out.println(Teams.NFLTeams.get(28).getTeamName());
		case 30:
			System.out.println(Teams.NFLTeams.get(29).getTeamName());
		case 31:
			System.out.println(Teams.NFLTeams.get(30).getTeamName());
		case 32:
			System.out.println(Teams.NFLTeams.get(31).getTeamName());
			
		}
		
		
		
	}

}
