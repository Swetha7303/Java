import java.util.*;
public class SpecialCharCount{
public static void main(String args[]){
  Scanner n=new Scanner(System.in);
  String s=n.nextLine();
  int count =0;
  for(char ch:s.toCharArray()){
    if(ch=='!'||ch=='@'||ch=='#'||ch=='%'||ch=='$'||ch=='&')
    count +=1;
  }
  System.out.print(count);
}
}