/*
 *整数反转
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 *示例 1:
 *输入: 123
 *输出: 321
 *示例 2:
 *输入: -123
 *输出: -321
 *示例 3:
 *输入: 120
 *输出: 21
 *
 *注意:
 *假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [?231,  231 ? 1]。
 *请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

class LeetCodeTesk{
	public static void main(String[] args){
		int x = 1534236469;
		//开始
		
		int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
			System.out.println(964632435 > Integer.MAX_VALUE/10 );
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
				rev = 0;
				break;
			}
             if (rev < -Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
				rev = 0;
				break;
			}
            rev = rev * 10 + pop;
        }
		System.out.println(rev);
		
		/*
		//输出布尔变量
		System.out.println(booleanResult);
		*/
		/*
		//输出数组所有元素
		for(int n=0;n<result.length;n++)
			System.out.print(result[n]+",");
		*/
	}
}