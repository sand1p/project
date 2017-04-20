package coinGame;

public class Player {
	
	private String playerName;
	private String coinOption;

	public Player(String name){
		playerName=name;
	}
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCoinOption() {
		return coinOption;
	}

	public void setCoinOption(String coinOption) {
		this.coinOption = coinOption;
	}

}
