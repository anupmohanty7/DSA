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
		this.prev=null;
	}
}
class driver{
	public static void main(String args[])
	{
	Node n1=new Node(10);
	Node n2=new Node(20);
	Node n3=new Node(30);
	n1.next=n2;
	n1.prev=null;
	n2.next=n3;
	n3.prev=n1;
	n3.next=null;
	n3.prev=n2;
	Node head=n1;
	System.out.println(head);
	System.out.println(n1);
	System.out.println(n2);
	}
	
}