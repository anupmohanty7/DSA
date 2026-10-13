//This is recursive method, there is another method using stack
import java.util.*;
class node{
	int data;
	node left;
	node right;
	
	public node(int data){
		this.data=data;
		left=right=null;
	}
}
class Preorder{
	static void solution(node root){
		
		if(root==null){return;}
		
		System.out.println(root.data+" ");
		
		solution(root.left);
		
		solution(root.right);
		
	}
}
class driver{
	public static void main(String args[]){
		node root= new node(1);
		root.left= new node(2);
		root.right= new node(3);
		root.left.left= new node(4);
		root.left.right= new node(5);
		
		Preorder ob= new Preorder();
		ob.solution(root);
		
		}
}