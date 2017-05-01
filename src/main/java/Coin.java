public class Coin {
	static State flipCoin() {
		return (Math.random() > 0.5) ? State.HEAD : State.TAIL;
	}
}
