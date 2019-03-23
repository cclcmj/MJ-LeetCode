package tesk.string;

import java.util.Arrays;

/*
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *如果不存在公共前缀，返回空字符串 ""。
 *示例 1:
 *输入: ["flower","flow","flight"]
 *输出: "fl"
 *示例 2:
 *输入: ["dog","racecar","car"]
 *输出: ""
 *解释: 输入不存在公共前缀。
 *说明:
 *所有输入只包含小写字母 a-z 。
 */
class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"a"};
		System.out.println(TestDemo.longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length < 1) return "";
		Arrays.sort(strs);
		int i = 1;
		for(;i <= strs[strs.length-1].length() && i <= strs[0].length()
				&& strs[strs.length-1].substring(0,i).contains(strs[0].substring(0, i));i++);
		return strs[0].substring(0, i-1);
	}

}
