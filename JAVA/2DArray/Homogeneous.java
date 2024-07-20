import java.util.*;
class Homogeneous{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr1[][]=new int[r][c];
    int arr2[][]=new int[r][c];
    int i,j,co=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++)
      arr1[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++){
      for(j=0;j<c;j++)
      arr2[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
    if(arr1[i][j]==arr2[i][j])
    co+=1;
    else break;}
      
    }
    if(co<(r*c))
    System.out.print("NOT HOMOGENEOUS");
    else System.out.print("HOMOGENEOUS");
  }
}