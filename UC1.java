public class UC1{
    public static void main(String[] args) {

        char[] board = {'1','2','3','4','5','6','7','8','9'};

        System.out.println("Tic Tac Toe Board:");

        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}