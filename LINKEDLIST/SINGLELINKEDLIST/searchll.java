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
class searchll{
	public void search(int e,Node head)
	{
		if(head==null)
		{
			System.out.println("There is no element in linked list");
		}
		
		Node temp=head;
		while(temp!=null)
		{
			if(e==temp.ele)
			{
				System.out.println(e+" is present");
				return;
			}
			temp=temp.next;
		}
		System.out.println("Element not found");
	}
}
class driver
{
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
		searchll ob=new searchll();
		ob.search(50,head);
	}
}