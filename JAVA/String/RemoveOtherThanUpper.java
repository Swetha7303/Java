import java.util.*;
class RemoveOtherThanUpper{
public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  String s1=s.nextLine();
  for(char ch:s1.toCharArray()){
    if(ch>='A'&& ch<='Z'){
      System.out.print(ch);
    }
  }
}
}