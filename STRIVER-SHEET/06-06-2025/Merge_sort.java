// Let's look at the working of above example: 

// Divide: 
// [38, 27, 43, 10]  is divided into  [38, 27] and  [43, 10]  . 
// [38, 27]  is divided into  [38]  and  [27]  . 
// [43, 10]  is divided into  [43]  and  [10]  .

// Conquer: 
// [38]  is already sorted. 
// [27]  is already sorted. 
// [43]  is already sorted. 
// [10]  is already sorted. 

// Merge: 
// Merge  [38]  and  [27]  to get  [27, 38]  . 
// Merge  [43]  and  [10]  to get  [10,43]  . 
// Merge  [27, 38]  and  [10,43]  to get the final sorted list  [10, 27, 38, 43] 
// Therefore, the sorted list is  [10, 27, 38, 43]. 

// Approach : 
// Divide the array into two parts until only single remain 
// then compare each of them 
// consequently compare and merge it until the length is equal to 
public class Merge_sort {
    
    public static void main(String[] args){
    
    }

    static void swap(){
    
    }

}
