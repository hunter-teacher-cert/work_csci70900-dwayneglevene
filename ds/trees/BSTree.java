import java.io.*;
import java.util.*;


public class BSTree{
	private TreeNode root;

	public BSTree(){
		root = null;
	}

	public int search(int key){
		TreeNode newNode = new TreeNode(key);

		//if tree is emppty manually insert new node as root

		if(root == null){
			root = newNode;
			return;
		}
		TreeNode front = root;
		TreeNode trailer;

		while(front != null){
			int frontValue = front.getData();
			if (frontValue ==key){
				//if key is here it means the key is 
				//already in the node in someway
				//then just return
				return frontValue;
			}else if (frontValue < key){
				trailer = front;
				front = front.getRight();
			}else {
				trailer = front;
				front = front.getLeft();
			}
		}
		if(key > front.getVale()){
			//insert on the right
			front.setRight(newNode);
		}else{
			//inser on left
			front.setLeft(newNode);
		}
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