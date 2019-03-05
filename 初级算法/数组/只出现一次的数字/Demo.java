/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
找出那个只出现了一次的元素。
*/
class Demo{
	public static void main(String args[]){
		int nums[]={4,1,2,1,2};
		 for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
				System.out.println("nums[j]="+nums[j]+";nums[i]="+nums[i]+";");
                if(nums[j]!=nums[i]&&j==(nums.length-1)){
                    System.out.println("lll"+nums[i]);
                }else if(nums[j]==nums[i]&&i!=j){
                    break;
                }else if(i==j){
					continue;
				}
            }
        }
     System.out.println(nums[nums.length-1]);
    }
}
