import java.util.Scanner;

public class Question2 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = in.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = in.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Output: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
