class Solution {
    public void rotate(int[] nums, int k) {
        for(int j=0;j<k;j++){
            int l=nums[nums.length-1];
            System.out.println("l="+l+";");
            int i=nums.length-1;
            for(;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=l;
        }
    }
}