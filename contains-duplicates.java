class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i =0; i<nums.length; i++){
            int ele = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==ele)
                    return true;
            }
        }return false;
    }
}