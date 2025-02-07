class Solution
{
    /* Returns level of given data value */
    int getLevel(Node node, int data)  
    { 
        int h=height(node);
        for(int i=1;i<=h;i++){
            if(targetCheck(node,i,data)==1)return i;
        }
      return 0;
    } 
    static int targetCheck(Node node,int level,int data){
        if(node==null)return 0;
        if(level==1 )
        {
            if(node.data==data)return 1;
            else return 0;
        }
     return  targetCheck(node.left,level-1,data)|
            targetCheck(node.right,level-1,data);
    }
    static int height(Node node){
        if(node==null)return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }

}
//tree question 
//geeks for geeks 