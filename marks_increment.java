 public class marks_increment
 {
    public static void update (int marks[])
    {
        int i ;
        
        for(i=0;i<marks.length;i++ )
        {
            marks[i]=marks[i]+1;
            
        }

    }
    public static void main (String args[])
    {
        int i ;
        int marks[]={34,35,36,37,30};
        update(marks);
        for(i=0;i<marks.length;i++ )
        {
         System.out.println(marks[i]);
        } 
    }
    
}
