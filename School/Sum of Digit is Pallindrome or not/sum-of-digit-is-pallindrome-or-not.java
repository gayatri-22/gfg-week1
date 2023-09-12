//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int num1 =N;
        int sum =0;
        while(num1>0){
            int temp =num1%10;
            sum+=temp;
            num1= num1/10;
            
        }
       // return sum;
        
        int newn=sum;
        int rev = 0;

        while (newn>0) {
            int digit = newn % 10;
            rev = rev * 10 + digit;
            newn = newn / 10;
        }

        if(rev == sum){
            return 1;
        }
        return 0;
    }
}