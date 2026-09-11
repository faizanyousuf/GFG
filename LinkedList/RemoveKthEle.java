/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        int counter = 0;
        
        Node current = head;
        Node prev = null;
        
        if(k == 1){
            head = null;
          return head;  
        }
        while(current != null){
            counter++;
            if(counter == k){
                // if(prev == null){
                //     prev = current;
                // }
                prev.next = current.next;
                counter = 0;
            }
        prev = current;
        current = current.next;
        }
        
    return head;
    }
}