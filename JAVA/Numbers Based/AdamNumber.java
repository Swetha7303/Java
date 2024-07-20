import java.util.Scanner;

class AdamNumber{

public static void main(String args[]) {

Scanner obj = new Scanner(System.in);

int num=obj.nextInt();

int sqr_num= square (num);

int rev_num= reverse (num);

int sqr_rev_num = square(rev_num);

int rev_sqr_rev_num = reverse(sqr_rev_num);

//Adam number

if(sqr_num==rev_sqr_rev_num)

System.out.println("Adam number");

else System.out.println("Not Adam number");
}

public static int square (int num) 
{

return num*num;

}
public static int reverse(int num) 
{

int rev=6;
while(num!=0)

{
rev=rev*10+num%10; num/=10;
}
return rev;
}
}