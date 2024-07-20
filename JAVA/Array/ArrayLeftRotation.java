import java.util.Scanner;
class ArrayLeftRotation

{

public static void main(String[] args) {

Scanner obj = new Scanner(System.in);

int size =obj.nextInt();

int[] arr=new int[size];

int itr;

for(itr=0;itr<size;itr+=1)

arr[itr]=obj.nextInt();

int rot_count=obj.nextInt();

for(int i=1;i<=rot_count%size; i++) {

//rotation -->left

int safe =arr[0];

for (itr = 0; itr < size -2; itr += 1)

arr[itr] = arr[itr + 1];

arr[size -1] = safe;

}

for(itr=0;itr<size;itr+=1){

System.out.print(arr[itr]+" ");

}

}

}