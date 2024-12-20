import java.util.Scanner; // # import java Scanner

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create scanner
    
        System.out.println("What is your name? "); 
        String name = scanner.nextLine(); // input name
        System.out.println("How old are you? ");
        int age = scanner.nextInt();     // input age
        scanner.nextLine();   // 清除緩衝區中的換行符 / Clearing the newline character from the buffer.
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();   // input food
        
        /* show input data*/
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You like " + food);
    }
}