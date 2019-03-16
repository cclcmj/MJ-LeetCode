/*
 *字符串中的第一个唯一字符
 *给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *案例:
 *s = "leetcode"
 *返回 0.
 *s = "loveleetcode",
 *返回 2.
 */
import java.util.Map;
import java.util.HashMap;
class LeetCodeTesk{
	public static void main(String[] args){
		String s = "cc";
		//开始
		char[] charS = s.toCharArray();
		Map<Character,Integer> utilMap = new HashMap<Character,Integer>();
		for(int i = 0;i < charS.length;i++) {
			int v = utilMap.getOrDefault(charS[i],0);
			utilMap.put(charS[i],++v);
		}
		int result = -1;
		for(int i = 0;i < charS.length;i++) {
			if(utilMap.get(charS[i]) == 1) {
				result = i;
				break;
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