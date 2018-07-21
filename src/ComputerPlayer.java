import java.util.Random;

public class ComputerPlayer implements Player {
	Random rnd1 = new Random();
	
	
	
	@Override
	public int[] makeMove() {
		
		
		int x = rnd1.nextInt(3);
		int y = rnd1.nextInt(3);
		
		
		return new int[] { x, y };
	}

}
