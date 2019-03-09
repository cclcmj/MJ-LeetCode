/*
 *给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 *同时保持非零元素的相对顺序。
 *
 *示例:
 *输入: [0,1,0,3,12]
 *输出: [1,3,12,0,0]
 *
 *说明:
 *必须在原数组上操作，不能拷贝额外的数组。
 *尽量减少操作次数。
 */


class LeetCodeTesk{
	public static void main(String[] args){
		int[] num = {0,1,0,3,12};
		//开始——i是遍历用的指针，j是寻找0的指针
		int j,i=0;
		for(;i<num.length-1;i++){
			if(num[i]==0){
				j=i+1;
				for(j=i+1;j<num.length;j++){
					if(num[j]!=0){
						//交换num[i]和num[j]的值
						System.out.println(i+"，"+j);
						num[i]=num[i]^num[j];
						num[j]=num[i]^num[j];
						num[i]=num[i]^num[j];
						break;
					}
				}
			}
		}
		//return
		for(int n=0;n<num.length;n++)
			System.out.print(num[n]+",");
	}
}