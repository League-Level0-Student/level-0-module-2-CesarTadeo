import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {

		Random n = new Random();
		int lot=
		String lottery="";
		
		for(int i=0;i<5;i++) {
			lot=n.nextInt(100);
			lottery+="";
		}
		JOptionPane.showMessageDialog(null, lottery);
	}
}
