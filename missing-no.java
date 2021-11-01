class Solution {
    public int missingNumber(int[] nums) {
       int sum = 0;
       for(int i = 0; i<nums.length; i++) sum = sum + nums[i];
        
        int n = nums.length;
        int arrSum = (n*(n+1))/2;
        int reqNum = arrSum - sum;
        return reqNum;
    }
}