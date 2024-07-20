import java.util.* ;



class ArrayMultiplication{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

int r=sc.nextInt();

int c=sc.nextInt();

int r1=sc.nextInt();

int c1=sc.nextInt();

int arr1[][]=new int[r][c];

int arr2[][]=new int[r1][c1];




int mul[][]=new int[r1][c1];

int i,j,k;

for(i=0;i<r;i++){

for(j=0;j<c;j++)

arr1[i][j]=sc.nextInt();}

for(i=0;i<r1;i++){

for(j=0;j<c1;j++)



arr2[i][j]=sc.nextInt();
}
if(r1!=c)

System.out.print("Invalid");

else{

for(i=0;i<r;i++){

for(j=0;j<c1;j++){

mul[i][j]=0;

for(k=0;k<r1;k++)

mul[i][j] +=arr1[i][k]+ arr2[k][j];}}

for(i=0;i<r; System.out.println(),i++){

for(j=0;j<c1;j++){

System.out.print(mul[i][j]+" ");}
}
}

}

}