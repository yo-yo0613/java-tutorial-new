public class Main {

    public static void main(String[] args) {
        
        // printf() = an optional method to control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.println("");
        System.out.printf("%c", myChar);
        System.out.println("");
        System.out.printf("%s", myString);
        System.out.println("");
        System.out.printf("%d", myInt);
        System.out.println("");
        System.out.printf("%f", myDouble);
        System.out.println("");

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %s \n", myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f \n", myDouble);

        // [flags]
        // adds an effect to output haesd on the flag added to format specifier
        // - : lewft-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f", myDouble);
    }
}