

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		boolean isEnd = false;
		String num, isReplay;
		TheGuessingGame game = new TheGuessingGame();
		int firstOccurrence, i;
		while (!isEnd) {
			num = JOptionPane.showInputDialog("Insert your guess into the original number.\n"
					+ "(the guess must be a 4-digit number with no repetitions).\n");
			if (num.length() != 4) {// wronge number size
				JOptionPane.showMessageDialog(null,
						"You typed number with wrong size please try again.\n"
								+ "(the guess must be a 4-digit number with no repetitions).\n",
						"Error", JOptionPane.PLAIN_MESSAGE);
			} else {
				for (i = 0; i < 4; i++) {
					if (!Character.isDigit(num.charAt(i))) {// not a number
						JOptionPane.showMessageDialog(null,
								"You didn't type number, in place " + i + " the character isn't digit.\n"
										+ "(the guess must be a 4-digit number with no repetitions).\n",
								"Error", JOptionPane.PLAIN_MESSAGE);
						break;
					} else if ((firstOccurrence = num.indexOf(num.charAt(i))) != i) {// repetitions in number
						JOptionPane.showMessageDialog(null,
								"You typed number but with repetitions.\nIn place " + firstOccurrence + " and in place "
										+ i + " there is a repetition.\n"
										+ "(the guess must be a 4-digit number with no repetitions).\n",
								"Error", JOptionPane.PLAIN_MESSAGE);
						break;
					}
				}
				if (i == 4) {// correct number who did not fail the tests.
					if ((isEnd = game.result(num))) {// the game end
						do {// do while the user enter wrong string
							isReplay = JOptionPane
									.showInputDialog("If you want play again type Y if not type N (by apper case).\n");
						} while ((!isReplay.equalsIgnoreCase("N")) && (!isReplay.equalsIgnoreCase("Y")));
						if (isReplay.equalsIgnoreCase("N")) {// the user didn't want to play again.
							isEnd = true;
						} else {// the user want to play again.
							game = new TheGuessingGame();
							isEnd = false;
						}
					}
				}
			}
		}
	}
}
