public class WhileStatement {
    public static void main(String[] args) {
        int count1 = 1, count2 = 1;
        while (count1 <= 10)
        {
            count2 =1;
            while (count2 <= 20)
            {
                System.out.println("here");
                count2++;
            }
            count1++;
        }
    }
}
