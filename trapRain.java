public class trapRain
{
    public static int trap(int height[])
    {
        int left_max[] = new int[height.length];
        int right_max[] = new int[height.length];
        int n =height.length;
        left_max[0]=height[0];
        for (int i=1;i<n;i++){
        left_max[i]=Math.max( left_max[i-1],height[i]);
        }
         right_max[n-1]=height[n-1];
         for (int i=n-2;i>=0;i--){
        right_max[i]=Math.max( right_max[i+1],height[i]);
        }  
        int trapped_water=0;
        for (int i=0;i<n;i++){
        trapped_water+=(Math.min(left_max[i], right_max[i]) - height[i]) ;
}
        return trapped_water;
    }

    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
