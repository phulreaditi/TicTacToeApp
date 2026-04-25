import java.util.Scanner;
import java.util.Random;

public class UC8 {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static char currentPlayer = 'X';

    // Print board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Validate move
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Place move
    public static void placeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    // Check win
    public static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer)
                return true;

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer)
                return true;
        }

        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer)
            return true;

        return false;
    }

    // Check draw
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    // Switch player
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Human move
    public static void playerMove(Scanner scanner) {
        int row, col;

        while (true) {
            System.out.print("Enter row (0-2): ");
            row = scanner.nextInt();

            System.out.print("Enter col (0-2): ");
            col = scanner.nextInt();

            if (isValidMove(row, col)) {
                placeMove(row, col);
                break;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Computer move
    public static void computerMove() {
        Random random = new Random();
        int row, col;

        while (true) {
            int slot = random.nextInt(9) + 1;
            int index = slot - 1;

            row = index / 3;
            col = index % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            printBoard();

            if (currentPlayer == 'X') {
                System.out.println("Player Turn (X)");
                playerMove(scanner);
            } else {
                System.out.println("Computer Turn (O)");
                computerMove();
            }

            if (checkWin()) {
                printBoard();
                System.out.println(currentPlayer + " wins!");
                break;
            }

            if (checkDraw()) {
                printBoard();
                System.out.println("Game is a draw!");
                break;
            }

            switchPlayer();
        }
    }
}