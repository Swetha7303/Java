import java.util.Scanner;

class AmstrongNumber {

public static void main(String args[]) {

Scanner obj = new Scanner(System.in);

int num=obj.nextInt();

int temp=num,count=0;

while(temp!=0)

{

count++;

temp/=10;

}

int sum=0;

temp=num;

while(temp!=0)

{

sum+=power( temp%10,count);
 temp/=10;

}

if (sum==num)

System.out.println("Armstrong");

else System.out.println("Not armstrong");

}

public static int power(int base, int expo)  {

int itr, product=1;

for(itr=1;itr<=expo; itr+=1)

product=base;

return product;
}
}