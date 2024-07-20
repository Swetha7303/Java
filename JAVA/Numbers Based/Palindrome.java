import java.util.*;
class Palindrome
{
public static void main(String[] args)
{ 
Scanner obj=new Scanner(System.in);
long num =obj.nextLong();
long rev_num=0,temp=num;
while(num!=0)
{ 
rev_num=10*rev_num+(num%10); 
num/=10;
}
// System.out.print(rev_num);
if(rev_num==temp)
System.out.print("Palindrome");
else
System.out.print("Not a Palindrome");
}
}