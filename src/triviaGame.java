// Import GUI Library
import javax.swing.JOptionPane;

public class triviaGame {

    // Method for starting the game
    public void play(){
        
        // Stores all the questions in an array
        String[] questions = {"\nWhere does milk come from?","\nM&Ms are made of?","\nWhat color is orange","\nWhat is Donut made of","\nWhich is better Pancakes or Waffles"};

        // Stores the correct answers in an array
        String[] answer = {"cow","chocolate","orange","batter","neither"};

        // Stores amount of correct answers
        int points = 0;
        // Stores the user's guess
        String guess = null;

        // Set up swing variables
        String title = "Trivia Game";
        String message = "";

        for(int i = 0; i < questions.length; i++ ){
            // Assemble the message (Should look like "Question 1 \n whatever question 1 is")
            message = message + "Question " + (i + 1) + questions[i];

            // Get answer from user and make it lowercase
            guess = JOptionPane.showInputDialog(message,title).toLowerCase();

            // Check the guess against the right answer
            if (guess == answer[i].toLowerCase()){
                message = "Correct! +1 points\n\n";
                points++;
            } else {
                message = "Wrong! The correct answer is " + answer[i] + "\n\n";
            }


        }

        message = "You got " + points + " correct!";
        JOptionPane.showMessageDialog(null, message);
    }

}