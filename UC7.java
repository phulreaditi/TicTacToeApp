import java.util.Random;

public class UC7 {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // Validate move
    public static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
    }

    // Place move
    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Print board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Computer move
    public static void computerMove() {

        Random random = new Random();

        int row, col;

        while (true) {
            int slot = random.nextInt(9) + 1; // 1–9

            int index = slot - 1;
            row = index / 3;
            col = index % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O');
                break;
            }
        }

        System.out.println("Computer made a move:");
        printBoard();
    }

    public static void main(String[] args) {

        computerMove();
    }
}