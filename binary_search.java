public class binary_search {

    public static int binary(int arr[],int n )
    {
        int start=0;
        int end =arr.length-1;
        int mid;
         while (start<=end)
        {
            mid =(start+end)/2;
        if (arr[mid]==n) 
        return mid;
        else if(arr[mid]<n){
            start=mid+1;
        }  
         else 
       end=mid-1; 
        }
        return -1;
    }
    public static void main (String args[])
    {
        int arr1[]={2,3,4,5,6,7,8,9,10,56,98,99};
        int n1= 10;
      int res=  binary(arr1,n1);
      if (res!=-1)
      System.out.println("found at "+res);
     else
       System.out.println("not found ");
        
        
    }
}
