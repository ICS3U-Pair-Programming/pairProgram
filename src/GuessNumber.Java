// Import Library 
import javax.swing.JOptionPane;

//our class name - must be same name as class file!
public class GuessNumber {
    
    //method for guessing numbers
    public void guess(){
        //declare variables
        String message = "Guess a number between 1 - 100:";
        String title = "GUESS NUMBER GAME";
        int guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));

        //while loop - keep looping until the user guesses the correct number
        while (guess!= 50) {
            //check if the guess is higher or lower than the actual number
            if(guess >50){
                message = "Nope! Too High. Try again";
            } else if (guess < 50){
                message = "Nope! Too Low. Try again";
            }

            //read users next guess
            guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));
        }
        //Message to display to congratualte the user 
        message = "YAY!! You got it! The number was 50!";
        JOptionPane.showMessageDialog(null, message);

    };

}