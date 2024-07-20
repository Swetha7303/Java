import java.util.Scanner;

class ArrayRightRotation {

public static void main(String args[]) {

Scanner obj = new Scanner(System.in);

int size= obj.nextInt();

int[] arr=new int[size];

int itr;

for(itr=0;itr<size;itr+=1)

arr[itr]=obj.nextInt();

//rotation -->right

int temp;

int rot_count=obj.nextInt();

for(int i=1;i<=rot_count%size; i++) {

temp = arr[size -1];

for (itr =size- 1 ; itr >= 1; itr = 1)

arr[itr] = arr[itr- 1];

arr[0] = temp;

}

for(int i :arr) System.out.print(i+" ");
}
}