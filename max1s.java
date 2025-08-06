public class max1s {
    public static int max_ones(int arr[])
    {
        int i ,count =0; int max_count=0;
        for (i =0;i<arr.length;i++) {
            if(arr[i]==1){
                count++;
                max_count=Math.max(count, max_count);
            }else count=0;
        } return max_count;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(max_ones(arr));
    }
}
