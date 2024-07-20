class nandha implements Runnable 2 usages

{

public void run()

{

System.out.println("Nandha engineering "+Thread.currentThread().getId());

 System.out.println("Service Batch "+Thread.currentThread().getId()); 

System.out.println("Java course "+Thread.currentThread().getId());

}

}

public class CurrentThread

{

public static void main(String[] args) {

int itr=1;

while(itr<=3)

{

nandha obj=new nandha();

Thread obj1 =new Thread(obj);

obj1.start();

itr+=1;

}
}
}