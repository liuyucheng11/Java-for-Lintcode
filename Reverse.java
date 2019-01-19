public class Reverse {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode save = null;
         ListNode temp = head;
         while(temp!=null){
             ListNode Next = temp.next;
             temp.next = save;
             save = temp;
             temp = Next;
             
             
         }
         return save;

        }          
    
    
            
        
    
}