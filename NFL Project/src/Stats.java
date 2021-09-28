
public class Stats {
	private String teamName;
	private int wins;
	private int losses;
	private int pointsScored;
	private int pointsAllowed;
	
	public Stats(String t, int w, int l, int pS, int pA) {
		teamName = t;
		wins = w;
		losses = l;
		pointsScored = pS;
		pointsAllowed = pA;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getPointsScored() {
		return pointsScored;
	}

	public void setPointsScored(int pointsScored) {
		this.pointsScored = pointsScored;
	}

	public int getPointsAllowed() {
		return pointsAllowed;
	}

	public void setPointsAllowed(int pointsAllowed) {
		this.pointsAllowed = pointsAllowed;
	}
	

}
