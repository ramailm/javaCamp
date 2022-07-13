import java.util.Random;

public class MyMinesweeper {
    boolean[][] mineField;
    int rows;
    int cols;
    int numMines;

    public MyMinesweeper (int rows, int cols, int numMines) {
        this.rows = rows;
        this.cols = cols;
        this.numMines = numMines;
        this.mineField = new boolean[this.rows][this.cols];
        generateBoard();
    }

    public void generateBoard(){

        int r, c;
        int mines = this.numMines;
        Random rng = new Random();

        while (mines > 0) {
            r = rng.nextInt(this.rows); // generates random row value
            c = rng.nextInt(this.cols); // generates random col value
            if (!this.mineField[r][c]) {
                this.mineField[r][c] = true;
                mines--;
            }
        }

    }

    public int[][] generateClues() {
        int[][] clues = new int[rows][cols];

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(mineField[r][c] == true)
                    clues[r][c] = -1;
                else
                    clues[r][c] = countMines(r, c);
            }
        }
        return clues;
    }

    public int countMines(int row,int col){
        int count = 0;
        for(int i = row-1;i <= row+1;i++){
            for(int j = col-1;j <= col+1;j++){
                if(i == 0 && j ==0)
                    continue;
                if(i < 0 || j < 0 || i >= this.rows || j >= this.cols)
                    continue;
                if(mineField[i][j])
                    count++;
            }
        }
        return count;
    }

    public static void printClues(int[][] clues) {
        for (int i = 0; i < clues.length; i++) {
            for (int j = 0; j < clues[0].length; j++) {
                if (clues[i][j] == -1)
                    System.out.print("* ");
                else
                    System.out.print(clues[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMinesweeper(){

    }
}
