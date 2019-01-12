package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {

	String height = JOptionPane.showInputDialog("How tall are you in inches");
	int inches=Integer.parseInt(height);
	
	if (inches>48) {
		JOptionPane.showMessageDialog(null, "You are tall enough to go on the roller coaster");
	}
	else {
		JOptionPane.showMessageDialog(null, "Come back when you've grown taller");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
