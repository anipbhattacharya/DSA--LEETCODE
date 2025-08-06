public class reverse_array
{
public static void reverse (int arr[])
{
    int i ;
    for (i=arr.length-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
}
public static void main (String args[])
{
    int arr[]={2,3,4,5,6,7,8};
    reverse(arr);
}
}
