
public class BstSearch
{
	static class node
	{	//declaring data members of node
		int data; 
		node left; //left child node of the class node
		node right; // right child node of the class node
	
	node(int data)
	{
		this.data=data;
	}
	
	}
	
	public static node insert(node root, int val)
	{
		if(root==null) // if condition to check whether root node is null or not
		{
			root = new node(val); // new node value will be now the root value
			return root;
		}
		
		if(root.data>val)
		{
			//left subtree
			root.left= insert(root.left, val);
		}
		
		else
		{
			//right subtree
			root.right= insert(root.right, val);
		}
			
		return root;
		
	}
	
	public static void inorder(node root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+"");
		inorder(root.right);
	}
	
	public static boolean search(node root, int key) // time complexity O(H)
	{
		if(root==null) 
		{	
			return false;
		}
		
		if(root.data== key)
		{
			//key value found
			return true;
		}
		if(root.data>key)  
		{
			//left subtree
			return search(root.left, key);
		}
		
		else 
		{
			//right subtree
			return search(root.right, key);
			
		}
		
		
		
		
	}
	public static void main(String args[])
	{
	int values[]={5,1,3,4,2,7};
	node root =null; // declaring root variable of type node
	for(int i=0; i<values.length; i++) // traversal of values inside the tree
	{
		root= insert(root, values[i]);
	}
	
	inorder(root);
	System.out.println();
	
	if(search(root, 67)) // condition for the value to be searched
	{
		System.out.println("Found");
	}
	
	else
	{
		System.out.println(" Not Found");
	
	}
	
	}
}