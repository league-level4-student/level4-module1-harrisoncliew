package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Saturday" :
			String weekend = JOptionPane.showInputDialog("Today is the first day of the weekend!! Would you rather code or read in your free time?");
			switch(weekend) {
			case "code" :
				JOptionPane.showMessageDialog(null, "Hooray! You will get a new computer of your choice!!");
				break;
			case "read" :
				JOptionPane.showMessageDialog(null, "Hooray! You will get to choose any 10 books of your choice!!");
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Empty message :(");
				break;
			}
			break;
		case "Sunday" :
			JOptionPane.showMessageDialog(null, "Today is the last day of the weekend :(");
			break;
		case "Monday":
			 JOptionPane.showMessageDialog(null, "Today is the first day of school (for the week anyway)!!!");
			break;
		case "Tuesday" :
			String hi = JOptionPane.showInputDialog( "Question: Do you like software or hardware better?" );
			switch(hi) {
			case "software" :
				JOptionPane.showMessageDialog(null, "MORE CODING FOR YOU!!!!");
				break;
			case "hardware" :
				JOptionPane.showMessageDialog(null, "More hardware for you!!");
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Empty message :(");
				break;
			}
			break;
		case "Wednesday":
			String answerLang = JOptionPane.showInputDialog("Random Question of the Day: Would you rather learn Spanish or French?");
			switch(answerLang) {
			case "Spanish" :
				JOptionPane.showMessageDialog(null, "Go to Duolingo to learn Spanish!!");
				break;
			case "French" :
				JOptionPane.showMessageDialog(null, "Also go to Duolingo to learn French!!");
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Empty message :(");
				break;
			}
			break;
		case "Thursday" :
			String answer = JOptionPane.showInputDialog("Random Question of The Day: Would you rather eat ice cream or candy?");
			switch(answer) {
			case "ice cream":
				 JOptionPane.showMessageDialog(null, "You are rewarded a pint of ice cream for choosing ice cream!!");
				 break;
			case "candy":
				JOptionPane.showMessageDialog(null, "You are rewarded a bag of candy for choosing candy!!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "You don't get anything because you didn't choose either :(");
				break;
			}
			break;
		case "Friday" :
			JOptionPane.showMessageDialog(null, "HOORAY!! This is the last day of school before the weekend!!");
			break;
			
		}
	}
}
