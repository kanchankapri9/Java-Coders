class Employee {
    String name = "Kanchan";
    int salary = 30000000;
}

class Manager extends Employee {
    String dept = "IT";

    void show() {
        System.out.println(name + " " + salary + " " + dept);
    }
}

public class InheriteEx {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.show();
    }
}
