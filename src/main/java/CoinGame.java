//import java.util.Scanner;
//
//public class CoinGame {
//
//	public static void startGame() {
//		int count = 0;
//		String name = inputPlayerNames(count++);
//		Player player1 = new Player(name);
//		name = inputPlayerNames(count++);
//		Player player2 = new Player(name);
//		Player chosenPlayer = choosePlayer(player1, player2);
//		chosenPlayer.setCoinOption(choseCoinOption());
//		Coin theCoin = new Coin();
//		String winningFlip= theCoin.flipCoin();
//		showResult(winningFlip,chosenPlayer);
//	}
//
//	public static String choseCoinOption() {
//		return (Math.random() > 0.5) ? "Head" : "Tail";
//	}
//
//	public static String inputPlayerNames(int count) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Player " + count + " name :");
//		sc.close();
//		if(count == 1) {
//			return "A";
//		}
//		else {
//			return "B";
//		}
//	}
//
//	public static Player choosePlayer(Player player1, Player player2) {
//		return (Math.random() > 0.5) ? player1 : player2;
//	}
//
//	public static void showResult(String winningFlip, Player chosenPlayer){
//		System.out.println(" Result : " + chosenPlayer.getPlayerName());
//		System.out.println((winningFlip == chosenPlayer.getCoinOption()) ? " Won " : "Lost" ) ;
//	}
//
//	public static void main(String[] args) {
//		startGame();
//	}
//}
