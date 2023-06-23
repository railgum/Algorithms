package Lesson_3;

public class List_simply {
    Node head;

    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }
    public Integer pop(){
        Integer result = null;
        if (head != null){
            result = head.value;
            head = head.next;
        }
        return result;
    }
    public void revert(){
        if (head != null && head.next != null){
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    private void revert(Node currentNode, Node previousNode){
        if (currentNode.next == null){
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
    public class Node {
        int value;
        Node next;
    }

}
