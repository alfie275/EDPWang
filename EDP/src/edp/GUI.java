package edp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUI extends JFrame {
	

	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	private JPanel bottomPanel;
	private JButton enterNumber;
	private JLabel output;
	
	private App app;
	
	/** Set the string in the label **/
	public void setOutput(String newText){
		output.setText(newText);
		
	}
	
	/** Get the string from the textfield **/
	public String getInput(){
		return textField.getText();
		
	}
	
	public GUI(App app){
		this.app = app;
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 20));
		setTitle("Numberwang!");
		setVisible(true);
		
		
		bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
		
		textField = new JTextField("number input", 8);
		textField.addKeyListener(app);
		
		enterNumber = new JButton("enter number");
		
		enterNumber.setActionCommand("buttonpress");
		enterNumber.addActionListener(app);
		
		bottomPanel.add(textField);
		bottomPanel.add(enterNumber);
		
		output = new JLabel("output", JLabel.CENTER);
		
		getContentPane().add(output, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		setSize(500, 500);
	
	}

}
