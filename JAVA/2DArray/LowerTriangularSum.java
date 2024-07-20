import java.util.*;
class LowerTriangularSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    //int c=sc.nextInt();
    int arr[][]=new int[r][r];
    int i,j,sum=0;
    for(i=0;i<r;i++){
      for(j=0;j<r;j++)
      arr[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++){
      for(j=0;j<r;j++){
        if(i>=j)
        sum +=arr[i][j];
  }
    }
  System.out.print(sum);
  }
}