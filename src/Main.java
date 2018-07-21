
public class Main {

	static Board board = new Board();
	static HumanPlayer player1 = new HumanPlayer();
	static HumanPlayer player2 = new HumanPlayer();

	static ComputerPlayer comp1 = new ComputerPlayer();
	static ComputerPlayer comp2 = new ComputerPlayer();

	public static void main(String[] args) {
		boolean oWins = false;
		boolean xWins = false;
		boolean isTied = false;
		board.printValues();

		while (oWins == false && isTied == false && xWins == false) {

			///////

			isTied = board.isTied();

			oWins = board.winCondition("O");

			xWins = board.winCondition("X");

			if (isTied == true) {
				System.out.println("Tied!");
			} else if (oWins == true) {
				System.out.println("O wins!");

			} else if (xWins == true) {
				System.out.println("X wins!");
			} else {
				Player1();
			}

			isTied = board.isTied();

			oWins = board.winCondition("O");

			xWins = board.winCondition("X");

			if (isTied == true) {
				// System.out.println("Tied!");
			} else if (oWins == true) {
				System.out.println("O wins!");

			} else if (xWins == true) {
				System.out.println("X wins!");
			} else {
				Player2();
			}
		}

	} // main

	public static void Player1() {
		System.out.println('X');
		int[] output2 = player2.makeMove();
		int x = output2[0]; // x
		int y = output2[1]; // y
		if (board.isFree(x, y)) {

			board.setMove(x, y, "X");
			board.printValues();
			
		} else {
			Player1();  // recursion can be useful!
			board.printValues();
		}
	}

	public static void Player2() {
		
		System.out.println("O");
		int[] output1 = player1.makeMove();
		int x1 = output1[0]; // x
		int y1 = output1[1]; // y
		if (board.isFree(x1, y1)) {

			board.setMove(x1, y1, "O");
			board.printValues();
			
		} else {
			Player2();
			board.printValues();
		}
	}

}// class
