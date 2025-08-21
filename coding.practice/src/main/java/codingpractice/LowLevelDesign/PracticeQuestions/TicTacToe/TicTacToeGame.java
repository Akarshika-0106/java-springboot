package codingpractice.LowLevelDesign.PracticeQuestions.TicTacToe;

import codingpractice.LowLevelDesign.PracticeQuestions.TicTacToe.Model.Board;
import codingpractice.LowLevelDesign.PracticeQuestions.TicTacToe.Model.PieceType;
import codingpractice.LowLevelDesign.PracticeQuestions.TicTacToe.Model.Player;
import codingpractice.LowLevelDesign.PracticeQuestions.TicTacToe.Model.PlayingPiece;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gamingBoard;

    public TicTacToeGame(){
        initialise();
    }

    public void initialise(){
        players = new LinkedList<>();
        gamingBoard = new Board(3);
        Player player1 = new Player("Player1", new PlayingPiece(PieceType.X));
        Player player2 = new Player("Player2", new PlayingPiece(PieceType.O));
        players.add(player1);
        players.add(player2);
    }

    public String startGame(){
        boolean gameOn = true;
        while(gameOn){
            Player currPlayer = players.removeFirst();
            gamingBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gamingBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                gameOn = false;
                continue;
            }
            System.out.println("Player:"+currPlayer.getName()+" Enter row, column: ");

            Scanner sc = new Scanner(System.in);
            String values = sc.nextLine();
            String[] val = values.split(",");
            int row = Integer.parseInt(val[0]);
            int  column = Integer.parseInt(val[1]);
            assert currPlayer != null;

            boolean isSuccess = gamingBoard.addPiece(row, column, currPlayer.getPlayingPiece());

            if(!isSuccess){
                System.out.println("Position is invalid. Try again");
                players.addFirst(currPlayer);
                continue;
            }
            players.addLast(currPlayer);
            boolean winner = isThereWinner(row, column, currPlayer.playingPiece.pieceType);
            if(winner){
                return currPlayer.getName()+ " is the winner";
            }

        }
       return "Tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType){
        boolean isRowMatch = true;
        boolean isColumnMatch = true;
        boolean isDiagonalMatch = true;
        boolean isAntiDiagonalMatch = true;

        for(int i=0; i< gamingBoard.size; i++){
            if(gamingBoard.board[row][i] == null || gamingBoard.board[row][i].pieceType != pieceType){
                isRowMatch = false;
            }
        }

        for(int i=0; i< gamingBoard.size; i++){
            if(gamingBoard.board[i][col] == null || gamingBoard.board[i][col].pieceType != pieceType){
                isColumnMatch = false;
            }
        }

        for(int i=0, j=0; i< gamingBoard.size; i++, j++){
            if(gamingBoard.board[i][j] == null || gamingBoard.board[i][j].pieceType != pieceType){
                isDiagonalMatch = false;
            }
        }

        for(int i=0, j=gamingBoard.size-1; i< gamingBoard.size; i++, j--){
            if(gamingBoard.board[i][j] == null || gamingBoard.board[i][j].pieceType != pieceType){
                isAntiDiagonalMatch = false;
            }
        }

        return isRowMatch || isColumnMatch || isDiagonalMatch || isAntiDiagonalMatch;
    }
}
