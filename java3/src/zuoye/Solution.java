package zuoye;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0; i < nums.length ; i++){
            for(int j = i + 1; j <= nums.length; j++){
                if (nums[i]+nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] test = {2,7,11,5};
        Solution a = new Solution();
        int[] p =a.twoSum(test,9);
        System.out.println(p[0] + " " + p[1]);
    }
}