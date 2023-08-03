package Book2.chapter1;

public class HelloApp3 {
    public static String helloMessage = "Hi"; // error -- should use static keyword
    public static void main(String[] args) {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage); // will not compile
    }
    // cannot use instance variables in static methods unless first create an instance.
// String helloMessage; // error -- should use static keyword
//    public static void main(String[] args) {
//        helloMessage = "Hello, World!";
//        System.out.println(helloMessage); // will not compile
//    }
//     static String helloMessage = "Hi"; // error -- should use static keyword
//    public static void main(String[] args) {
//        //create an instance first before using instance variable of the class
//        HelloApp ha = new HelloApp();
//        helloMessage = "Hello, World!";
//        System.out.println(helloMessage);
//    }
}
