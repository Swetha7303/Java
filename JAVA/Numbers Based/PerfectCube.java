import java.util.*;
class PerfectCube{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int i;
    for(i=1;i<=a;i++){
    int cube=i*i*i;
    if(cube==a){
    System.out.print("Perfect Cube");
    break;}
    else if(cube>a){
    System.out.print("Not a Perfect Cube");
    break;}
    else continue;
    }
  }
}