//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

//You'll need to supply any missing import statements:


public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
			tree = new TreeNode(val);
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest < 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}
   
   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}
	
	private void preOrder(TreeNode tree){
		if (tree != null){
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	private void postOrder(TreeNode tree){
		if (tree != null){
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue());
		}
	}
	private void revOrder(TreeNode tree){
		if (tree != null){
			revOrder(tree.getRight());
			System.out.print(tree.getValue());
			revOrder(tree.getLeft());
		}
	}
	//add preOrder, postOrder, and revOrder



	public int getNumLevels()
	{
		getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		Integer compare = 0;

		if (tree.getLeft() == null && tree.getRight() == null)
			return 1;
		Integer left = 0;
		if (tree.getLeft() != null)
			left += getNumLevels(tree.getLeft());
		Integer right = 0;
		if (tree.getRight() != null)
			right += getNumLevels(tree.getRight());
		
		compare = left.compareTo(right);
		if (compare > 0){
			return left;
		}
		else if (compare < 0){
			return right;
		}
		return left.intValue();
	}
   
   // Complete the traversals and the toString method
   // and then each of these:
   
   private TreeNode clear(TreeNode t){
		TreeNode temp = new TreeNode();
		t = temp;
		return t;
   }

   private int getNumLeaves(TreeNode t){
	if (t == null)
		return 1;
	if (t.getLeft() == null && t.getRight() == null){
		return 1;
	}
	return getNumLeaves(t.getLeft)

   }

	//getNumLeaves 
      
   //getHeight
   
   //getNumNodes
   
   //isFull
	
	//search
	
	//getSmallest
	
	//getLargest
		
   //getWidth

	//remove



   // Returns a String that represents 
   // an IN-ORDER traversal of the tree.
	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}

   public void levelOrder()
   {
      levelOrder(root);
      System.out.println("\n\n");
   }

   private void levelOrder(TreeNode tree)
   {
      if(tree==null)
         return;
   	  
      Queue<TreeNode> level = new LinkedList<TreeNode>();
      level.add(tree);
      while(!level.isEmpty())
      {
         TreeNode node = level.remove();
         out.print(node.getValue() + " ");
         if(node.getLeft()!=null)
         {
            level.add(node.getLeft());
         }
         if(node.getRight()!=null)
         {
            level.add(node.getRight());
         }
      }
   }
}