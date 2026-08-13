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
class deleteheadll{
	public Node deletehead(Node head)
	{
		
		head=head.next;
		return head;
	}
	public void printlist(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.ele+" ");
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
		n2.next=n3;
		n3.next=n4;
		Node head=n1;
		head.next=n2;
		deleteheadll ob=new deleteheadll();
		head=ob.deletehead(head);
		ob.printlist(head);
	}
}