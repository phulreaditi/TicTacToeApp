import java.util.Scanner;

public class UC6 {

    // Game board
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // Method to place move
    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to display board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Enter col (0-2): ");
        int col = scanner.nextInt();

        System.out.print("Enter symbol (X/O): ");
        char symbol = scanner.next().charAt(0);

        // Place move
        placeMove(row, col, symbol);

        // Show board
        System.out.println("Updated Board:");
        printBoard();
    }
}