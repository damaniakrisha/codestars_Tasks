import java.util.*;

public class CP1915A 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int ans=0;
            if ((a^b)==0) //XOR result is zero when both numbers are same 
            {
                ans=c;
            }
            else if ((b^c)==0)
            {
                ans=a;
            }
            else
            {
                ans=b;
            }
            System.out.println(ans);
        }
    }
}
