package FirstForm;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
		
	}
}
public class BInaryTree {
	Node root;
	void insert(int data) {
		root=insertRec(root,data);	
	}
    Node insertRec(Node root,int data) {
	if(root==null) {
		root=new Node(data);
		return root;
	}
	if(data<root.data) {
		root.left=insertRec(root.left,data);
	}
		else if(data>root.data) {
			root.right=insertRec(root.right,data);
		}
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=minValue(root.right);
			root.right=deleteRec(root.right,root.data);	
	}
	return root;
}
    private Node deleteRec(Node right, int data) {
		// TODO Auto-generated method stub
		return null;
	}
	int minValue(Node root) {
    	int minv=root.data;
    	while(root.left!=null) {
    		minv=root.left.data;
    		root=root.left;
    	}
    	return minv;
    }
    void inorder() {
    	System.out.println("inorder");
    	inorderRec(root);
    	System.out.println();
    }
    void inorderRec(Node root) {
    	if(root!=null) {
    		inorderRec(root.left);
    		System.out.print(root.data+" ");
    		inorderRec(root.right);
    	}
    	
    }
    void preorder() {
    	System.out.println("preorder");
    	preorderRec(root);
    	System.out.println();
    }
    void preorderRec(Node root) {
    	if(root!=null) {
    		System.out.print(root.data+" ");
    		preorderRec(root.left);
    		preorderRec(root.right);
    		
    	}
    }
    void postorder() {
    	System.out.print("Postorder");
    	postorderRec(root);
    	System.out.println();
    }
    void postorderRec(Node root) {
    	if(root!=null) {
    		postorderRec(root.left);
    		postorderRec(root.right);
    		System.out.print(root.data+" ");
    			
    		}
    	}
    
	public static void main(String[] args) {
		BInaryTree tree=new BInaryTree();
		tree.insert(30);
		tree.insert(60);
		tree.insert(90);
		tree.insert(50);
		tree.insert(80);
		tree.inorder();
		tree.preorder();
		tree.postorder();
	//	System.out.println("\nDeleting 20..");
		//tree.delete(60);
		tree.preorder();
		tree.postorder();
		tree.inorder();
		
		
		
		
		// TODO Auto-generated method stub

	}

		// TODO Auto-generated method stub
		
	}

