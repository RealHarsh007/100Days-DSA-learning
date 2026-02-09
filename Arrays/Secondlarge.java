import java.util.*;
public class Secondlarge {
    public static int seclarge(int arr[]){

        int large=Integer.MIN_VALUE;
        int small=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                small=large;
                large=arr[i];
            } 
            else if(arr[i] > small && arr[i] != large)
            {
                small=arr[i];
            }

        }
        return small;
    }
    public static void main(String args[])
        {
          int arr[]={12 ,15,16,6,22,22,85};
          System.out.print("Second Large:"+seclarge(arr));
        }
    
}
