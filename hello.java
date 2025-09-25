class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // int number = 10;
        // number = 20;
        // System.out.println (number);

        // int num1 = 10;
        // byte by = 123;
        // short sh = 12345;
        // long lo = 1234567890;
        // float fl = 123.45f;
        // double db = 123.4567890;
        // char ch = 'A';
        // boolean bo = true;
        // String str = "Hello, World!";

        // int binary = 0b1010;
        // System.out.println(binary);

        // // type conversion and casting
        // int num2 = (int) 123.45;
        // System.out.println(num2);

        // int num3 = (int) 123.45;
        // int result = num1 + num2;
        // System.out.println(result);
        // int result2 = num1 * num3;
        // System.out.println(result2);
        // int result3 = num1 * num3;
        // System.out.println(result3);
        // int result4 = num1 / num3;
        // System.out.println(result4);
        // int result5 = num1 % num3;
        // System.out.println(result5);
        int x = 6;
        int y = 7;

        // System.out.println(x == y);
        // System.out.println(x != y);
        // System.out.println(x > y);
        // System.out.println(x < y);
        // System.out.println(x >= y);
        // System.out.println(x <= y);
        // System.out.println(x == y);
        // System.out.println(x != y);
        // System.out.println(x > y);

        int a = 10;
        int b = 20;

        // System.out.println(a == b && a < b);
        // System.out.println(a == b || a < b);
        // System.out.println(a == b && a > b);
        // System.out.println(a == b || a > b);
        // System.out.println(a == b && a >= b);
        // System.out.println(a == b || a >= b);
        // System.out.println(a == b && a <= b);
        // System.out.println(a == b || a <= b);

        if(a == b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("a is not equal to b");
        }
        b = 10;

        if(a == b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("a is not equal to b");
        }

        String result = a == b ? "a is equal to b" : "a is not equal to b";
        System.out.println(result);

        int p = 10;

        switch(p){
            case 10:
                System.out.println("p is 10");
                break;
            default:
                System.out.println("p is not 10");
        }

        String name = "kamu";

        result = switch(name){
            case "John", "bang " ->  "be";
            case "kamu", "tu" -> "saya";
            default -> "unknown";
        };
        System.out.println(result);

        
        switch(name){
            case "John", "bang " ->  System.out.println("be");
            case "kamu", "tu" -> System.out.println("saya");
            default -> System.out.println("unknown");
        };

        switch(name){
            case "John", "bang " ->  result = "be";
            case "kamu", "tu" -> result = "saya";
            default -> result = "unknown";
        };
        System.out.println(result);
    }
}