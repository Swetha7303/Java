import java.util.*;
class ScalarMatrix{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j,co=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++)
    arr[i][j]=sc.nextInt();
  }
  int b=arr[0][0];

  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if(i!=j){
        if(arr[i][j]==0) co+=1;
        else break;
  }
  else{ if(arr[i][j]==b) co+=1;
  else break;}
}
}
if(co<(r*c)) System.out.print("Not a scalar matrix");
else System.out.print("Scalar matrix");
}
}