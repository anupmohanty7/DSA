//THIS IS THE BEST OPTIMAL APPROACH HERE WE TORTOISE AND HARE METHOD
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
class findmiddle{
	public Node middle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
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
		findmiddle ob=new findmiddle();
		System.out.println((ob.middle(head)).ele);
		
		}
}
