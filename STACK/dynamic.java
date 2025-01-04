// we will made dynamic stack means if the stack is full then it automatically resize it self 
public class dynamic extends stack {
    

    public dynamic(){
     super();
    }
    public dynamic(int size){
        super(size);
    }
    @Override
    public boolean push (int item){
    if(this.isfull()){
        //double the array size
        int []temp=new int[stackArray.length*2];
     

        //copy all previous items in new data
        for(int i=0;i<stackArray.length;i++){
            temp[i]=stackArray[i];
        }
        stackArray=temp;
    }
    
    return super.push(item);
    }
}
