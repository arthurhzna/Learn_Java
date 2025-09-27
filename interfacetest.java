// // @FunctionalInterface
// // interface A{
// //     void display();
// //     // void display2();<--- it will give error because it is a functional interface, it can only have one abstract method
// // }

// // class B implements A{
// //     public void display(){
// //         System.out.println("Class B");
// //     }
// // }

// // public class interfacetest {
// //     public static void main(String[] args) {
// //         B obj = new B();
// //         obj.display();
// //     }   
// // }


// @FunctionalInterface
// interface A{
//     // void display();
//     // void display2();<--- it will give error because it is a functional interface, it can only have one abstract method
//     void display(int i); //<-- jika ingin pakai argument
// }


// // public class interfacetest {
// //     public static void main(String[] args) {
// //         A obj = new A(){ //
// //             public void display(){ //<-- INIKAN MIRIP ABSTRACT CLASS ,ANNOYMOUS CLASS
// //                 System.out.println("Class A");
// //             }
// //         };
// //         obj.display();

// //     }   
// // }

// //Lambda Expression

// public class interfacetest {
//     public static void main(String[] args) {
//         // A obj = () -> System.out.println("Class A"); //<-- Lambda Expression, OBJECT BERNAMA OBJ
//         // obj.display();

//         A obj = (int i) -> System.out.println("Class A" + i); //<-- Lambda Expression, OBJECT BERNAMA OBJ
//         obj.display(5);
//     }
// }   




