package leetcode;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentTotal = nums[0];
        int maxTotal = nums[0];
        for(int i = 1; i < nums.length;i++){

            if(currentTotal < nums[i]){
                currentTotal = Math.max(nums[i],nums[i]+currentTotal);
            }else{
                currentTotal += nums[i];
            }

            if(currentTotal > maxTotal) maxTotal = currentTotal;
        }
        return maxTotal;
    }
}
