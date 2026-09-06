public class Insertion {
    
}
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        if(head == null){
            Node temp = new Node(x);
            head = temp;
        }else {
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
         Node temp = new Node(x);
        current.next = temp;
        }
       
        return head;
    }
}