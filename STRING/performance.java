// package com.STRING;
class performance{
public static void main(String[] args) {
    String series=" ";
      for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        System.out.println(ch);
        series+=ch; //series=series+ch;
      }
      System.out.println(series);
}
// too much memory wastage has done that's why we are now focusing more over on string builder.
}