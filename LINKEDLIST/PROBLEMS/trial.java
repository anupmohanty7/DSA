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
class trial{
	public node middle(node head)
	{
		int count=1;
		node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		int pos=1;
		temp=head;
		while(pos!=((count/2)+1))
		{
			temp=temp.next;
			pos++;
		}
		return temp;
	}
}
class driver{
	public static void main(String args[])
	{
	node n1=new node(10);
	node n2=new node(20);
	node n3=new node(30);
	node n4=new node(40);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=null;
	node head=n1;
	trial ob=new trial();
	System.out.println((ob.middle(head)).value);
	}
}