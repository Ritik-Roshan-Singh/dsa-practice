package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] res = s.twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
}
