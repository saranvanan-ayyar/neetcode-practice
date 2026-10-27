class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        int[] sums = {0,0};
        for(int i=0; i < nums.length-1; i++){
            int sum = nums[i];
            for (int j = i+1; j < nums.length;j++){
                if(target - sum == nums[j]){
                    sums[0] = i;
                    sums[1] =j;
                }
            }
        }
        return sums;
    }
}
