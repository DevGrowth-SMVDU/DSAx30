import java.util.*;
public class question2 {
     public static void printAlphabetPattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++)
                System.out.print(" ");
            for (char c = 'A'; c <= 'A' + i; c++)
                System.out.print(c);
            for (char c = (char) ('A' + i - 1); c >= 'A'; c--)
                System.out.print(c);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the Value of n:");
        n=in.nextInt();
        printAlphabetPattern(n);
        in.close();
    }
    
}
