import java.util.*;

public class CP279B
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int t=s.nextInt();
        for (int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int left=0;
        int sum=0;
        int maximum=0;
        for (int right=0;right<n;right++)
        {
            sum+=a[right];
            while (sum>t) //to check total time less than t 
            {
                sum-=a[left];
                left++;
            }
            int length=right-left+1;
            maximum=Math.max(length,maximum);
        }
        System.out.println(maximum);
    }
}