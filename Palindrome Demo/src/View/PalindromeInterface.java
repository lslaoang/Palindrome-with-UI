package View;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controller.*;

public class PalindromeInterface extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField textInput = new JTextField(20);
	JButton buttonRun = new JButton();
	JPanel contentHolder = new JPanel();
	JLabel labelTop = new JLabel("Enter a word");
	
	ActionListener interact = new Interactor(textInput);
	
	public PalindromeInterface(){
		setTitle("Palindrome");
		setSize(250, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//text
		textInput.setBounds(18, 50, 200, 30);
		textInput.setHorizontalAlignment(JTextField.CENTER);
		
		//button
		buttonRun.setBounds(70, 100, 100, 30);
		buttonRun.setText("Test");
		buttonRun.setVisible(true);
		buttonRun.addActionListener(interact);
		
		getRootPane().setDefaultButton(buttonRun);
		
		//label
		labelTop.setBounds(18, 15, 200, 25);
		
		contentHolder.setLayout(null);
		
		
		
		contentHolder.add(textInput);
		contentHolder.add(buttonRun);
		contentHolder.add(labelTop);
		add(contentHolder);
		
		
			
	}//end of constructor
	
	//getter
	public String getTextInput(){
		return textInput.getText();
	}
	
	public static void main(String args[]){
		new PalindromeInterface();
	}//end of main
}//end of class
