//segregate odd and eeven nodes in LL
//find the starting point of a loop
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
class evenodd{
	public node findevenodd(node head)
	{
		node temp=head;
		node t=head;;
		int i=0;
		while(temp!=null)
		{
			
			if(temp.value%2==0 && i==0)
			{
				i++;
				head=temp;
				t=temp;
			}
			if(temp.value%2==0)
			{
				t.next=temp;
			}
			
			temp=temp.next;
			
		}
		while(temp!=null)
		{
			if(temp.value%2!=0)
			{
				t.next=temp;
			}
			
			temp=temp.next;
			
		}
		return head;
	}
	public void print(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(""+temp.value);
			temp=temp.next;
		}
	}
}
class driver{
	public static void main(String args[])
	{
	node n1=new node(10);
	node n2=new node(21);
	node n3=new node(30);
	node n4=new node(49);
	node n5=new node(50);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=null;
	node head=n1;
	evenodd ob=new evenodd();
	head=ob.findevenodd(head);
	ob.print(head);
}
}