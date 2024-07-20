@FunctionalInterface 

interface nandha

{

public void college(int student, int dept, String name); }

class FunctionalInterfaceWithParameter

{

public static void main(String[] args) {

nandha obj =(student, dept, name) ->{

System.out.println("Student count is "+student);

System.out.println("department count is "+dept); System.out.println(name);

};

obj.college(1000, 12,  "Nandha Engineering");

}

}