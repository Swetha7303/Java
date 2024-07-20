import java.util.ArrayList;

import java.util.List;

class GenericClass

{

public static void main(String[] args) {

System.out.println(nongeneric("Nandha", "college"));

System.out.println(generic("nandha", "college", 1000));

System.out.println(generic(100, 200, "nandha"));

}

public static List<String> nongeneric (String str1, String str2) 

{

ArrayList<String> list=new ArrayList<>();

list.add(str1);

list.add(str2);

return list;



}

public static <T>List<T> generic(T str1, T str2, T str3) 

{

ArrayList<T> list=new ArrayList<>();

list.add(str1);

list.add(str2);

list.add(str3);

return list;

}

}