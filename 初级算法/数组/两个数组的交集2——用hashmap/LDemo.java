import java.util.HashMap;
class LDemo{
	public static void main(String args[]){
		
		int nums1[]={4,9,5};
		int nums2[]={9,4,9,8,4};
		
		HashMap<Integer,Integer> num=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            num.put(nums1[i],0);
        }
		
        for(int i=0;i<nums2.length;i++){
            for(int key:num.keySet()){
                if(nums2[i]==key){
                    num.put(key,(num.get(key)+1));
                }
            }
        }
        int n=0;int res[]=new int[10];
        for(int key:num.keySet()){
            for(int i=num.get(key);i>0;i--){
                res[n]=key;
                n++;
				System.out.print(key+";");
            }
        }
	}
}