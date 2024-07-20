import java.util.LinkedHashSet;

import java.util.LinkedList;

class LinkedListAndLinkedHashSet

{

public static void main(String[] args) {

LinkedList list=new LinkedList();

list.add(10);

list.add(20);

list.add(30);

list.add(10);

list.add(20);

list.add(40);

System.out.println("Before List");

LinkedHashSet set = new LinkedHashSet<>(list);

System.out.println(set);
}
