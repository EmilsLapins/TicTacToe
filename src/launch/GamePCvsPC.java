package launch;

public class GamePCvsPC {
	

	//static ComputerPlayer player1 = new ComputerPlayer();
	//static ComputerPlayer player2 = new ComputerPlayer();

	static Board board = new Board();
	
	public GamePCvsPC() {
		
		Launch();
		reset();
	}
	
	
	
	private void reset() {
		board.resetBoard();
	}
	
	private void Launch() {
		boolean oWins = false;
		boolean xWins = false;
		boolean isTied = false;
		board.printValues();

		while (oWins == false && isTied == false && xWins == false) {

			isTied = board.isTied();

			oWins = board.winCondition("O");

			xWins = board.winCondition("X");
		
			if (oWins == true) {
				System.out.println("O wins!");
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
				//System.out.println("O wins!");
			} else if (xWins == true) {
				System.out.println("X wins!");
			}else if (isTied == true) {
				System.out.println("Tied!");
			}else {
				Player2();
			}
		}
	}

	private static void Player1() {
		
		ComputerPlayer player1 = new ComputerPlayer();
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

	private static void Player2() {
		ComputerPlayer player2 = new ComputerPlayer();
		System.out.println("O");
		int[] output1 = player2.makeMove();
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
