class Student {   // define a class
    String name;   
    int age;                           // these are the fields properties of status of the class student
    boolean isOn;

    void Mood() {
        name = "Kanchan";
        isOn = true;
        System.out.println("Kanchan is in light mood");
    }
}

    //main class
    public class ObjectEx {
        public static void main(String[] args) {
            
            Student myName = new Student();

            //call the methods of the object
            myName.Mood();
        }
    }
