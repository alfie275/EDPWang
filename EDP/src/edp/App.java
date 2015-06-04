package edp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/** App class joins the GUI and game logic together **/
public class App implements ActionListener, KeyListener {

	private GUI gui;
	private GameLogic logic;
	
	public App(){
		
		gui = new GUI(this);
		logic = new GameLogic(this);
		
	}
	
	/** Check if the current;y input number is numberwang **/
	private void checkNumberwang(){
		try{
			if(logic.isNumberwang(Float.parseFloat(gui.getInput()))){
				gui.setOutput("That's numberwang!");
			}
			else{
				gui.setOutput("...");
				
			}
		}
		//If input string is not a number, inform the player
		catch(NumberFormatException nfe)  
		{  
			gui.setOutput("That's not a number!");
		}  
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		if(event.getActionCommand().equals("buttonpress")){
			checkNumberwang();
		}
		
	}
	
	public void keyPressed(KeyEvent event){
		if(event.getKeyCode()==KeyEvent.VK_ENTER){
			checkNumberwang();
		}
		
	}
	
	public void keyTyped(KeyEvent event){
		
	}
	
	public void keyReleased(KeyEvent event){
		
	}
	
	
	
	public static void main(String[] args) {
		App TheGame = new App();
	}

}
