class A{
    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    @Override  //<--- good practice because it will check if the method is overridden or not, sometime we forget to override the method or type the method name wrong
    public void display(){
        System.out.println("Class B");
    }
}

public class annotate {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
