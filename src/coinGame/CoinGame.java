package coinGame;

import java.util.Scanner;

public class CoinGame {
	Player[] players = new Player[2];

	public CoinGame(String player1Name, String player2Name) {
		players[0].setPlayerName(player1Name);
		players[1].setPlayerName(player2Name);
	}

	public static void main(String[] args) {
		startGame();
	}

	public static void startGame() {
		int count = 0;
		String name = inputPlayerNames(count++);
		Player player1 = new Player(name);
		name = inputPlayerNames(count++);
		Player player2 = new Player(name);
		Player chosenPlayer = choosePlayer(player1, player2);
		chosenPlayer.setCoinOption(choseCoinOption());
		Coin theCoin = new Coin();
		String winningFlip= theCoin.flipCoin();
		showResult(winningFlip,chosenPlayer);
	}

	public static String choseCoinOption() {
		return (Math.random() > 0.5) ? "Head" : "Tail";
	}

	public static String inputPlayerNames(int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player " + count + " name :");
		String name = sc.nextLine();
		sc.close();
		return name;
	}

	public static Player choosePlayer(Player player1, Player player2) {
		return (Math.random() > 0.5) ? player1 : player2;
	}

	public static void showResult(String winningFlip, Player chosenPlayer){
		System.out.println(" Result : " + chosenPlayer.getPlayerName());
		System.out.println((winningFlip == chosenPlayer.getCoinOption()) ? " Won " : "Lost" ) ;
	}
}
