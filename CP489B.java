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
        for (int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if (boy_skills[j]>boy_skills[j+1])
                {
                    int temp=boy_skills[j];
                    boy_skills[j]=boy_skills[j+1];
                    boy_skills[j+1]=temp;
                }
            }
        }
        int m=s.nextInt();
        int[] girl_skills=new int[m];
        for (int i=0;i<m;i++)
        {
            girl_skills[i]=s.nextInt();
        }
        for (int i=0;i<m-1;i++)
        {
            for(int j=0;j<m-1-i;j++)
            {
                if (girl_skills[j]>girl_skills[j+1])
                {
                    int temp=girl_skills[j];
                    girl_skills[j]=girl_skills[j+1];
                    girl_skills[j+1]=temp;
                }
            }
        }
        int count=0;
        int i=0;
        int j=0;
        while(i<n && j<m)
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