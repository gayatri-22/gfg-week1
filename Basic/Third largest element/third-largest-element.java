//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	/*    Arrays.sort(a);
	    return a[n-3];*/

	    int max1=Integer.MIN_VALUE;
	    int max2=Integer.MIN_VALUE;
	    int max3=Integer.MIN_VALUE;
	    
	    for(int i=0;i<arr.length;i++){
	        if(max1<arr[i] ){
	           max3=max2;
	            max2=max1;
	            max1=arr[i];
	        }
	        else if (max2<arr[i] && arr[i]!=max1 ){
	            max3=max2;
	            max2=arr[i];
	        }
	        else if(max3<arr[i] && arr[i]!=max2){
	            max3=arr[i];
	        }
	    }
	    if(max3==Integer.MIN_VALUE){
	        return -1;
	    }
	    return max3;
    }
}
