public class middle_no {
    public ListNode =middleNode(ListNode head){
       
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
  
}
// 12345 hai toh 
// 345 print karnwan hai 
// bus slow return karne se kar dega woh 345 ek or loop nhi lagna padhega slow se fast tak??
