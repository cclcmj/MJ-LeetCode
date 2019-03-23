/*
 *验证回文字符串
 *给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *说明：本题中，我们将空字符串定义为有效的回文串。
 *
 *示例 1:
 *输入: "A man, a plan, a canal: Panama"
 *输出: true
 *示例 2:
 *输入: "race a car"
 *输出: false
 */
import java.util.Map;
import java.util.HashMap;
class LeetCodeTesk{
	public static void main(String[] args){
		String s = "race a car";
		//开始
		s = s.toLowerCase();
		boolean result = true;
		char[] utilChar = s.toCharArray();
		//判断
		if(utilChar.length != 0) {
			int i = 0,j = utilChar.length-1;
			while(i <= utilChar.length/2 && j >= utilChar.length/2) {
				if(!(Character.isLetter(utilChar[i])||Character.isDigit(utilChar[i]))) {
					i++;
					continue;
				}else if(!(Character.isLetter(utilChar[j])||Character.isDigit(utilChar[j]))) {
					j--;
					continue;
				}else if(utilChar[i] != utilChar[j]) {
					System.out.println(utilChar[i] + "," + utilChar[j]);
					result = false;
					break;
				}else{
					i++;
					j--;
				}
			}
		}
		//输出
		System.out.println(result);
		
		
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