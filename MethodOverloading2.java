class MethodOverloading2 {
    double area(double r){
        return 3.14 *r * r;
}
    double area(double l, double b) {
        return l * b ;       
}

public static void main(String[] args) {
    MethodOverloading2  m = new MethodOverloading2();
    System.out.println(m.area(6));
    System.out.println(m.area(5,5));
}
}