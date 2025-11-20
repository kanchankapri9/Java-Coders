class calc {
    int add(int a, int b, int c) {   // 3 arguments
        return a+b+c;
    }

    int Subtract(int a , int b) {     // 2 arguments
        return a-b;    
    }

    void multiply(){            // defalut method
        System.out.println("empty Multiply called " );
    }

    static void divide() {         // static method
        System.out.println("this is static division statement ");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

       calc c = new calc();

      // Calling add() method with 3 arguments
        System.out.println("Addition of 3 numbers = " + c.add(3, 3, 5));

        // Calling overloaded Sub() method with 2 arguments
        System.out.println("Sub of 2 numbers = " + c.Subtract(10, 20));


        // Calling multiply method
        c.multiply();

        // Calling static divide method
        calc.divide();
    }
}