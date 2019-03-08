import java.util.HashMap;
/*
 *给定两个数组，编写一个函数来计算它们的交集。
示例 1:
输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]
示例 2:
输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [4,9]
说明：
输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
我们可以不考虑输出结果的顺序。
进阶:
如果给定的数组已经排好序呢？你将如何优化你的算法？
如果 nums1 的大小比 nums2 小很多，哪种方法更优？
如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
*/
class LDemo{
	public static void main(String args[]){
		
		int nums1[]={4,9,5};
		int nums2[]={9,4,9,8,4};
        HashMap<Integer,Integer> num=new HashMap<Integer,Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        //将nums1数组中的元素导入hashmap，键为元素，值为出现的次数
        for(int i=0;i<nums1.length;i++){
            Integer v=num.get(nums1[i]);
            num.put(nums1[i],v==null?1:v+1);
        }
        //nums2数组与HashMap中得键一一对比，存在且值大于0则值-1并放入结果集合中
        for(int i=0;i<nums2.length;i++){
            if(num.containsKey(nums2[i]) && num.get(nums2[i])>0){
                num.put(nums2[i],num.get(nums2[i])-1);
                resultList.add(nums2[i]);
            }
        }
        //返回结果数组
        int[] resultArray = new  int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            resultArray[i]=resultList.get(i);
        }
        //return resultArray;
    }
}
	}
}