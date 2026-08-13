/*class NextGreaterElement{
	void solution(int arr[])
	{
		int res[]=new int[5];
		for(int i=0;i<5;i++)
		{
			if(i==4)
			{
				res[i]=-1;
			}
			for(int j=i+1;j<5;j++)
			{
				if(arr[j]>arr[i])
				{
					res[i]=arr[j];
					break;
				}
				else{
					res[i]=-1;
				}
			}
			
		}
		for(int k=0;k<5;k++)
		{
			System.out.println(" "+res[k]);
		}
	}
}
class driver{
	public static void main(String args[])
	{
		int[] arr={6,0,8,1,3};
		NextGreaterElement ob=new NextGreaterElement();
		ob.solution(arr);
	}
}*/
import java.util.*;
class NextGreaterElement
{
	void solution(int arr[])
	{
		Stack<Integer> st=new Stack<>();
		int[] res=new int[5];
		for(int i=4;i>=0;i--)
		{
			while(!st.isEmpty() && st.peek()<arr[i])
			{
				st.pop();
			}
			if(st.isEmpty())
			{
				res[i]=-1;
			}
			else{
				res[i]=st.peek();
			}
			st.push(arr[i]);
		}
		for(int k=0;k<5;k++)
		{
			System.out.println(" "+res[k]);
		}
	}
}
class driver{
	public static void main(String args[])
	{
		int[] arr={6,0,8,1,3};
		NextGreaterElement ob=new NextGreaterElement();
		ob.solution(arr);
	}
}