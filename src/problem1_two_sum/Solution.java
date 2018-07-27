package problem1_two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> inputNums = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            inputNums.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            if(inputNums.containsKey(target-nums[i])){
                int index = inputNums.get(target-nums[i]);
                if (index==i){
                    continue;
                }
                return new int[]{i,index};
            }
        }
        return null;
    }
}