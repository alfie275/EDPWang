package edp;

import java.util.Random;

public class GameLogic {

	private Random random;
	
	private App app;
	
	public GameLogic(App nApp){
		this.random = new Random();
		this.app = nApp;
	}
	
	
	public boolean isNumberWang(float number){
		
		return this.random.nextBoolean();
		
	}
	

	
}
