import java.util.*;
class Center0Pattern{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int i,j;
    if(r%2==1){
    for(i=1;i<=r;System.out.println(),i++){
      for(j=1;j<=r;j++){
        if(j==(r/2)+1)
        System.out.print("0");
        else if(i==(r/2)+1)
        System.out.print("0");
        else System.out.print("1");
    } 
    }
    }
    else {
      for(i=1;i<r;System.out.println(),i++){
    for(j=1;j<r;j++){
      if(j==(r/2))
      System.out.print("0");
      else if(i==(r/2))
      System.out.print("0");
      else System.out.print("1");
      
    }
      
    }
  }
 }
}