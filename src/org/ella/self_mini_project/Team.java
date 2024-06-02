package org.ella.self_mini_project;

public class Team {
	private static String teamName;
	private static String pitcher;
	private static String[] playerList = new String[9];

	public Team() {}
	
	public Team(String teamName, String pitcher, String[] playerList) {
		super();
		this.teamName = teamName;
		this.pitcher = pitcher;
		this.playerList = playerList;
	}

	public static String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public static String getPitcher() {
		return pitcher;
	}

	public void setPitcher(String pitcher) {
		this.pitcher = pitcher;
	}

	public static String[] getPlayerList() {
		return playerList;
	}

	public void setPlayerList(String[] playerList) {
		this.playerList = playerList;
	}
}
