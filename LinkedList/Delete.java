public class Delete {
    
}
/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        
        Node current = head;
        if(x == 1){
            head = current.next;
        }else{
        
         for(int i = 2; i < x; i++){
             current = current.next;

         }
           current.next = current.next.next;
        }
         
         return head;
        
    }
}
