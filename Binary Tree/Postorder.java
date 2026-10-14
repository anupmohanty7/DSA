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
class Inorder{
	static void solution(node root){
		
		if(root.left != null){
			solution(root.left);
		}
			
		
		if(root.right!=null){
			solution(root.right);
		}
		
		System.out.println(root.data+" ");
	}
}
class Main{
	public static void main(String args[]){
		node root = new node(1);
		
		root.left = new node(2);
		
		root.right = new node(3);
		
		root.left.left = new node(4);
		
		root.left.right = new node(5);
		
		Inorder ob = new Inorder();
		
		ob.solution(root);
	}
}