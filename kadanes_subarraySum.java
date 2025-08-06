public class kadanes_subarraySum
{
    public static void kadane(int arr[])
    {
        int i; 
        int curr_sum=0;
        int max_sum = Integer.MIN_VALUE;
        for (i=0;i<arr.length;i++){
            //curr_sum+=arr[i];
        curr_sum = Math.max(arr[i], curr_sum + arr[i]);
        /*if (curr_sum<0){
           curr_sum=0;}*/
        max_sum=Math.max(curr_sum,max_sum);}
        System.out.print(max_sum);
        
    }
    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-1,2,3,4};
        kadane(arr);
    }
}