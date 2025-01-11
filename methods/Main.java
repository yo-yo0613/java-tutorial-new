public class Main {

    public static void main(String[] args) {
        
        // method = a block of code that is executed whenever it is called upon

        String name = "Bro";
        int age = 21;
        hello(name,age);
        
        int x = 3;
        int y = 4;

        int z = add(x, y);

        System.out.println(z);
    }

    static void hello(String title, int age){
        System.out.println("Hello " + title);
        System.out.println("You are " + age + " years old.");
    }

    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}