public class LL_cycle_length{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
        public int lengthCycle(ListNode head) {
            if(head==null)System.out.println("no cycle");
            ListNode slow=head;
            ListNode fast=head.next;
            
                while(fast==null||fast.next==null){
                    System.out.println("no cycle");
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast){
                        ListNode temp=slow;
                        //need an another node to traverse and get back to slow pointer ifself.
                        int length=0;
                        do{
                            temp=temp.next;
                            length++;
                        }while(temp!=slow);
                        System.out.println(length);
                    }
                } 
            
            return 0; 
        }
    

}
// can't run here bcoz all prerequiestics can be done in leetcode kind of platform only.