/*
 *给定一个整数数组 nums 和一个目标值 target，
 *请你在该数组中找出和为目标值的那两个整数，
 *并返回他们的数组下标。
 *
 *你可以假设每种输入只会对应一个答案。
 *但是，你不能重复利用这个数组中同样的元素。
 *
 *示例:
 *给定 nums = [2, 7, 11, 15], target = 9
 *因为 nums[0] + nums[1] = 2 + 7 = 9
 *所以返回 [0, 1]
 */


class LeetCodeTesk{
	public static void main(String[] args){
		int[] result = new int[2];
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		//开始
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				if(i==j)continue;
				if((nums[i]+nums[j])==target){
					result[0]=nums[i];
					result[1]=nums[j];
					i=j=nums.length;
					
				}
			}
		}
		
		
		
		//return
		for(int n=0;n<result.length;n++)
			System.out.print(result[n]+",");
	}
}