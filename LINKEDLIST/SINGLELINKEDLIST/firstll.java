import java.util.*;
public class firstll{
	int ele;
	firstll next;
	firstll(int ele,firstll next)
	{
		this.ele=ele;
		this.next=next;
	}
	firstll(int ele)
	{
		this.ele=ele;
		this.next=null;
	}
}
class driver{
	public static void main(String args[])
	{
		int arr[]={0,1,2,3,4};
		firstll y=new firstll(arr[0]);
		System.out.println(y);
		System.out.println(y.next);
		System.out.println(y.ele);
		
	}
}