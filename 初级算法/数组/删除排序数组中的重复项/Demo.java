class Demo{
	public static void main(String args[]){
		
	}
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int i=0;
        int length=nums.length;
        while(i<length-1){
            System.out.println("i="+i+":"+nums[i]);
            if(nums[i]==nums[i+1]){
                for(int k=i+1;k<length-1;k++){
                    nums[k]=nums[k+1];
                    System.out.print("k="+k+":"+nums[k+1]+";");
                }
                length=length-1;
                System.out.println("length:"+length);
            }else{
                i++;
            }
        }
        return length;
    }
}