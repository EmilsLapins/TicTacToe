import java.util.Scanner;

public class HumanPlayer implements Player {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public int[] makeMove() {
		int x = -1;
		int y = -1;
		do {
			x = getInput("Enter row: ");

		} while (x < 0 || x > 2);

		do {
			y = getInput("Enter column: ");
		} while (y < 0 || y > 2);

		return new int[] { x, y };
	}

	private int getInput(String text) {
		int value = -1;
		do {
			System.out.print(text);
			value = scanner.nextInt();
		} while (value < 0 || value > 2);

		return value;
	}

}
