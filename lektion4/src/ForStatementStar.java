public class ForStatementStar {
    public static void main(String[] args) {
        final int MAX_ROWS = 25;

        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int star = 1; star <= row; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
