package application;

public class Player 
{
	private String name = null;
	private String team = null;
	//overloaded constructor
	public Player(String name, String team) 
	{
		this.name = name;
		this.team = team;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//getter for team name
	public String getTeam() {
		return team;
	}
	//setter for team name
	public void setTeam(String team) {
		this.team = team;
	}

	
	
}
