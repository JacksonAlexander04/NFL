import java.util.ArrayList;
public class Teams {
	static ArrayList<Stats> NFLTeams = new ArrayList<Stats>();
	
	public static void fillTeams() {
	NFLTeams.add(new Stats("Arizona Cardinals", 4, 0, 140, 85));
	NFLTeams.add(new Stats("Atlanta Falcons", 1, 3, 78, 128));
	NFLTeams.add(new Stats("Baltimore Ravens", 3, 1, 105, 92));
	NFLTeams.add(new Stats("Buffalo Bills", 3, 1, 134, 44));
	NFLTeams.add(new Stats("Carolina Panthers", 3, 1, 97, 66));
	NFLTeams.add(new Stats("Chicago Bears", 2, 2, 64, 91));
	NFLTeams.add(new Stats("Cincinnati Bengals", 3, 1, 92, 75));
	NFLTeams.add(new Stats("Cleveland Browns", 3, 1, 100, 67));
	NFLTeams.add(new Stats("Dallas Cowboys", 3, 1, 126, 97));
	NFLTeams.add(new Stats("Denver Broncos", 3, 1, 83, 49));
	NFLTeams.add(new Stats("Detroit Lions", 0, 4, 81, 119));
	NFLTeams.add(new Stats("Green Bay Packers", 3, 1, 95, 100));
	NFLTeams.add(new Stats("Houston Texans", 1, 3, 67, 116));
	NFLTeams.add(new Stats("Indianapolis Colts", 1, 2, 83, 87));
	NFLTeams.add(new Stats("Jacksonville Jaguars", 0, 4, 74, 115));
	NFLTeams.add(new Stats("Kansas City Chiefs", 2, 2, 134, 125));
	NFLTeams.add(new Stats("Las Vegas Raiders", 3, 0, 90, 72));
	NFLTeams.add(new Stats("Los Angeles Chargers", 1, 2, 67, 60));
	NFLTeams.add(new Stats("Los Angeles Rams", 3, 1, 115, 99));
	NFLTeams.add(new Stats("Miami Dolphins", 1, 3, 62, 109));
	NFLTeams.add(new Stats("Minnesota Vikings", 1, 3, 94, 92));
	NFLTeams.add(new Stats("New England Patriots", 1, 3, 71, 70));
	NFLTeams.add(new Stats("New Orleans Saints", 2, 2, 94, 69));
	NFLTeams.add(new Stats("New York Giants", 1, 3, 35, 50));
	NFLTeams.add(new Stats("New York Jets", 1, 3, 47, 94));
	NFLTeams.add(new Stats("Philadelphia Eagles", 1, 3, 94, 106));
	NFLTeams.add(new Stats("Pittsburgh Steelers", 1, 3, 67, 93));
	NFLTeams.add(new Stats("San Francisco 49ers", 2, 2, 107, 102));
	NFLTeams.add(new Stats("Seattle Seahawks", 2, 2, 103, 100));
	NFLTeams.add(new Stats("Tampa Bay Buccaneers", 3, 1, 122, 105));
	NFLTeams.add(new Stats("Tennessee Titans", 2, 2, 95, 111));
	NFLTeams.add(new Stats("Washington Football Team", 2, 2, 101, 122));
	
	}
	public static void printTeams() {
		System.out.println(NFLRunner.team);
		System.out.println(Teams.NFLTeams.get(NFLRunner.team ).getTeamName() + ":");
		System.out.println("Your team has a record of " + NFLTeams.get(NFLRunner.team).getWins() + "-" + NFLTeams.get(NFLRunner.team).getLosses());
		System.out.println("Your team has scored a total of " + NFLTeams.get(NFLRunner.team).getPointsScored() + " points this season so far.");
		System.out.println("Your team has allowed a total of " + NFLTeams.get(NFLRunner.team).getPointsAllowed() + " to be scored on them.");
	
	}
}
