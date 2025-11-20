class Student {
    String Name ;           // a class with its properties  // we have defined a simple Bluprint and its properties.
    int Age;
    String Course;
    int RollNo;

    void displayInfo() {
        System.out.println("Name :" + Name + ", Age :" + Age + ", Course :" + Course + ", RollNo :" + RollNo);
    }
}


public class StudentInfo {
    public static void main(String[] args) {
        Student s = new Student();
        s.Name = "kanchan";
        s.Age = 19;
        s.Course = "Bcadsai";

        Student s2 = new Student();
        s2.Name = "Junaid";
        s2.Age = 21;
        s2.Course = "Bcadsai";

        s.displayInfo();  // calling the method we have made in the class student
        s2.displayInfo();
    }
}
