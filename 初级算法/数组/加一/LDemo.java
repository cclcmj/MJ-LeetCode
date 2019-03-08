/*
 *加一
 *给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *示例 1:
 *输入: [1,2,3]
 *输出: [1,2,4]
 *解释: 输入数组表示数字 123。
 *
 *示例 2:
 *输入: [4,3,2,1]
 *输出: [4,3,2,2]
 *解释: 输入数组表示数字 4321。
*/



import java.util.ArrayList;
import java.util.Stack;
class LDemo{
	public static void main(String[] args){
		int[] digits = {9};
		//开始
		int increment= 1;
		ArrayList<Integer> listResult = new ArrayList<Integer>();
		//遍历数组中的每个元素
		int n1 = digits.length-1;
		int j=0;
		for(;n1>=0;n1--){
			j=digits[n1];int k = 10;
			//处理
			j+=increment;		
			increment = j/10;
			j%=10;
			//放入结果集中
			listResult.add(j);
		}
		if(n1==-1&&increment!=0){
			listResult.add(increment);
		}
		//将结果集中元素放入结果数组中
		int[]arrayResult = new int[listResult.size()];
		int n2 = listResult.size()-1;
		for(Integer i:listResult){
			arrayResult[n2--]=i;
		}
        //return digits;
		for(int i=0;i<arrayResult.length;i++){
			System.out.print(arrayResult[i]+",");
		}
	}
}