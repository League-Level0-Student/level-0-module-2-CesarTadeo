package methods;

import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you in years");
	int years=Integer.parseInt(age);
	
	if (years>18) {
		JOptionPane.showInputDialog("Who do you want the next president to be.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
