public class array_pairs {
public static void pairs(int arr[]) 
{
    int i,j ;
    for (i=0;i<arr.length;i++)
    {
        for (j=i+1;j<arr.length;j++)
        {
           System.out.print("("+arr[i]+","+arr[j]+")");  
        }System.out.println("   ");
    }
}
public static void main(String[] args) {
    int arr []={2,3,4,5,6,7,8,9};
    pairs(arr);
}
}
