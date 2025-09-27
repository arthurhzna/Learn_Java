
// // class calculator{

// //     // int a;
// //     // int b;

// //     public int add(int a, int b){
// //         return a + b;
// //     }
// //     public int subtract(int a, int b){
// //         return a - b;
// //     }
// //     public int multiply(int a, int b){
// //         return a * b;
// //     }
// //     public int divide(int a, int b){
// //         return a / b;
// //     }

// //     void display(){
// //         System.out.println("Hello, calculator!");
// //     }
// // }


// // public class oop {
// //     public static void main(String[] args) {
// //         System.out.println("Hello, World!");

// //         calculator calc = new calculator();
// //         System.out.println(calc.add(10, 20));
// //         System.out.println(calc.subtract(10, 20));
// //         System.out.println(calc.multiply(10, 20));
// //         System.out.println(calc.divide(10, 20));
// //         calc.display();

// //     }
// // }


// // //encapsulation
// // class Human{
// //     private int age;
// //     private String name;

// //     public int getAge(){
// //         return age;
// //     }
// //     public String getName(){
// //         return name;
// //     }
// //     public void setAge(int age){
// //         this.age = age;
// //     }
// //     public void setName(String name){
// //         this.name = name;
// //     }
// // }

// // public class oop {
// //     public static void main(String[] args) {
// //         Human human = new Human();
// //         human.setAge(20);
// //         human.setName("John");
// //         System.out.println(human.getAge());
// //         System.out.println(human.getName());
// //     }
// // }


// //constructor

// // class Human{
// //     private int age;
// //     private String name;

// //     public Human(int age, String name){
// //         this.age = age;
// //         this.name = name;
// //     }

// //     public Human(){
// //         age = 0;
// //         name = "Unknown";
// //     }

// //     public int getAge(){
// //         return age;
// //     }
// //     public String getName(){
// //         return name;
// //     }
// //     public void setAge(int age){
// // }
// // }

// // public class oop {
// //     public static void main(String[] args) {
// //         Human human = new Human(20, "John");
// //         System.out.println(human.getAge());
// //         System.out.println(human.getName());
// //     }
// // }



// class Human{
//     private int age;
//     private String name;

//     // public Human(int age, String name){
//     //     this.age = age;
//     //     this.name = name;
//     // }

//     public Human(){
//         age = 22;
//         name = "John";
//     }

//     public int getAge(){
//         return age;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setAge(int age){
// }
// }

// public class oop {
//     public static void main(String[] args) {
//         Human human = new Human();
//         System.out.println(human.getAge());
//         System.out.println(human.getName());
//     }
// }


//inheritance
// class Calculator{

//     public int add(int a, int b){
//         return a + b;
//     }
//     public int subtract(int a, int b){
//         return a - b;
//     }
//     public int multiply(int a, int b){
//         return a * b;
//     }
// }

// class AdvancedCalculator extends Calculator{

//     public int divide(int a, int b){
//         return a / b;
//     }

// }

// public class oop {
//     public static void main(String[] args) {

//         AdvancedCalculator benda = new AdvancedCalculator();
//         System.out.println(benda.add(10, 20));
//         System.out.println(benda.subtract(10, 20));
//         System.out.println(benda.multiply(10, 20));
//         System.out.println(benda.divide(10, 20));
//     }
// }


//multi inheritance

// class Calculator{

//     public int add(int a, int b){
//         return a + b;
//     }
//     public int subtract(int a, int b){
//         return a - b;
//     }
//     public int multiply(int a, int b){
//         return a * b;
//     }
// }

// class AdvancedCalculator extends Calculator{

//     public int divide(int a, int b){
//         return a / b;
//     }

// }

// class expercalculator extends AdvancedCalculator{
//     public int power(int a, int b){
//         return (int) Math.pow(a, b);
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         expercalculator benda = new expercalculator();
//         System.out.println(benda.add(10, 20));
//         System.out.println(benda.subtract(10, 20));
//         System.out.println(benda.multiply(10, 20));
//         System.out.println(benda.divide(10, 20));
//         System.out.println(benda.power(10, 20));
//     }
// }


//super

// class student{
//     private int id;
//     private String name;

//     public student(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public int getId(){
//         return id;
//     }

//     public String getName(){
//         return name;
//     }

// }

// class experstudent extends student{

//     public experstudent(){
//         super(2, "ewewew");
//     }

//     public experstudent(int id, String name){
//         super(id, name);
//     }

//     public String getNamefromchild(){
//         return getName();
//     }
// }

// public class oop {
//     public static void main(String[] args) {
//         experstudent benda = new experstudent(1, "John");
//         System.out.println(benda.getId());
//         System.out.println(benda.getName());
//         System.out.println(benda.getNamefromchild());

//         experstudent benda2 = new experstudent();
//         System.out.println(benda2.getId());
//         System.out.println(benda2.getName());
//         System.out.println(benda2.getNamefromchild());
//     }
// }   


//super and child class constructor call with this() and super()

// class student{
//     private int id;
//     private String name;

//     public student(int id, String name){
//         this.id = id;
//         this.name = name;
//         System.out.println("parent constructor");
//     }

//     public int getId(){
//         return id;
//     }

//     public String getName(){
//         return name;
//     }

// }

// class experstudent extends student{

//     public experstudent(){
//         super(2, "ewewew");
//         System.out.println("child constructor");
//     }

//     public experstudent(int id, String name){
//         this();   //---> call public experstudent(){
//         System.out.println("child constructor with parameters");
//     }

//     public String getNamefromchild(){
//         return getName();
//     }
// }

// public class oop {
//     public static void main(String[] args) {
//         experstudent benda = new experstudent(1, "John");
//         System.out.println(benda.getId());
//         System.out.println(benda.getName());
//         System.out.println(benda.getNamefromchild());

//     }
// }   

//overide method parent class

// class student {
//     private int id;
//     private String name;

//     public student(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public String getidname(){
//         return id + " " + name;
//     }

//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
// }

// class experstudent extends student{ 
//     public experstudent(int id, String name){
//         super(id, name);
//     }

//     public String getidname(){
//         return getId() + " " + getName() + " " + super.getidname() + " overide";
//     }

// }

// public class oop {
//     public static void main(String[] args) {
//         experstudent benda = new experstudent(1, "John");
//         System.out.println(benda.getidname());
//     }
// }


//polymorphism  -- dynamic method dispatch
class A{

    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{

    public void display(){
        System.out.println("Class B");
    }

    public void display2(){
        System.out.println("Class B 2");
    }
}

class C extends A{
    public void display(){
        System.out.println("Class C");
    }
}

class oop{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
        obj = new B();
        obj.display();
        obj = new C();
        obj.display();

        // jadi obj itu bergeser addresnya ke object baru di heap --> dynamic method dispatch
    }
}

