
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
// class A{

//     public void display(){
//         System.out.println("Class A");
//     }
// }

// class B extends A{

//     public void display(){
//         System.out.println("Class B");
//     }

//     public void display2(){
//         System.out.println("Class B 2");
//     }
// }

// class C extends A{
//     public void display(){
//         System.out.println("Class C");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.display();
//         obj = new B();
//         obj.display();
//         obj = new C();
//         obj.display();

//         // jadi obj itu bergeser addresnya ke object baru di heap --> dynamic method dispatch
//     }
// }

//final class and final method

// class A{
//     public final void display(){
//         System.out.println("Class A");
//     }
// }

// class B extends A{
//     public void display(){   //<--- cant everide because it is final method
//         System.out.println("Class B");
//     }
// }   


// final class A{
//     public void display(){
//         System.out.println("Class A");
//     }
// }

// class B extends A{ //<--- cant extend because it is final class


//upcasting and downcasting

// class A{
//     public void display1(){
//         System.out.println("Class A");
//     }
// }

// class B extends A{
//     public void display2(){
//         System.out.println("Class B");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         A obj = (A) new B();  //<<-- ARTINYA OBJECTNYA DI B --> DI UPCASTING KE A
//         obj.display1();
//         ((B) obj).display2(); //<<-- ARTINYA OBJECTNYA DI A --> DI DOWNCASTING KE B

//         A obj2 = new B();//<<-- ARTINYA OBJECTNYA DI B --> DI UPCASTING KE A
//         obj2.display1();
//         // obj2.display2(); //<<-- ERROR KARENA OBJ2 ITU TYPE A, JADI TIDAK BISA MENGGUNAKAN METHOD DARI B
//         ((B) obj2).display2(); //<<-- ARTINYA OBJECTNYA DI A --> DI DOWNCASTING KE B

//         B obj3 = (B) obj2; //<<-- ARTINYA OBJECTNYA DI A --> DI DOWNCASTING KE B
//         obj3.display2();  // <-- BISA PAKE METHOD DARI A DAB B , KARENA B EXTERDEND A
//         //DIATAS ADALAH UPCASTING


//     }
// }


//beda cerita jika methodnya di override
// A obj2 = new B();//<<-- ARTINYA OBJECTNYA DI B --> DI UPCASTING KE A
// obj2.display();
// // obj2.display(); obj2 yang type A, jadi yang di override adalah method di A

// class A{
//     public void display(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     public void display(){ //<------------ini everride display method a 
//         System.out.println("Class B");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         B obj = new B(); // walaupun di sini di upcasting ke A, tapi yang di override adalah method di B
//         obj.display();
//     }
// }


//abstract class  --> abstract method yang cuma di define methodnya, jadi nnti childnya yang implementasi, tetapi jika methodnya 
//jadi abstract, classnya perlu di declare abstract

//dan pada child classnya perlu implement method yag di abstract, kalau tidak akan error

// abstract class A{
//     public abstract void display();
// }

// class B extends A{
//     public void display(){
//         System.out.println("Class B");
//     }
// }


// class oop{
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.display();
//     }
// }


//inner class

// class A{
//     int a = 10;

//     public void display(){
//         System.out.println("Class A");
//     }

//     class B{
//         public void display2(){
//             System.out.println(a);
//             System.out.println("Class B");
//         }
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.display();
//         A.B obj2 = obj.new B();
//         obj2.display2();
//     }
// }


//static inner class
// class A{
//     static int a = 10;
//     int b = 20;

//     public void display(){
//         System.out.println("Class A");
//         System.out.println(b);
//     }

//     static class B{
//         public void display2(){
//             System.out.println(A.a); //<<--- JADI KLAU CLASSNYA STATTIS, APAKAUN VARIABEL YANG DI ACCESS HARUS STATIC, KARENA MEMENGARUHI SEMUA OBJECT
//             System.out.println("Class B");
//         }
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.display();
//         A.B obj2 = new A.B();
//         obj2.display2();

//         A.B obj3 = new A.B();
//         // obj3.a = 50; // Jika a dideklarasikan static di A (seperti di file kamu): akses yang benar adalah A.a = 50;. Mengakses a lewat instance (obj3.a) akan kompilasi tetap boleh tapi tidak disarankan; lebih jelas pakai A.a = 50;.
//         A.a = 30;
//         // A.b = 40; //Jika a dideklarasikan static di A (seperti di file kamu): akses yang benar adalah A.a = 50;. Mengakses a lewat instance (obj3.a) akan kompilasi tetap boleh tapi tidak disarankan; lebih jelas pakai A.a = 50;.
//         obj3.display2();
//     }
// }


// annonymous inner class

// class A{
//     public void display(){
//         System.out.println("Class A");
//     }
// }
// class oop{
//     public static void main(String[] args) {
//         A obj = new A(){
//             public void display(){
//                 System.out.println("Class B");
//             }
//         };
//         obj.display();
//     }
// }

// abstract to interface 

// abstract class A {
//     public abstract void display();
//     public abstract void display2();
// } 

// class B extends A{
//     public void display(){
//         System.out.println("Class B");
//     }
//     public void display2(){
//         System.out.println("Class B 2");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.display();
//         obj.display2();
//     }
// }

// --> daripada menggunakan abstract class kita bisa menggunaka interface

// interface A{
//     void display(); //<--- tidak perlu membuatnya public karena apapun interface itu public 
//     void display2();
// }

// class B implements A{
//     public void display(){
//         System.out.println("Class B");
//     }
//     public void display2(){
//         System.out.println("Class B 2");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.display();
//         obj.display2();
//     }
// }


// why use interface

// interface Computer{
//     void code();
// }

// class Laptop implements Computer{
//     public void code(){
//         System.out.println("I am coding on Laptop");
//     }
// }

// class Desktop implements Computer{
//     public void code(){
//         System.out.println("I am coding on Desktop");
//     }
// }

// class Developer{
//     public void devCode(Computer comp){
//         comp.code();
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         Developer dev = new Developer();
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
//         dev.devCode(lap);
//         dev.devCode(desk);
//     }
// }

// class - class -> extends
// class - interface --> implements
// interface - interface --> extends

// interface A{
//     void display();
//     void display2();
// }

// interface B{
//     void display3();
// }

// interface C extends B{ //<<----- ini prarentnya b , aritnya interface c mewarisi method display 3 dari b
// }


// class contoh implements A,C {

//     public void display(){
//         System.out.println("in interface A");
//     }
//     public void display2(){
//         System.out.println("in interface A");
//     }
//     public void display3(){
//         System.out.println("in interface B from C");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         contoh obj = new contoh();
//         obj.display();
//         obj.display2();
//         obj.display3();
//     }
// }

// interface variable is final and static

// interface Config {
//     int MAX = 100; // implicit public static final
// }

// class App implements Config {
//     void show() {
//         System.out.println(Config.MAX); // 100
//     }
// }

// class App2 implements Config {
//     void show() {
//         // Config.MAX = 200;  //<---- tidak bisa diubah karena final
//         System.out.println(Config.MAX); // 100
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         App obj = new App();
//         obj.show();
//         App2 obj2 = new App2();
//         obj2.show();
//     }
// }