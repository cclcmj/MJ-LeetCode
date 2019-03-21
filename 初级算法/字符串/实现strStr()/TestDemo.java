package tesk.string;
/*
 *  实现strStr()
 *实现 strStr() 函数。
 *给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 *如果不存在，则返回  -1。
 *
 *示例 1:
 *输入: haystack = "hello", needle = "ll"
 *输出: 2
 *示例 2:
 *输入: haystack = "aaaaa", needle = "bba"
 *输出: -1
 *
 *说明:
 *当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */


class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(TestDemo.strStr(haystack,needle));
	}
	public static int strStr(String haystack,String needle) {
		int result = -1;
		char[] nee = needle.toCharArray();
		char[] hay = haystack.toCharArray();
		int i = 0,j = 0;
		while(i < hay.length && j < nee.length) {
			if(hay[i] == nee[j]) {
				i++;j++;
			}else if(j != 0) {
				i = i - j + 1;j = 0;
			}else 
				i++;
			System.out.println(i + "," + j);
		}
		if(nee.length == 0) result = 0;
		else if(j == nee.length) result = i - j;
		return result;
	}

}
