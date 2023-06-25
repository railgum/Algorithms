package Homework_3;

public class RevertList {

    Node root;

    public void revert() {
        if (root != null && root.next != null){
            Node temp = root;
            revert(root.next, root);
            temp.next = null;
        }
    }
    private void revert(Node currentNode, Node previousNode){
        if (currentNode.next == null){
            root = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
    private class Node {
        int value;
        Node next;
    }
}
