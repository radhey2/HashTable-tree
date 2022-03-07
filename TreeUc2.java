package Hashtable;

public class TreeUc2 {
	 public static void main(String[] args)   
	    {  
	        new TreeUc2().run();  
	    }  
	    static class Node   
	    {  
	        Node left;  
	        Node right;  
	        int value;  
	        public Node(int value)   
	        {  
	            this.value = value;  
	        }  
	    }  
	    public void run()   
	    {  
	        Node rootnode = new Node(56);  
	        System.out.println("Building tree with root value " + rootnode.value);  
	        System.out.println("=================================");  
	        insert(rootnode, 30);  
	        insert(rootnode, 70);  
	        insert(rootnode, 22);  
	        insert(rootnode, 40);  
	        insert(rootnode, 60);  
	        insert(rootnode, 95);
	        insert(rootnode, 11);
	        insert(rootnode, 3);
	        insert(rootnode, 16);
	        insert(rootnode, 65);
	        insert(rootnode, 63);
	        insert(rootnode, 67);
	    }  
	    public void insert(Node node, int value)   
	    {  
	        if (value < node.value)   
	        {  
	            if (node.left != null)   
	            {  
	                insert(node.left, value);  
	            } else   
	            {  
	                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
	                node.left = new Node(value);  
	            }  
	        }   
	        else if (value > node.value)   
	        {  
	            if (node.right != null)   
	            {  
	                insert(node.right, value);  
	            } else   
	            {  
	                System.out.println("  Inserted " + value + " to right of Node " + node.value);  
	                node.right = new Node(value);  
	            }  
	        }  
	    }  
	} 