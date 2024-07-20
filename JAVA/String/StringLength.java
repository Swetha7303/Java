import java.util.*;
public class StringLength{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    String st=n.nextLine();
    int c=0;
    for(char ch : st.toCharArray()){
      c ++;
    }
    System.out.println(c);
  }
}