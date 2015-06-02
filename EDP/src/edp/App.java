package edp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {

	private GUI gui;
	private GameLogic logic;
	
	public App(){
		
		this.gui = new GUI(this);
		this.logic = new GameLogic(this);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		if(event.getActionCommand().equals("buttonpress")){
			if(logic.isNumberWang(Float.parseFloat(gui.getInput()))){
				gui.setOutput("That's numberwang!");
			}
			else{
				gui.setOutput("...");
				
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		App TheGame = new App();
	}

}