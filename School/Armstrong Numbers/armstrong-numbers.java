//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        
        int sum =0;
		
			int num1 =n;
			while(n>0){
				int temp = n%10;
				sum = sum + (temp * temp * temp);
				n = n/10;
			}
			if(sum == num1){
			    return "Yes";
			//	sum =0;
			}
			
			return "No";
			
    }
}