class myself 

{

void print() 

{

System.out.println("myself"); }

void print(int age)

{

System.out.println("my age "+age); }

void print(float cgpa) 

{
System.out.println("My cgpa is "+cgpa);
}
}

public class MethodOverload

{

public static void main(String[] args) {

myself obj=new myself();

obj.print();

obj.print(50);

obj.print(8.13134f);



}

}