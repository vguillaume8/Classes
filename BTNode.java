package btnode;
public class BTNode<E> {

    private E data;  // data stored in the node
    private BTNode<E> left; // reference to the left child
    private BTNode<E> right; // reference to the right child

    public BTNode(E intialData, BTNode<E> intialLeft, BTNode<E> initialRight) {

        data = intialData;
        left = intialLeft;
        right = initialRight;
    }
//-----------------------------------------------------------------------------------------
    // gets Data from this Node
    public E getData() {

        return data;
    }
//-----------------------------------------------------------------------------------------
    // Gets reference from the left child
    public BTNode<E> getLeft() {

        return left;
    }
//-----------------------------------------------------------------------------------------
    // Gets reference from the right child
    public BTNode<E> getRight() {

        return right;
    }
//-----------------------------------------------------------------------------------------
    // Set data of this Node
    public void setData(E newData) {

        data = newData;

    }
//-----------------------------------------------------------------------------------------
    // Set left child
    public void setLeft(BTNode<E> newLeft) {

        left = newLeft;

    }
//-----------------------------------------------------------------------------------------
    // Set right child
    public void setRight(BTNode<E> newRight) {
        
        right = newRight;

    }
//-----------------------------------------------------------------------------------------
    // Check if Node is a leaf
    public boolean isLeaf() {

        return (left == null) && (right == null);
    }
//-----------------------------------------------------------------------------------------
    // Gets the data of the leftmost node of the tree starting with this node
    public E getLeftmostData() {

        if (left == null) {
            return data;

        } else {
            return left.getLeftmostData();
        }
    }
//-----------------------------------------------------------------------------------------
    // Remove the leftmost node of the tree with this Node as its root
    public BTNode<E> removeLeftmost() {

        if (left == null) {
            // There is no left child
            return right;
            
        } else {
            // A recursive call removes the leftmost node from the left subtree
            left = left.removeLeftmost();
            return this;
        }

    }
//-----------------------------------------------------------------------------------------
    // Remove the rightmost node of the ree with this Node as its root
    public BTNode<E> removeRightmost() {
        if (right == null) {
            // There is no right child
            return left;
        } else {
            // A recursive call removes the rightmost node from the right subtree
            right = removeRightmost();
            return this;
        }
    }
//-----------------------------------------------------------------------------------------
    // Copy an entire tree
    public static <E> BTNode<E> treeCopy(BTNode<E> source) {
        BTNode<E> leftCopy, rightCopy;

        if(source == null) {
            return null;
        } else {
            leftCopy = treeCopy(source.left);
            rightCopy = treeCopy(source.right);
            return new BTNode<E>(source.data, leftCopy, rightCopy);
        }
    }
//-----------------------------------------------------------------------------------------
    // Pre-order traversal to print the data from each node
    public void preorderPrint() {
        System.out.println(data);
        if (left != null) {
            left.preorderPrint();
        } if (right != null) {
            right.preorderPrint();
        }
    }
//-----------------------------------------------------------------------------------------
    // In-order traversal to print the data from each node
    public void inorderPrint() {
        if (left != null) {
            left.inorderPrint();
        } 
        System.out.println(data);
        if (right != null) {
            right.inorderPrint();
        }
    }
//-----------------------------------------------------------------------------------------
    // Post-order traversal to print the data from each node
    public void postorderPrint() {
        if (left != null) {
            left.postorderPrint();
        }
        if (right != null) {
            right.preorderPrint();
        }
        System.out.println(data);
    }
//-----------------------------------------------------------------------------------------
    // Print binary tree
    public void print(int depth) {
        int i;

        // Print the indentation and the data from the current node
        for (i = 1; i<= depth; i++) {
            System.out.print("    ");
            }
        System.out.println(data);

        // Print the left subtree
        if (left != null) {
            left.print(depth+1);
        } else if (right != null) {
            for (i = 1; i <= depth+1; i++) {
                System.out.print("    ");
            }
            System.out.println("--");
        }

        // Print the right subtree
        if (right != null) {
            right.print(depth+1);
        } else if (left != null) {
            for (i = 1; i <= depth+1; i++) {
                System.out.print("    ");
            }
            System.out.println("--");
        }
    }
//-----------------------------------------------------------------------------------------
    // Gets the size of the tree
    public static <E> int treeSize(BTNode<E> root) {

        if (root == null) {
            return 0;
        }
        else {
            return 1 + treeSize(root.left) + treeSize(root.right);
        }
    }
//-----------------------------------------------------------------------------------------
  
    
    


    

}