class Demo2 {
    public static void main(String args[]) {
		if(nums.length==0)return 0;
        int i=0;
        int j=1;
        int length=nums.length;
        while(j<nums.length){
            System.out.println("i="+i+";"+"j="+j+";"+"length="+length+";");
            if(nums[i]==nums[j]){
                length=length-1;
                    j++;
            }else{
                nums[i+1]=nums[j];
                i++;
                j++;
            }
        }
        return length;
    }
}