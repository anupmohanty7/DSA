//Two sum problem
//THis is brute force method
/*import java.util.*;
class sum2{
	public String varient1(int arr[],int t)
		{
			int n=arr.length;
			int i=0;
			int j=0;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{ 
					if(arr[i]+arr[j]==t)
					{
						return "yes";
					}
				}
			}
			return "NO";
		}
		public int[] varient2(int arr[],int t)
		{
			int n=arr.length;
			int i=0;
			int j=0;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{ 
					if(arr[i]+arr[j]==t)
					{
						return new int[]{i,j};
					}
				}
			}
			return new int[]{-1,-1};
		}
public static void main(String args[])
{	
	int arr[]={1,2,3,4,5,6};
	int n=arr.length;
	int t=9;
	sum2 ib=new sum2();
	String res1=ib.varient1(arr,t);
	int[] res2=ib.varient2(arr,t);
	System.out.println(res1);
	System.out.println(res2[0]+","+res2[1]);	
}
}*/
//Better approach is by using hashmap
//optimal approach
import java.util.*;
import java.util.Arrays;

class sum2{
	public static void sort(int[] arr) {
    Arrays.sort(arr);
}

	public String varient1(int arr[],int t){
		 int n = arr.length;
        
        // Create an array of pairs [value, original_index]
        int[][] numsWithIndex = new int[n][2];
        
        // Store each element with its original index
        for (int i = 0; i < n; i++) {
            numsWithIndex[i][0] = arr[i]; // value
            numsWithIndex[i][1] = i;      // original index
        }
        
        // Sort the array based on the value, not index
        Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

		
		int l=0;
		int r=n-1;
		while(l<r)
		{
			if((arr[l]+arr[r])>t)
			{
				r--;
			}
			else if((arr[l]+arr[r])<t)
			{
				l++;
			}
			else{
				return "yes";
			}
		}
		return "NO";
	}
	public int[] varient2(int arr[],int t){
		int n=arr.length;
		int l=0;
		int r=n-1;
		while(l<r)
		{
			if((arr[l]+arr[r])>t)
			{
				r--;
			}
			else if((arr[l]+arr[r])<t)
			{
				l++;
			}
			else{
					return new int[]{l,r};
			}
		}
		return new int[]{-1,-1};
	}
	public static void main(String args[])
	{
		int arr[]={2,4,1,5,7};
		int t=9;
		sum2 ob=new sum2();
		sum2.sort(arr);
		String res1=ob.varient1(arr,t);
		int[] res2=ob.varient2(arr,t);
		System.out.println(res1);
		System.out.println(res2[0]+","+res2[1]);
	}
}