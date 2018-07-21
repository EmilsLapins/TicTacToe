
public class Board {

	private final String N = "_"; // "empty"
	private final String O = "O";
	private final String X = "X";


	String[][] gameBoard = {
			{ N, N, N }, 
			{ N, N, N }, 
			{ N, N, N } };

	//
	public boolean winCondition(String test) {

		for (int i = 0; i < gameBoard.length; i++) {

			if (gameBoard[0][i] == test && gameBoard[1][i] == test && gameBoard[2][i] == test) {
				return true;
			}

			if (gameBoard[i][0] == test && gameBoard[i][1] == test && gameBoard[i][2] == test) {
				return true;
			}

		}

		if (gameBoard[0][0] == test && gameBoard[1][1] == test && gameBoard[2][2] == test) {
			return true;
		}

		if (gameBoard[2][0] == test && gameBoard[1][1] == test && gameBoard[0][2] == test) {
			return true;
		}

		return false;
	}

	public boolean isTied() {
	
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (gameBoard[i][j] == N) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	
	public boolean isFree(int x, int y) {
		String isFree = gameBoard[x][y];
		if (isFree.equalsIgnoreCase("X") || (isFree.equalsIgnoreCase("O"))) {
			System.out.println("X: " + x + " Y: " + y + " Full!!!"); // test, delete later
			return false;
		} else {
			System.out.println("X: " + x + " Y: " + y + " Empty, setting value"); // test, delete later
			return true;
		}
	}
	
	public void printValues() {
		System.out.println();
		for (int i = 0; i < gameBoard.length; i++) {
			String[] oneD = gameBoard[i];
			for (int j = 0; j < oneD.length; j++) {
				System.out.print("|" + gameBoard[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void setMove(int x, int y, String choice) {
		gameBoard[x][y] = choice;

	}


	public void resetBoard() { // Resets the board values to "_"
		System.out.println();
		System.out.println("RESET");
		for (int i = 0; i < gameBoard.length; i++) {
			String[] oneD = gameBoard[i];

			for (int j = 0; j < oneD.length; j++) {
				setMove(i, j, N);
				// gameBoard[i][j] = N;
				System.out.print("|" + gameBoard[i][j] + "|");
			}
			System.out.println("");
		}
	}
}
