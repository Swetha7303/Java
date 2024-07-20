import java.util.*;
 class Treeset{
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         TreeSet set = new TreeSet<>();
         set.add(10);
         set.add(12);
         set.add(15);
         set.add(3);
         set.add(1);

         System.out.print(set);
//      set.remove(10);
//      set.removeFirst();
//      set.removeLast();
         Iterator ele;
         ele = set.descendingIterator();
         System.out.println(" ");
         while (ele.hasNext()) {
             System.out.print(ele.next()+" ");
         }
     }
 }
