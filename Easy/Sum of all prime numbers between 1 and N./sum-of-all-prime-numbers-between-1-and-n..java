//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long prime_Sum(int n)
    {
        // code here
        if(n<2){
            return 0;
        }
        
        long sum=0;
        boolean[] sieve = new boolean[n+1];
        /*for(int i=2;i<=n;i++){
            sieve[i] = true;
        }*/
        Arrays.fill(sieve,true);
        
        for(int i=2;i<=n;i++){
            if(sieve[i] == true){
                for(int j = i*2;j<=n;j+=i){
                  //  System.out.print(""+j);
                     sieve[j] = false;
                 }
            }
        }
        
        for(int i=2;i<=n;i++){
            if(sieve[i] == true){
            //    System.out.print(" "+i);
                sum=sum+i;
            }
        }
        return sum;
        
        
    }
}