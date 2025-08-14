package LowLevelDesign.PracticeQuestions.SnakeAndLadder;

public class Player {
    public String playerId;
    public int playerPosition;

    public Player(String playerId, int playerPosition) {
        this.playerId = playerId;
        this.playerPosition = playerPosition;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}
