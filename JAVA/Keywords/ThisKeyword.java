class ThisKeyword {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Swetha");
        s1.display();
    }
}