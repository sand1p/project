package coinGame;

public class Coin {
	private int coinOption;

	public int getCoinOption() {
		return coinOption;
	}

	public void setCoinOption(int coinOption) {
		this.coinOption = coinOption;
	}

	public Coin createCoin() {
		return new Coin();
	}

	public String flipCoin() {
		return (Math.random() > 0.5) ? "Head" : "Tail";
	}
}
