//check pallindrm or not
/*import java.util.*;
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
class pallindrm{
	public Boolean isPallindrom(node head)
	{
		if(head==null)
		{
			return true;
		}
		Stack<Integer> stack=new Stack<>();
		node t=head;
		while(t!=null)
		{
			stack.push(t.value);
			t=t.next;
		}
		node temp=head;
		while(temp!=null)
		{
			if(stack.isEmpty() || temp.value!=stack.pop())
			{
				return false;
			}
			temp=temp.next;
		}
		return true;
	}
}
class driver{
	public static void main(String args[])
	{
	node n1=new node(10);
	node n2=new node(20);
	node n3=new node(30);
	node n4=new node(20);
	node n5=new node(10);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=null;
	node head=n1;
    pallindrm ob=new pallindrm();
	if(ob.isPallindrom(head)){System.out.println("It is a pallindrom");}
	else{System.out.println("It is not a pallindrm");}
}
}*/
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
class pallindrm{
	public Boolean isPallindrom(node head)
	{
		if(head==null || head.next==null)
		{
			return true;
		}
		node slow=head;
		node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
		{
			slow=slow.next;
		}
		node curr=slow;
		node prev=null;
		
		while(curr!=null)
		{
			node front=curr.next;
			curr.next=prev;
			prev=curr;
			curr=front;
		}
		
		node first=head;
		node second=prev;
		while(second!=null)
		{
			System.out.println("hello");
			if(first.value!=second.value)
			{
				return false;
			}
			first=first.next;
			second=second.next;
		}
		
		return true;
	}
}
class driver{
	public static void main(String args[])
	{
	node n1=new node(10);
	node n2=new node(20);
	node n3=new node(30);
	node n4=new node(20);
	node n5=new node(40);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=null;
	node head=n1;
    pallindrm ob=new pallindrm();
	if(ob.isPallindrom(head)){System.out.println("It is a pallindrom");}
	else{System.out.println("It is not a pallindrm");}
}
}