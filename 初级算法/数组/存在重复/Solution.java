class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean t=false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i])
                   t=true;
            }
        }
        return t; 
    }
}