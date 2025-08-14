package LowLevelDesign.PracticeQuestions.TicTacToe;

public class Main {
    public static void main(String[] args){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initialise();
        System.out.println(ticTacToeGame.startGame());

    }
}
