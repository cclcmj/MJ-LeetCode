class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<int,int> num=new HashMap<int,int>();
        for(int i=0;i<nums1.length;i++){
            num.put(nums[i],0);
        }
        for(int i=0;i<nums2.length;i++){
            for(int key:num.keySet()){
                if(i==key){
                    num.get()
                }
            }
        }
    }
}