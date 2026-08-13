import java.util.*;
class queueusingarray{
	int f;
	int r;
	int[] queue;
	int size;
	queueusingarray(int size)
	{
		this.size=size;
		f=-1;
		r=-1;
		queue=new int[size];
	}
	void add(int ele)
	{
		if((r+1)%size==f)
		{
			System.out.println("Overflow");
			return;
		}
		if(r==-1 && f==-1)
		{
			r++;
			f++;
			queue[r]=ele;
		}
		else{
		r=(r+1)%size;
		queue[r]=ele;
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
			temp=queue[f];
			r=-1;
			f=-1;
			return temp;
		}
		else{
			temp=queue[f];
			f=(f+1)%size;
			return temp;
		}
	}
	int peek()
	{
		if(r==-1 && f==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		return queue[f];
	}
	boolean isEmpty()
	{
		return f==-1;
	}
}
class driver
{
	public static void main(String args[])
	{
		queueusingarray q=new queueusingarray(10);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(""+q.queue[q.f]);
		System.out.println(""+q.del());
		System.out.println(""+q.queue[q.f]);
		System.out.println(""+q.del());
		System.out.println(""+q.del());
		
	}
}