import java.util.*;

public class CP43A
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] a=new String[n];
        int freq[]=new int[2];
        String team1="",team2="";
        freq[0]=0;
        freq[1]=0;
        for (int i=0;i<n;i++)
        {
            a[i]=s.next();
            if (i==0)
            {
                team1=a[i];
                freq[0]++;
            }
            else if (a[i].equals(a[0]))
            {
                freq[0]++;
            }
            else
            {
                team2=a[i];
                freq[1]++;
            }
        }
        if (Math.max(freq[0],freq[1])==freq[0])
        {
            System.out.println(team1);
        }
        else
        {
            System.out.println(team2);
        }
    }
}