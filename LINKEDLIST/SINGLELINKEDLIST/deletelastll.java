class Node{
	int ele;
	Node next;
	Node(int ele,Node next)
	{
		this.ele=ele;
		this.next=next;
	}
	Node(int ele)
	{
		this.ele=ele;
		this.next=null;
	}
}
class deletelastll
{
	public Node deletelast(Node head)
	{
		if(head==null || head.next==null)
		{
			return null;
		}
		Node temp=head;
		Node t=head;
		while(temp.next!=null)
		{
			t=temp;
			temp=temp.next;
		}
		t.next=null;
		return head;
	}
	public void printlist(Node head)
	{
		Node tem=head;
		while(tem!=null)
		{
			System.out.print(tem.ele+" ");
			tem=tem.next;
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
		n2.next=n3;
		n3.next=n4;
		Node head=n1;
		head.next=n2;
		deletelastll ob=new deletelastll();
		ob.printlist(head);
		head=ob.deletelast(head);
		System.out.println("After deletion :");
		ob.printlist(head);
	}
}