// import java.util.Random;

// class Student {

//     int id;
//     String name;
//     int age;
// }

// public class array {

//     public static void main(String[] args) {
//         // int[] numbers = {1, 2, 3, 4, 5};
//         // for (int i = 0; i < numbers.length; i++) {
//         //     System.out.println(numbers[i]);
//         // }

//         // int[] numbers2 = new int[5];
//         // numbers2[0] = 1;
//         // numbers2[1] = 2;
//         // numbers2[2] = 3;
//         // numbers2[3] = 4;
//         // numbers2[4] = 5;
//         // for (int i = 0; i < numbers2.length; i++) {
//         //     System.out.println(numbers2[i]);
//         // }

//         // int numbers3[][]= new int[2][3];
//         // numbers3[0][0] = 1;
//         // numbers3[0][1] = 2;
//         // numbers3[0][2] = 3;
//         // numbers3[1][0] = 4;
//         // numbers3[1][1] = 5;
//         // numbers3[1][2] = 6;
//         // for (int i = 0; i < numbers3.length; i++) {
//         //     for (int j = 0; j < numbers3[i].length; j++) {
//         //         System.out.println(numbers3[i][j]);
//         //     }
//         // }
//         // for (int n[] : numbers3) {
//         //     for (int m : n) {
//         //         System.out.println(m);
//         //     }
//         // }

//         //jagged array

//         // int numbers4[][] = new int[2][];
//         // numbers4[0] = new int[3];
//         // numbers4[1] = new int[2];

//         // for (int i = 0; i < numbers4.length; i++) {  //baris
//         //     for (int j = 0; j < numbers4[i].length; j++) { //kolom
//         //         Random random = new Random();
//         //         numbers4[i][j] = random.nextInt(100);
//         //     }
//         // }

//         // for (int n[] : numbers4) {
//         //     for (int m : n) {
//         //         System.out.print(m + " "); // Cetak elemen dalam satu baris dengan spasi
//         //     }
//         //     System.out.println(); // Pindah ke baris baru setelah satu baris selesai dicetak
//         // }

//         // int nums[][][] = new int[2][3][4];
//         // for (int i = 0; i < nums.length; i++) {
//         //     for (int j = 0; j < nums[i].length; j++) {
//         //         for (int k = 0; k < nums[i][j].length; k++) {
//         //             System.out.println(nums[i][j][k]);
//         //         }
//         //     }
//         // }   
//         // Student student[] = new Student[3];
//         // student[0] = new Student();
//         // student[0].id = 1;
//         // student[0].name = "John";
//         // student[0].age = 20;
//         // student[1] = new Student();
//         // student[1].id = 2;
//         // student[1].name = "Jane";
//         // student[1].age = 21;
//         // student[2] = new Student();
//         // student[2].id = 3;
//         // student[2].name = "Jim";
//         // student[2].age = 22;

//         // Student students[] = new Student[3];
//         // students[0] = student[0];
//         // students[1] = student[1];
//         // students[2] = student[2];

//         // for (int i = 0; i < students.length; i++) {
//         //     System.out.println(students[i].id + " " + students[i].name + " " + students[i].age);
//         // }


//         // //enhanced for loop
//         // for (Student s : students) {
//         //     System.out.println(s.id + " " + s.name + " " + s.age);
//         // }

//         // //stirng object
//         // String name = new String("John");
//         // System.out.println(name);

//         // //immutable string
//         // String name2 = "John";
//         // System.out.println(name2);
//         // //new object string in heap
//         // name2 = name2 + " Doe";
//         // System.out.println(name2);

//         //mutable string
//         StringBuilder sb = new StringBuilder("John");
//         System.out.println(sb);
//         System.out.println(sb.capacity());
//         System.out.println(sb.length());
//         sb.append(" Doe");
//         System.out.println(sb);
//         sb.insert(0, "Mr. ");
//         System.out.println(sb);
//         sb.delete(0, 3);
//         System.out.println(sb);

//     }
// }
