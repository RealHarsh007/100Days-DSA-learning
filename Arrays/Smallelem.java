import java.util.*;
public class Smallelem {

    public static int smallel(int arrs[])
    {
        int small=Integer.MAX_VALUE;

        for(int i=0;i<arrs.length;i++)
        {
            if(small>arrs[i]){
                small=arrs[i];
            }
        }
        return small;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arrs[]=new int[n];

      for(int i=0;i<arrs.length;i++)
      {
        arrs[i]=sc.nextInt();
      }

      System.out.print("Smallest Element In arrays:"+smallel(arrs));
    }
}
