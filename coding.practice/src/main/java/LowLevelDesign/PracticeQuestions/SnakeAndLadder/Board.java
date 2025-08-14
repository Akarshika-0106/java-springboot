package LowLevelDesign.PracticeQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    public Cell[][] cells;

    public Board(int boardSize, int noOfSnakes, int noOfLadders){
        initializeCells(boardSize);
        addSnakeAndLadders(noOfSnakes, noOfLadders);
    }

    public void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                cells[i][j] =  new Cell();
            }
        }
    }

    public void addSnakeAndLadders(int noOfSnakes, int noOfLadders){
        while(noOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);

            if(snakeTail >= snakeHead){
                continue;
            }

            Cell cell = getCell(snakeHead);
            Jump jump = new Jump();
            jump.start = snakeHead;
            jump.end = snakeTail;
            cell.jump = jump;
            noOfSnakes--;
        }

        while(noOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);

            if(ladderStart >= ladderEnd){
                continue;
            }

            Cell cell = getCell(ladderStart);
            Jump jump = new Jump();
            jump.start = ladderStart;
            jump.end = ladderEnd;
            cell.jump = jump;
            noOfLadders--;
        }

    }

    public Cell getCell(int position){
        int row = position/cells.length;
        int col = position%cells.length;
        return cells[row][col];
    }
}
