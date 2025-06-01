import java.util.*;

public class Question1{
     public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements in sorted array: ");
        int n = in.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = in.nextInt();

        int index = searchInsert(nums, target);
        System.out.println("Output: " + index);
        in.close();
    }
}