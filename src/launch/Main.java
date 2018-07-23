package launch;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		String choice = "";
		Scanner sc = new Scanner(System.in);
		
		while (choice != "0") {
			System.out.println("Tic Tac Toe");
			System.out.println(
					"Enter game mode: '1': Player vs Computer, '2': Computer vs Computer, '3': Player vs Player, '0': Exit");
			choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				//GamePlayerVsPc pVpc = new GamePlayerVsPc();
				Game game1 = new Game("human", "pc2");
				break;
			case "2":
				Game game2 = new Game("pc", "pc2");
				break;
			case "3":
				//GamePlayerVsPlayer pvp = new GamePlayerVsPlayer();
				Game game3 = new Game("human", "human2");
				break;
			case "0":
				System.out.println("Bye!");
				choice = "0";
				break;
			}
		}
	} // main
	
	
	

	


}// class
