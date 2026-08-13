/*class Node{
	int ele;
	Node next;
	Node prev;
	Node(int ele,Node next,Node prev)
	{
		this.ele=ele;
		this.next=next;
		this.prev=prev;
	}
	Node(int ele)
	{
		this.ele=ele;
		this.next=null;
		this.prev=null;
	}
}
class reverse{
	public Node solution(Node head)
	{
		Node tempf=head;
		Node templ=head;
		while(templ.next!=null)
		{
			templ=templ.next;
		}
		while(tempf!=templ && tempf.prev!=templ )
		{
			int temp = tempf.ele;
			tempf.ele = templ.ele;
			templ.ele = temp;
			tempf=tempf.next;
			templ=templ.prev;
		}
		return head;
	}
	public void printlist(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.ele+" ");
			temp=temp.next;
		}
	}
}
class driver{
	public static void main(String args[])
	{
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		n1.next=n2;
		n1.prev=null;
		n2.next=n3;
		n2.prev=n1;
		n3.next=n4;
		n3.prev=n2;
		n4.next=null;
		n4.prev=n3;
		Node head=n1;
		reverse ob=new reverse();
		head=ob.solution(head);
		System.out.println("After reversing:");
		ob.printlist(head);
	}
}*/
//BRUTE FORCE APPROACH TO REVERSE DLL
import java.util.*;
class Node{
	int ele;
	Node next;
	Node prev;
	Node(int ele,Node next,Node prev)
	{
		this.ele=ele;
		this.next=next;
		this.prev=prev;
	}
	Node(int ele)
	{
		this.ele=ele;
		this.next=null;
		this.next=null;
	}
}
//WE WILL USE STACK DATA STRUCTURE
class reverse{
	public Node stackreverse(Node head)
	{
		Stack<Integer> st=new Stack<>();
		Node temp=head;
		while(temp!=null)
		{
			st.push(temp.ele);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
			temp.ele=st.pop();
			temp=temp.next;
		}
		return head;
	}
	public void printlist(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.ele+" ");
			temp=temp.next;
		}
	}
}
class driver{
	public static void main(String args[])
	{
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		n1.next=n2;
		n1.prev=null;
		n2.next=n3;
		n2.prev=n1;
		n3.next=n4;
		n3.prev=n2;
		n4.next=null;
		n4.prev=n3;
		Node head=n1;
		reverse ob=new reverse();
		head=ob.stackreverse(head);
		ob.printlist(head);
	}
}
