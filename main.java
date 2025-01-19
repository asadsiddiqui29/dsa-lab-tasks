/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ahsan
 */
 class Node{
    int key ;
    Node left,right;
    
     Node(int item)
    {
        this.key = item;
        this.left= right= null;
    }
}
class BST
{
    Node root;
    BST (int key)
    {
        root= new Node(key);
    }
    
    BST()
    {
     root= null;
    }
    
    void printPostorder(Node node)
    {
        if (node==null)
        return;
        
        printPostorder(node.left);
        
        printPostorder(node.right);
        
        System.out.print(node.key +" ");
    }
    
    void printInorder(Node node)
    {
        if (node == null)
        return;
        
        printInorder(node.left);
        
        System.out.print(node.key+" ");
        
        printInorder(node.right);
    }
    
    void printPreorder(Node node)
    {
        if (node== null)
        return;
        
        System.out.print(node.left);
        
        printPreorder(node.left);
        
        printPreorder(node.right);
    }
    public static void main(String[] args)
    {
        BST tree= new BST();
        
        tree.root=new Node(8);
        
        Node a = new Node(3);
        tree.root.left=a;
        Node b= new Node(10);
        tree.root.right=b;
        
        a.left= new Node(1);
        a.right= new Node(6);
        
        b.left= new Node(9);
        b.right= new Node(14);
        
        System.out.println("pre-order");
        tree.printPreorder(tree.root);
        System.out.println("\npost-order");
        tree.printPostorder(tree.root);
        System.out.println("\nIn-order");
        tree.printInorder(tree.root);
    }
}