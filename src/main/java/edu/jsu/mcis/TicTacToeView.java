package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        int w = model.getWidth();
        StringBuilder s = new StringBuilder();
        System.out.print("\n\n");
        s.append("  ");
        for (int i = 0; i < w; i++) {
           s.append(i);
        }
        s.append("\n\n");
        for (int i = 0; i < w; i++) {
            s.append(i + " ");
            for (int j = 0; j < w; j++) {
                s.append(model.getMark(i, j));
            }
            s.append("\n");
        }
        System.out.println(s.toString());
    


    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if (model.isXTurn()) {
            System.out.println("Player 1 (X) Move: ");
            System.out.print("Enter the row and column numbers, separated by a space: ");
        }
        if (model.isXTurn() == false) {
            System.out.println("Player 2 (O) Move: ");
            System.out.print("Enter the row and column numbers, separated by a space: "); 
        }

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */

        System.out.println("Invalid input");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}