// package STRING;
public class sb {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            System.out.println(ch);
            builder.append(ch); 
            builder.reverse();
          }
          System.out.println(builder.toString());
    }
}
// there are many properties that builder contains do check it for later!!.