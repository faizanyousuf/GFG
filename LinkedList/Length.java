/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        
      Node current = head;
      int length = 0;
      while(current != null){
          length++;
          current = current.next;
      }
      return length;
    }
}