import java.util.*;
public class StringToNumber {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder s=new StringBuilder();
       
       for(char c:str.toCharArray()){
   if(Character.isDigit(c)){
      s.append(c);
   }}
   if(s.length()>0)
    System.out.print(s.toString());
    else System.out.print("0");
}
}
