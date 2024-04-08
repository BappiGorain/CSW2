class Node
{
	int data;
	Node right;
	Node left;
	
	Node(int data)
	{
		this.data = data;
		this.right = null;
		this.left = null;
	}	
}


public class BST
{
	public static Node create(Node root, int data)
	{
		Node newNode = new Node(data);
		if(root == null)
		{
			return newNode;
		}
		else
		{
			if(root.data > data)
			{
				root.left = create(root.left,data);
			}
			else
			{
				root.right = create(root.right, data);
			}
		}
		return root;
	}
	
	public static void inOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		
	}
	
	public static Node Search(Node root, int key)
	{
		if(root == null)
		{
			return null;
		}
		if(root.data == key)
		{
			return root;
		}
		else if(root.data > key)
		{
			return Search(root.left, key);
		}
		else
		{
			return Search(root.right, key);
		}
	}
	
	public static void main(String args[])
	{
		Node root = null;
		root = create(root,13);
		root = create(root,7);
		root = create(root,20);
		root = create(root,5);
		root = create(root,10);
		root = create(root,23);
		root = create(root,6);
		System.out.print("InOrder Traversal : ");
		inOrder(root);
		Node s = Search(root, 10);
		System.out.println();
		System.out.println(s.data);
		
	}
}
