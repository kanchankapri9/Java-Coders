// Compiletime polymorphism 
class Calculator {
    static int add(int a, int b) {
        return a+b;
    }

    static double add(double a, double b)  {
        return a+b;
    }

}


// Run time polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
public class PolymorphysmEx {
    public static void main(String[] args) {
        //Compile time
        System.out.println("Compile time polymorphism :: ");
        System.out.println(Calculator.add(5,10));
        System.out.println(Calculator.add(5.5,10.5));

        // run time
        System.out.println("Run-time polymorphism :: ");
        Animal myAnimal = new Dog();
        myAnimal.sound(); 

    }
}

