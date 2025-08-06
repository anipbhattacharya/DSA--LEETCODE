public class linear_search{
    
    public static void search(int arr[]) {
        int i ;
        int n= 9;
        for (i=0;i<arr.length;i++)
        {
            if (arr[i]==n) break;
        }
        System.out.println("the number"+n+"found in "+(i+1)+"position");

    }
    public static void main(String[] args) {
        int arr[]={45,56,87,9,80};
        search(arr);
    }
}
