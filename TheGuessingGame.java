

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This pattern represents the guessing game. It has a field representing the
 * number of turns, a field representing the current message that the variable
 * must receive, and the random number chosen by the system
 */
public class TheGuessingGame {
	private String OriginalNumber;
	private static int guessworkConter;
	private static String message;

	/*---------Constructor---------
	 * It Will grill a 4-digit number without repetitions,
	 * and update the beginning of the message to the user*/
	public TheGuessingGame() {
		guessworkConter = 0;
		this.OriginalNumber = "";
		int num, index;
		LinkedList<Integer> listOfNum = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			listOfNum.add(i);
		}
		Random randNum = new Random();
		for (int i = 0; i < 4; i++) {
			num = listOfNum.get((index = randNum.nextInt(listOfNum.size())));
			this.OriginalNumber += num;
			listOfNum.remove(index);
		}
		message = "The original number is: " + this.OriginalNumber + "\n";
	}

	/*
	 * The function checks the guess that the user pressed, and checks how many
	 * bulls and how many cows, and outputs the result of the turn to the user.
	 */
	public boolean result(String num) {
		int bulls = 0, cows = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (this.OriginalNumber.charAt(i) == num.charAt(j)) {
					if (i == j) {
						bulls++;
					} else {
						cows++;
					}
				}
			}
		}
		guessworkConter++;
		message += "In your attempt number " + guessworkConter + " you got " + bulls + " bulls and " + cows
				+ " cows.\n";
		JOptionPane.showMessageDialog(null, message, "Resuts", JOptionPane.PLAIN_MESSAGE);
		return (bulls == 4);
	}

}
