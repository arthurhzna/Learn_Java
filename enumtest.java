// enum Status{ //<<--- ini adalah enum, enum adalah sebuah class yang hanya memiliki constant value
//     RUNNING, STOPPED, FAILED, COMPLETED //<-- ini adalah object dari enum Status, jadi ada 4 object yaitu RUNNING, STOPPED, FAILED, COMPLETED
// }


// public class enumtest {
//     public static void main(String[] args) {
//         Status s = Status.RUNNING;
//         System.out.println(s); //<<--- ini akan menampilkan RUNNING
//         System.out.println(s.ordinal()); //<<--- ini akan menampilkan index dari object RUNNING
//         System.out.println(Status.valueOf("RUNNING")); //<<--- ini akan menampilkan object RUNNING

//         System.out.println("--------------------------------");

//         Status[] statuses = Status.values(); //<<--- ini akan menampilkan semua object dari enum Status
//         for (Status status : statuses) {
//             System.out.println(status);
//         }

//         System.out.println("--------------------------------");

//         if (s == Status.RUNNING) {
//             System.out.println("Running");
//         } else if (s == Status.STOPPED) {
//             System.out.println("Stopped");
//         } else if (s == Status.FAILED) {
//             System.out.println("Failed");
//         } else if (s == Status.COMPLETED) {
//             System.out.println("Completed");
//         }

//         System.out.println("--------------------------------");

//         switch (s) {
//             case RUNNING:
//                 System.out.println("Running");
//                 break;
//             case STOPPED:
//                 System.out.println("Stopped");
//                 break;
//             case FAILED:
//                 System.out.println("Failed");
//                 break;
//             case COMPLETED:
//                 System.out.println("Completed");
//                 break;
//         }
//     }
// }

//Enum Class in Java

// enum laptop {
//     HP(20), DELL(30), ASUS(40), LENOVO(50); // <-- ini object, jadi otomatis eksekusi constructor, enum laptop 

//     private int price;

//     laptop(int price){  // <-- ini constructor, jadi otomatis eksekusi constructor, enum laptop 
//         this.price = price;
//     }

//     public int getPrice(){
//         return price;
//     }
// }

// public class enumtest {
//     public static void main(String[] args) {
//         laptop A = laptop.HP; // <-- ini object, jadi otomatis eksekusi constructor, enum laptop memiliki object HP, DELL, ASUS, LENOVO
//         System.out.println(A + " " + A.getPrice());

//         System.out.println("--------------------------------");

//         for (laptop l : laptop.values()) {
//             System.out.println(l + " " + l.getPrice());
//         }

// HP 20
// DELL 30
// ASUS 40
// LENOVO 50
//     }
// }

enum laptop2 {
    HP, DELL, ASUS, LENOVO; 

    private int price;

    private laptop2() {
        price = 200;
        System.out.println("Laptop " + this + " created with price " + price);
    }
    private laptop2(int price) {
        this.price = price;
        System.out.println("Laptop " + this + " created with price " + price);
    }

    public int getPrice(){
        return price;
    }
}

public class enumtest {
    public static void main(String[] args) {
        laptop2 A = laptop2.HP;
        System.out.println(A + " " + A.getPrice());
        // Laptop HP created with price 200
        // Laptop DELL created with price 200
        // Laptop ASUS created with price 200
        // Laptop LENOVO created with price 200
    }
}
