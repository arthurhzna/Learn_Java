// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;


//buffered reader
// public class input {
//     public static void main(String[] args) {
//         BufferedReader reader = null;
//         try {
//             reader = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your name: ");
//         String name = reader.readLine();
//         System.out.println("Hello, " + name + "!");
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         } finally {
//             try {
//                 reader.close();
//             } catch (IOException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

import java.util.Scanner;
//scanner
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

