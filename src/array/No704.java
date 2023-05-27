package array;

/**
 * leetcode
 * 2023/5/22  15:53
 *
 * @author: Alex
 * @version: 1.0
 */
public class No704 {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int idx = search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        System.out.println(idx);
    }
}
