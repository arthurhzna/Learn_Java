
class calculator{

    // int a;
    // int b;

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }

    void display(){
        System.out.println("Hello, calculator!");
    }
}


public class oop {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        calculator calc = new calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.subtract(10, 20));
        System.out.println(calc.multiply(10, 20));
        System.out.println(calc.divide(10, 20));
        calc.display();
    }
}
