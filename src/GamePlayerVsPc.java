
public class GamePlayerVsPc {
	static HumanPlayer player1 = new HumanPlayer();
	static ComputerPlayer comp1 = new ComputerPlayer();
	
static Board board = new Board();
	
	 public GamePlayerVsPc() {
		 Launch();
		 reset();
	}
	
	
	public void reset() {
		board.resetBoard();
	}
	
	public void Launch() {
		boolean oWins = false;
		boolean xWins = false;
		boolean isTied = false;
		board.printValues();

		while (oWins == false && isTied == false && xWins == false) {

		
			if (oWins == true) {
			} else if (xWins == true) {
				System.out.println("X wins!");
			} else if (isTied == true) {
				System.out.println("Tied!");
			} else {
				Player1();
			}

			isTied = board.isTied();

			oWins = board.winCondition("O");

			xWins = board.winCondition("X");

			if (oWins == true) {
				System.out.println("O wins!");
			} else if (xWins == true) {
				System.out.println("X wins!");
			}else if (isTied == true) {
				System.out.println("Tied!");
			}else {
				Player2();
			}
		}

		
	}

	public static void Player1() {
		System.out.println('X');
		int[] output2 = player1.makeMove();
		int x = output2[0]; // x
		int y = output2[1]; // y
		if (board.isFree(x, y)) {

			board.setMove(x, y, "X");
			board.printValues();
			
		} else {
			Player1();  // recursion can be useful!
			
		}
	}

	public static void Player2() {
		
		System.out.println("O");
		int[] output1 = comp1.makeMove();
		int x1 = output1[0]; // x
		int y1 = output1[1]; // y
		if (board.isFree(x1, y1)) {

			board.setMove(x1, y1, "O");
			board.printValues();
			
		} else {
			Player2();
			
		}
	}

}