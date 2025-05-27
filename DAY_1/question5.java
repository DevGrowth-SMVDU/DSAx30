import java.util.Scanner;

public class question5 {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();

        System.out.println("The Kaprekar Numbers are:");
        int count = 0;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Frequency of Kaprekar numbers is: " + count);
        in.close();
    }

    public static boolean isKaprekar(int n) {
        int square = n * n;
        String str = String.valueOf(square);
        int len = str.length();
        int right = Integer.parseInt(str.substring(len / 2));
        int left = (len > 1) ? Integer.parseInt(str.substring(0, len / 2)) : 0;

        return left + right == n;
    }
}
