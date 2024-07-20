import java.util.*;

class MajorityElementArray{

public static void main(String[] args){

Scanner s=new Scanner(System.in);

int a=s.nextInt();

int arr[]=new int[a];

int count=0,i,j;

for(i=0;i<a;i++) {

arr[i]=s.nextInt();

}

for(i=0;i<a;i++) {

for(j=0;j<a;j++){

if(arr[i]==arr[j])

count++;

}

if(count>(a/2)){

break;

}

else{

count=0;

}

}

if(count>(a/2))

{

System.out.println("The majority element is: "+arr[i]);

}

else
{

System.out.println( "No majority element found in the array");

}
}
}