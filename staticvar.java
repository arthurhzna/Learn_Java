// class test {
//     //static variable
//     // static int a = 10 //ini langsung diinisialisasi
//     static int a;
//     int b = 20;

//     //static block
//     static{
//         a = 30;
//         System.out.println("static block");
//     }

//     public test() {
//         System.out.println("constructor");
//     }

//     void display() {
//         System.out.println("a is " + a + " and b is " + b);
//     }

//     public static void display2() {
//         // static method can only access static variables jadi yang diprint hanya static variable a
//         System.out.println(a);
//     }

//     public static void display3(test obj) {
//         // jika ingin mengakses non static variable maka harus membuat objek dari class tersebut
//         System.out.println("a is " + obj.a + " and b is " + obj.b);
//     }
// }


// public class staticvar {
//     public static void main(String[] args) {
//         test sv = new test();
//         sv.a = 20;
//         sv.b = 30;
//         // sv.display();

//         test sv2 = new test();
//         // sv2.b = 40;
//         // sv2.display();

//         sv.a = 30;
//         // sv.display();
//         // sv2.display();

//         // test.display2();

//         // test.display3(sv);
//         // test.display3(sv2);
//     }
// }


