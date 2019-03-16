/*
 *有效的字母异位词
 *给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 *示例 1:
 *输入: s = "anagram", t = "nagaram"
 *输出: true
 *
 *示例 2:
 *输入: s = "rat", t = "car"
 *输出: false
 *
 *说明:
 *你可以假设字符串只包含小写字母。
 *进阶:
 *如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
import java.util.Map;
import java.util.HashMap;
class LeetCodeTesk{
	public static void main(String[] args){
		String s = "rat";
		String t = "cat";
		//开始
		boolean result = true;
		char[] charS = s.toCharArray();
		Map<Character,Integer> utilMap = new HashMap<Character,Integer>();
		//放入map中
		for(int i = 0;i < charS.length;i++) {
			int v = utilMap.getOrDefault(charS[i],0);
			utilMap.put(charS[i],++v);
		}
		//判断
		char[] charT = t.toCharArray();
		for(int i = 0;i < charT.length;i++) {
			int v = utilMap.getOrDefault(charT[i],-1);
			utilMap.put(charT[i],--v);
		}
		for(Character key : utilMap.keySet()) {
			if(utilMap.get(key) != 0){
				result = false;
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