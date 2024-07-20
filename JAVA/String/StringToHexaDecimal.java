import java.util.*;
class StringToHexaDecimal{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    String s2=s1;
    int c=0,d=0;
    for(char ch:s1.toCharArray()){
      d +=1;
    }
    for(char ch:s2.toCharArray()){
      if(ch>='A' && ch<='F')
      c +=1;
      else if(ch==0 || ch==1|| ch==2||ch==3||ch==4 || 
      ch==5|| ch==6|| ch==7|| ch==8||ch==9)
      c +=1;
      else break;
    }
    if(d>c)
    System.out.print("NO");
    else System.out.print("YES");
  }
}