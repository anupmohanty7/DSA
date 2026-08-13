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
class startcycle{
	
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
	n5.next=n2;
	node head=n1;
	strartcycle ob=new startcycle();
	
}