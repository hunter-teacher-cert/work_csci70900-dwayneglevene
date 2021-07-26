import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }

	public void traverse(TreeNode current){
		if(current == null)
			return;

		//process the current node

		System.out.print(current.getData() + ",");

		//recurseively print out the left subtree
		traverse(current.getLeft());
		//recursively print out the right subtree
		traverse(current.getRight());
	}

	public void traverse(){
		traverse(root);
		System.out.println();
	}
	
	public void traverse2(TreeNode current){
		if(current == null)
			return;

		

		//recurseively print out the left subtree
		traverse2(current.getLeft());
		//recursively print out the right subtree
		traverse2(current.getRight());

		//process the current node

		System.out.print(current.getData() + ",");
	}

	public void traverse2(){
		traverse(root);
		System.out.println();
	}

	public void traverse3(TreeNode current){
		if(current == null)
			return;

		

		//recurseively print out the left subtree
		traverse3(current.getLeft());


		//process the current node

		System.out.print(current.getData() + ",");

		//recursively print out the right subtree
		traverse3(current.getRight());
	}

	public void traverse3(){
		traverse3(root);
		System.out.println();
	}
	


    public void insert(int key){

	TreeNode newNode = new TreeNode(key);

	// if the tree is empty
	// manually insert the new node as the root
	if (root==null){
	    root = newNode;
	    return;
	}
	
	TreeNode front = root;
	TreeNode trailer = root;
	
	while (front != null){
	    int frontValue = front.getData();
	    if (frontValue == key){
		// if we're here, it means the key is
		// already in the tree so we can
		// update this node in some way
		// and then return
		return;
	    } else if (frontValue < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }
	}
	if (key > trailer.getData()){
	    // insert on the right
	    trailer.setRight(newNode);
	} else {
	    // insert on left
	    trailer.setLeft(newNode);

	}
	
	

    }


    public int search(int key){
	TreeNode current = root;

	while (current != null){
	    int currentValue = current.getData();
	    if (currentValue == key){
		return currentValue;
	    } else if (currentValue < key){
		current = current.getRight();
	    } else {
		current = current.getLeft();
	    }
	}
	throw new NullPointerException();

    }
    
    public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);
	
	}
    
    
}