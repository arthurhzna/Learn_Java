// class A extends Thread{

//     public void run(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread A");
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread B");
//         }
//     }
// }
// public class thread {
//     public static void main(String[] args) {
//         A obj = new A();
//         B obj2 = new B();
//         obj.start();
//         obj2.start();
//     }
    
// }


//runnable interface

// class A implements Runnable{
//     public void run(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread A");
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread B");
//         }
//     }
// }

// class thread{
//     public static void main(String[] args) {
//         // A obj = new A();
//         // B obj2 = new B();

//         // Thread t1 = new Thread(obj);
//         // Thread t2 = new Thread(obj2);
//         // t1.start();
//         // t2.start();

//         Runnable obj = new A();
//         Runnable obj2 = new B();

//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }


//anonymous class

// class a implements Runnable{
    // public void run(){
    //     for (int i = 0; i < 100; i++) {
    //         System.out.println("Thread A");
    //     }
    // }
// }
// class b implements Runnable{
//     public void run(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread B");
//         }
//     }
// }

// class thread{
//     public static void main(String[] args) {
//         Runnable obj = new Runnable() {
//             public void run(){
//                 for (int i = 0; i < 100; i++) {
//                     System.out.println("Thread A");
//                 }
//             }
//         };
//         Runnable obj2 = new b();
//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }   


//race condition

// class calculator {
//     int angka = 0;

//     public void increment(){
//         angka++;
//         System.out.println(angka);
//     }
    
// }

// class thread{
//     public static void main(String[] args) throws InterruptedException {


//         calculator c = new calculator();

//         Runnable obj1 = new Runnable() {
//             public void run(){
//                 for (int i = 0; i < 1000; i++) {
//                     System.out.println("Thread A");
//                     c.increment();
//                 }
//             }
//         };

//         Runnable obj2 = new Runnable() {
//             public void run(){
//                 for (int i = 0; i < 1000; i++) {
//                     System.out.println("Thread B");
//                     c.increment();
//                 }
                
//             }
//         };

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();

//         System.out.println("Final value 1: " + c.angka);
//         // Thread A
//         // 100
//         // Thread A
//         // 101

//         t1.join();
//         t2.join();

//         System.out.println("Final value 12: " + c.angka);

//     }
// }



class calculator {
    int angka = 0;

    public  synchronized void increment(){ //<-------- ini untuk mengatasi race condition
        angka++;
        System.out.println(angka);
    }
    
}

class thread{
    public static void main(String[] args) throws InterruptedException {


        calculator c = new calculator();

        Runnable obj1 = new Runnable() {
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Thread A");
                    c.increment();
                }
            }
        };

        Runnable obj2 = new Runnable() {
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Thread B");
                    c.increment();
                }
                
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        System.out.println("Final value 1: " + c.angka);
        // Thread A
        // 100
        // Thread A
        // 101

        t1.join();
        t2.join();

        System.out.println("Final value 12: " + c.angka);

    }
}