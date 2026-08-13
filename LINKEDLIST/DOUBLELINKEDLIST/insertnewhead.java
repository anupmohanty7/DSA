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
class insertnewhead{
	public Node solution(Node head,int newele)
	{
		Node y=new Node(newele);
		y.next=head;
		head.prev=y;
		y.prev=null;
		head=y;
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
		insertnewhead ob=new insertnewhead();
		head=ob.solution(head,5);
		System.out.println("After inserting new head :");
		ob.printlist(head);
	}
}