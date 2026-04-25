import java.util.Scanner;

public class UC4 {

    // Method to convert slot → row & column
    public static void convertSlot(int slot) {

        int index = slot - 1;

        int row = index / 3;
        int col = index % 3;

        System.out.println("Row: " + row + ", Column: " + col);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = scanner.nextInt();

        convertSlot(slot);
    }
}