package edp;

import java.util.Random;

public class GameLogic {

	private Random random;
	
	private App app;
	
	public GameLogic(App app){
		random = new Random();
		this.app = app;
	}
	
	/** Function that returns if the given number is numberwang **/
	public boolean isNumberwang(float number){
		
		return random.nextBoolean();
		
	}
	

	
}
