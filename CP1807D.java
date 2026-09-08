import java.util.*;

public class CP1807D
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(); //no. of test cases 
        ArrayList<String> ans=new ArrayList<>(); //result array for all test cases 
        while (t-->0)
        {
            int n=s.nextInt(); //length of array
            int q=s.nextInt(); //number of queries 
            int[] temp=new int[n]; //initialisation of temp array to make changes in
            int[] prefix = new int[n+1]; //initialisation of prefix sum array
            for (int i=0;i<n;i++) //array input
            {
                prefix[i + 1] = prefix[i] + s.nextInt();
            }
            int totalsum=prefix[n];
            for (int i=0;i<q;i++) //for all queries
            {
                int l=s.nextInt()-1;//starting position of queries
                int r=s.nextInt()-1; //ending position of queries
                int k=s.nextInt(); //value to replace with
                int rangeSum=prefix[r+1]-prefix[l]; //sum of elements from l to r
                int sum=totalsum-rangeSum+(r-l+1)*k; //updated sum
                if (sum%2!=0) //checking for odd and adding ans to result array 
                {
                    ans.add("Yes");
                }
                else
                {
                    ans.add("No");
                }
            }
        }
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }
}