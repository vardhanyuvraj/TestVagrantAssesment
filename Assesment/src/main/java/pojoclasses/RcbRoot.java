package pojoclasses;

import java.util.List;

public class RcbRoot {
	private String name;
	private String location;
	private List<Player> player;

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

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return getName() + " " + getLocation() + " " + getPlayer();
	}

}
