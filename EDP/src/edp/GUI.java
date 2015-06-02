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
	
	
	private JTextField textField;
	private JPanel bottomPanel;
	private JButton enterNumber;
	private JLabel output;
	
	private App app;
	
	public void setOutput(String newText){
		output.setText(newText);
		
	}
	
	public String getInput(){
		return textField.getText();
		
	}
	
	public GUI(App nApp){
		this.app = nApp;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 20));
		this.setTitle("Numberwang!");
		this.setVisible(true);
		
		
		this.bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
		
		this.textField = new JTextField("number input", 8);
		
		this.enterNumber = new JButton("enter number");
		
		this.enterNumber.setActionCommand("buttonpress");
		this.enterNumber.addActionListener(app);
		
		this.bottomPanel.add(this.textField);
		this.bottomPanel.add(this.enterNumber);
		
		this.output = new JLabel("output", JLabel.CENTER);
		
		this.getContentPane().add(this.output, BorderLayout.NORTH);
		this.getContentPane().add(this.bottomPanel, BorderLayout.SOUTH);
		this.setSize(500, 500);
	
	}

}
