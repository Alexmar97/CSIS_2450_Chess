public class Player {
	private int playerNum;
	private String playerColor;
	public int turnCount;
	private boolean whiteTurn = true;
	
	public Player(int playerNum, String playerColor) {
		this.playerNum = playerNum;
		this.playerColor = playerColor;
	}
	
	public void createPlayer() {
		//does stuff
		System.out.println("Player created!");
	}
	
	public int whoseTurn(int turnCount) {
		if (turnCount == 0) {
			System.out.println("It's White's turn.");
			turnCount++;
		}
		else if (turnCount % 2 ==0) {
			System.out.println("It's White's turn.");
			turnCount++;
		}
		else {
			System.out.println("It's Black's turn.");
			turnCount++;
		}
		
		return turnCount;
		
	}
	
	public int getTurnCount() {
		return turnCount;
	}
	
	public void setTurnCount(int turnCount) {
		this.turnCount = turnCount;
	}
}
