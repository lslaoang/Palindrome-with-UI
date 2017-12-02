package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.Palindrome;

public class Interactor implements ActionListener{
	
	JTextField textInput;
	
	Palindrome pal = new Palindrome();
	
     public Interactor(JTextField text){
		this.textInput = text;
	};

	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		String thistext = textInput.getText();
		
		if(thistext.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please input text.");
		}
		else if(thistext.length()==1) {
			JOptionPane.showMessageDialog(null, "Enter two or three words.");
		}
		else
		JOptionPane.showMessageDialog(null, "The word "+thistext +" is " +pal.isPalindrome(thistext));
	}
	
}
