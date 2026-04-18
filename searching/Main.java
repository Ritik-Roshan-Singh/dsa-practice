

import java.util.Arrays;
 class FirstLast {
    public int[] searchRange(int[] nums, int target){
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};


    }
    private int findFirst(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) /2;
            if(nums[mid] == target){
                first = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
                
            }

            }
            return first;
            
        }

    private int findLast(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) /2;
            if(nums[mid] == target){
                last = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
                
            }

        }
        return last;
    }

}

public class Main {
    public static void main(String[] args) {
        FirstLast fl = new FirstLast();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(fl.searchRange(nums, target)));
    }
}



