import java.util.Scanner;

public class UC5 {

    // TicTacToe board
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // Method to validate move
    public static boolean isValidMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Enter col (0-2): ");
        int col = scanner.nextInt();

        if (isValidMove(row, col)) {
            System.out.println("Valid move ✅");
        } else {
            System.out.println("Invalid move ❌");
        }
    }
}