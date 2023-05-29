public class StringExample {
    public static void main(String[] args) {
        greet("Hello Guys");
        greeting();
    }
    static String greeting(){
        String greeting = "How are you ?";
        System.out.println(greeting);
        return greeting;
    }

    static void greet(String a){
        String greeting = a;
        System.out.println(greeting);
    }
}
