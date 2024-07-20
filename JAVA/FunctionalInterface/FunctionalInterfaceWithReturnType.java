@FunctionalInterface 

interface students

{

public int count(int male, int female); 
}

class FunctionalInterfaceWithReturnType

{

public static void main(String[] args) {

students obj=(male, female)->{

return male+female;

};

System.out.println(obj.count( 10,  20));

}

}