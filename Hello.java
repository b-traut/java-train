public class Hello{
    public static void main(String[] args){

        System.out.println("Say your name.");
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("Say your age.");
        int age = new java.util.Scanner(System.in).nextInt();

        System.out.println(
            "Hello, " + name + "-san whose age is " + age + "."
        );

    }
}