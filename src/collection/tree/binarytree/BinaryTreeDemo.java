package collection.tree.binarytree;

public class BinaryTreeDemo {
    public static void main(String []args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
    }

}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value,Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
class BinarySearchTree{
    Node root;
    BinarySearchTree(){
        this.root = null;
    }
    public void insert(int value){
        Node node = new Node(value,null,null);
        if(this.root == null){
            this.root = node;
            return;
        }
        Node currentNode = this.root;
        while(currentNode !=  null){
            if(currentNode.value> value){
                if(currentNode.left != null)
                currentNode = currentNode.left;
                else {
                    currentNode.left = node;
                    break;
                }
            }else{
                if(currentNode.right != null)
                currentNode = currentNode.right;
                else{
                    currentNode.right = node;
                    break;
                }
            }
        }
    }

    void lookup(int value){

    }
    void traverse(){
    }
}

