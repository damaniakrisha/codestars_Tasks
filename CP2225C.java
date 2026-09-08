import java.util.*;

public class CP2225C
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] ans=new int[t];
        for (int j=0;j<t;j++)
        {
            int n=s.nextInt();
            s.nextLine();
            String top=s.next();
            String bottom=s.next();
            int[] dp=new int[n];
            if (top.charAt(0)!=bottom.charAt(0))
            {
                dp[0]=1;
            }
            else
            {
                dp[0]=0;
            }
            for (int i=1;i<n;i++)
            {
                int vertical=dp[i-1];
                if (top.charAt(i)!=bottom.charAt(i))
                {
                    vertical++;
                }
                int horizontal;
                if(i==1)
                {
                    horizontal=0;
                }
                else
                {
                    horizontal=dp[i-2];
                }
                if (top.charAt(i - 1) != top.charAt(i))
                {
                    horizontal++;
                }
                if (bottom.charAt(i - 1) != bottom.charAt(i))
                {
                    horizontal++;
                }
                dp[i]=Math.min(vertical,horizontal);
            }
            ans[j]=dp[n-1];
        }
        for (int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }
    }
}