/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Tree {
    
    public Node root;
    static String order = "";

    public Tree() {
        root = root;
    }
    
    
    public void clear(){
        
    }
    
    public void insert(int v){
        Node newNode = new Node(v);
        if(root==null){
            root = newNode;
        }
        else{
            Node current = root; // start at root
            Node parent;
        }
    }
    
    public boolean search(int k){
        Node current = root;
        while(current != null)
         {
            if (key == current.iData)
            return current;
        else if(key < current.iData ){
            current = current.leftChild;
        }
        else{
            current = current.rightChild;
        }
        return false;
    }
    
    public boolean delete(int key){
        
	Node current = root;
        Node parent = root;
	boolean isLeftChild = true;
	while(current.getNumber() != key)
	{
		parent = current;
			if(key < current.getNumber())
			{
				isLeftChild = true;
				current = current.leftChild;
			}
			else
			{
				isLeftChild = false;
				current = current.rightChild;
			}
		if(current == null)
			return false;
	}

        if(current.leftChild == null && current.rightChild == null)
        {
		if(current == root)
			root = null;
		else if(isLeftChild)
			parent.leftChild = null;
		else
			parent.rightChild = null;
          }
	else if(current.rightChild == null)
		if(current == root)
				root = current.leftChild;
		else if(isLeftChild)
			parent.leftChild = current.leftChild;
		else
 			parent.rightChild = current.leftChild;

	else if(current.leftChild == null)
		if(current == root)
			root = current.rightChild;
		else if(isLeftChild)
			parent.leftChild = current.rightChild;
		else
			parent.rightChild = current.rightChild;
        else
        {
            Node successor = getSuccessor(current);
            if(current == root)
                        root = successor;
            else if(isLeftChild)
                        parent.leftChild = successor;
            else
                        parent.rightChild = successor;

            successor.leftChild = current.leftChild;

        }

        return true;
    }

    private Node getSuccessor(Node dn){
        
        Node sp = dn;
        Node s = dn;
        Node current = s.rightChild;

        while(current != null)
        {
            sp = s;
            s = current;
            current = current.leftChild;
        }
        if(s != dn.rightChild)
        {
            sp.leftChild = s.rightChild;
            s.rightChild = dn.rightChild;
        }
        return s;
    }
    
    public String display(int o){
        
        order = "";
        switch(o){
            case 1:
                inOrder(root); break;
            case 2:
                preOrder(root); break;
            case 3:
                postOrder(root); break;
            default:
                break;
        }
        return order;
    }
    
    private void inOrder(Node lr){
        if(root != null){
            inOrder(root.leftChild);
            root.display();
            inOrder(root.rightChild);
        }
    }
    
    private void preOrder(Node lr){
        if(root != null){
            root.display();
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }
    
    private void postOrder(Node lr){
        if(lr != null){
            postOrder(lr.leftChild);
            postOrder(lr.rightChild);
            order += lr.getNumber() + " ";
        }
    }
    
}
