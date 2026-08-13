//DETETCT A CYCLE IN A LINKEDLIST
//THIS IS THE BEST OPTIMAL APPROACH
//THIS IS DONE BY Tortoise and Hare method
import java.util.*;
class node{
	int value;
	node next;
	node(int value,node next)
	{
		this.value=value;
		this.next=next;
	}
	node(int value)
	{
		this.value=value;
		this.next=null;
	}
}
class cycle{
	public boolean loop(node head)
	{
		node slow=head;
		node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
}
class driver{
	public static void main(String args[])
	{
	node n1=new node(10);
	node n2=new node(20);
	node n3=new node(30);
	node n4=new node(40);
	node n5=new node(50);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=null;
	node head=n1;
	cycle ob=new cycle();
	if(ob.loop(head))
	{
		System.out.println("Loop is present");
	}
	else{
		System.out.println("Loop is not present");
	}
	}
}