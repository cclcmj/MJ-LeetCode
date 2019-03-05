class Solution {
    public int maxProfit(int[] prices) {
        int i,j,c;i=0;j=1;c=0;
        while(j<prices.length){
            System.out.println("i="+i+";"+"j="+j+";"+";"+"c="+c+";");
            System.out.println(prices[j]+","+prices[i]);
            if(prices[j]>prices[i]){
                c=c+prices[j]-prices[i];
            }
                i++;
                j++;
        }
        return c;
    }
}