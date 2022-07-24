package test.pojo;

import java.util.List;

public class Team {

	String name;
	String location;
	List<Player> players;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", location=" + location + ", players=" + players + "]";
	}
	
	
	
}
