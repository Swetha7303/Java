import java.util.*;
class SquareMatrix{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int arr[][]=new int[r][r];
    int i,j,co=0;
    for(i=0;i<r;i++){
      for(j=0;j<r;j++)
      arr[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++){
      for(j=0;j<r;j++){
        if(i==j){
          if(arr[i][j]!=0) co+=1;
          else break;}
          else{ if(arr[i][j]==0) co+=1;
          else break;}
    }
  }
  if(co<(r*r)) System.out.print("Not a Diagonal matrix");
  else System.out.print("Diagonal matrix");}
}