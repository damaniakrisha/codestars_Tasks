import java.util.*;

public class CP489B
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] boy_skills=new int[n];
        for (int i=0;i<n;i++)
        {
            boy_skills[i]=s.nextInt();
        }
        Arrays.sort(boy_skills);
        int m=s.nextInt();
        int[] girl_skills=new int[m];
        for (int i=0;i<m;i++)
        {
            girl_skills[i]=s.nextInt();
        }
        Arrays.sort(girl_skills);
        int count=0;
        int i=0;
        int j=0;
        while(i<n && j<m) //two pointers algo
        {
            if (Math.abs(girl_skills[j]-boy_skills[i])<=1)
            {
                count++;
                i++;
                j++;
            }
            else if(girl_skills[j]>boy_skills[i])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        System.out.println(count);
    }
}