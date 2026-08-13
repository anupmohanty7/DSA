/*
class queue{
	int f;
	int r;
	int[] q;
	int size;
	queue(int size)
	{
		f=-1;
		r=-1;
		this.size=size;
		q=new int[size];
	}
	void add(int ele)
	{
		if((r+1)%size==f)//circular queue
		{
			System.out.println("Overflow");
			return;
		}
		if(r==-1 && f==-1)
		{
			r++;
			f++;
			q[r]=ele;
		}
		else{
		r=(r+1)%size;
		q[r]=ele;
		}
	}
	int del()
	{
		int temp=0;
		if(r==-1 && f==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		if(r==f && f!=-1)
		{
			temp=q[f];
			r=-1;
			f=-1;
			return temp;
		}
		else{
			temp=q[r];
			r=(r-1)%size;
			return temp;
		}
	}
}
class stackusingqueue{
	public static void main(String args[])
	{
		queue ob=new queue(5);
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		System.out.println(""+ob.del());
		System.out.println(""+ob.del());
		System.out.println(""+ob.del());
	}
}*/
//THE ABOVE CODE IS WRONG
import java.util.*;
class stackusingqueue{
	Queue<Integer> q=new LinkedList<>();
	void push(int x){
		int s=q.size();
		q.add(x);
		//******MOST IMPORTANT PART******
		for(int i=0;i<s;i++)
		{
			q.add(q.poll());
		}
	}
	int pop(){
		int t=q.peek();
		q.poll();
		return t;
	}
	int top(){
		return q.peek();
	}
	boolean isEmpty(){
		return q.isEmpty();
	}
}
class driver{
	public static void main(String args[])
	{
		stackusingqueue st=new stackusingqueue();
		String[] commands={"stackusingqueue","push","push","pop","top","isEmpty"};
		int[][] inputs={{},{4},{5},{},{},{}};
		for(int i=0;i<commands.length;i++){
			switch(commands[i])
			{
				case "push":{
					st.push(inputs[i][0]);
					break;
				}
				case "pop":{
					System.out.println(st.pop());
					break;
				}
				case "top":{
					System.out.println(st.top());
					break;
				}
				case "isEmpty":{
					System.out.println(st.isEmpty());
					break;
				}
				case "stackusingqueue":{
					break;
				}
			}
		}
	}
}