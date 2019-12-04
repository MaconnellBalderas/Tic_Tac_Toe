package Tic_Tac_Toe.Tic_Tac_Toe;


public class Tic_Tac_Toe {
	
	GameMenu menu = new GameMenu();

	public static void main(String[] args) {
		Tic_Tac_Toe game = new Tic_Tac_Toe();
		game.run();
	}

	public void run() {
		menu.displayGame();
	}

}
