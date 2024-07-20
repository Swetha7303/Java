import java.util.*;
class ElementCheck{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int g=sc.nextInt();
    int arr[][]=new int[r][r];
    int i,j,c=0;
    for(i=0;i<r;i++){
      for(j=0;j<r;j++)
      arr[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++){
      for(j=0;j<r;j++){
    if(arr[i][j]==g)
    break;
    else c+=1;
  }
}
if(c<(r*r)) System.out.print("ELEMENT FOUND");
else System.out.print("ELEMENT NOT FOUND");
}
}