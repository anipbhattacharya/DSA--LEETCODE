public class stocks
{
    public static int stocks_time(int price[])
    {   
        int i,max_profit=0;
        int buy_price= Integer.MAX_VALUE; 
        int profit= 0;
        for(i=0;i<price.length;i++){
        if (price[i]>buy_price)
        {
            profit=price[i]-buy_price;
            max_profit=Math.max(profit,max_profit);
        }else buy_price=price[i];
    }
    return max_profit;
    }
    public static void main(String args[])
    {
        int price[]={7,1,5,6,4,3};
        System.out.print(stocks_time(price));
    }
}