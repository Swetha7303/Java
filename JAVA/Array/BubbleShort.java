import java.util.Scanner;

class BubbleShort

{

public static void main(String[] args) {

Scanner obj=new Scanner(System.in);

int size = obj.nextInt();

int[] arr = new int[size];

int itr;

for(itr=0;itr<size; arr[itr]=obj.nextInt(), itr+=1);

//bubble sort -->Ascending order

int pass,i,temp;

for (pass=0;pass<size-1;pass+=1)

{

for(i=0;i<size-1-pass;i+=1)

{

if(arr[i] > arr[i+1])

{

temp=arr[i];

arr[i]=arr[i+1];

arr[i+1]=temp;

}

}

} 
for(int ele: arr)

 System.out.print(ele+" ");

}

}