# TheGuessingGame
### An application that implements the game "hit ball" as follows: the program will select a four-digit number
### (no repetitions) and the user will try to guess the chosen number. For each guess the program will display the number
### Along with the following: the number of exact hits (stamp) and the number of digits that appear in the original
### but in a different location (injury).
### Example: given the number 1307 and the guess 3201 the result will be: one stamp and two hits Explanation: the stamp is for the digit 0 which is in exactly the right place, and the hits are for the digits 3 and 1 which appear in the number but not in the same place.
### The user will continue to guess until he succeeds in discovering the number. Finally, the number of guesses should be presented to them
### The user needed until he was able to guess. The input and output will be done using a dialog box, every time there is
### View all previous guesses including the results obtained for each guess. After the game is over, the user should be asked (via a dialog box) if they want to play new game.
## how to run it?
### download the repository to file explorer and open run.bat.
## Main.java
### This file have the main function that handle the game. It create TheGuessingGame object and and check the use response and answer him.
## TheGuessingGame.java:
### constructor:
#### OriginalNumber- The constractor build number that does not contain a number that appears twice in string 
#### message- The message to user in string
#### guessworkConter init to 0 this count the guesses.
### public boolean result(String num)- get guess and check if we get 4 bool if yes return true alse false.
