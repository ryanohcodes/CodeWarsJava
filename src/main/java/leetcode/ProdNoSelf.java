package leetcode;

import java.util.Arrays;

public class ProdNoSelf {
    public static int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) zeroCount++;
        }
        if(zeroCount==0){
            System.out.println(1);
            int factor = Arrays.stream(nums).reduce(1,(a,b)-> a*b);
            for(int i = 0; i < nums.length;i++){
                nums[i] = factor/nums[i];
                System.out.println(nums[i]);
            }
        }else if(zeroCount == 1){
            System.out.println(2);
            int total = 1;
            int location = 0;
            for(int i=0; i < nums.length;i++){
                if(nums[i] == 0){
                    location = i;
                    continue;
                }
                total *= nums[i];
            }
            for(int i = 0; i < nums.length;i++){
                if(nums[i] == 0){
                    nums[i] = total;
                }else{
                    nums[i] = 0;
                }
            }
        }else{
            System.out.println(3);
            nums = Arrays.stream(nums).map(x-> 0).toArray();
        }
        return nums;

    }
}
