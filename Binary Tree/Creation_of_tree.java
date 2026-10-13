class Node{
	
	int data;
	int left;
	int right;
	
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
	
}
class Solution{
	public createbinarytree(){
		
		Node root = new Node(1);
		
		root.left = new Node(2);
		
		root.right = new Node(3);
		
		root.left.left= new Node(4);
		
	}
}
class Driver{
	public static void main(String args[]){
		
		Solution solution = new Solution();
		
		Node node=solution.createbinarytree();
		
	}
}