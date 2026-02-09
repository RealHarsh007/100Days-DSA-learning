import java.util.*;
public class largestElem{
    public static int getcompar(int arrs[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arrs.length;i++){
if(large<arrs[i])
{
    large=arrs[i];
}
       }
       return large;

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

for(int i=0;i<arrs.length;i++)
{
    System.out.print(arrs[i]+" ");
}

System.out.println("largest:"+getcompar(arrs));
    }
}