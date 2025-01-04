// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
      
          Queue<Integer> q2=new LinkedList<>();
          
          for(int i=0;i<k;i++){
            q2.add(q.remove());
          }
          
          while (!q2.isEmpty()) {
            q.add(q2.remove());
            }
        //   for(int i=0;i<k;i++){
        //     q.add(q2.remove());
        //   }
          
          for(int i=k;i<q.size();i++){
              
              
              q.add(q.remove());
          }
          
          
         return q; 
          
      }
      
    }

        
        
