import java.util.*;

class ExceptionHandling

{

public static void main(String[] args) throws Exception{

Scanner obj=new Scanner(System.in);

int num1=obj.nextInt();

int num2=obj.nextInt();

System.out.println("Starting");

try {

divide(num1, num2);

}
catch(Exception in)

{

System.out.println("can't divide");
}

finally
{
System.out.println("success");
}
}

public static void divide(int a, int b) 

{

System.out.println(a/b);
}

}