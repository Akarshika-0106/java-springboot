package LowLevelDesign.PracticeQuestions.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Deque<Player> players;
    Board board;
    Dice dice;
    Player winner;

    public Game(){
        initializeGame();
        addPlayers();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
    }

    public void addPlayers(){
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        players.add(player1);
        players.add(player2);
    }

    public void startGame(){
        while(winner == null){
            Player currPlayer = getPlayer();
            System.out.println("Current player is "+currPlayer.playerId+ " with curr position at "+currPlayer.playerPosition);

            int diceNum = dice.rollDice();
            System.out.println("diceNum: "+diceNum);
            int newPosition = currPlayer.playerPosition + diceNum;
            newPosition = checkJump(newPosition);
            currPlayer.playerPosition = newPosition;
            System.out.println("Current player is "+currPlayer.playerId+ " with new position at "+currPlayer.playerPosition);
            if(newPosition >= board.cells.length*board.cells.length-1){
                winner = currPlayer;
            }
        }
        System.out.println("Winner is "+winner.playerId);
    }

    public int checkJump(int newPosition){
        if(newPosition > board.cells.length*board.cells.length - 1) {
            return newPosition;
        }
        Cell cell = board.getCell(newPosition);
        if(cell.jump != null && cell.jump.start == newPosition){
            String jumpBy = cell.jump.start < cell.jump.end ? "ladder" : "snake";
            System.out.println("Jump done by "+jumpBy);
            newPosition = cell.jump.end;
        }
        return newPosition;
    }

    public Player getPlayer(){
        Player currPlayer = players.removeFirst();
        players.addLast(currPlayer);
        return currPlayer;
    }

}
