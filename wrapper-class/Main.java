public class Main {
    public static void main(String[] args) {
        
        // wrapper class = provides a way to useprimitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.ArrayList)

        // primitive     // wrapper
        //----------     // -------
        // boolean       Boolean
        // char          Character
        // int           Integer
        // double        Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing . Automatic conversion of wrapper class to primitive

        Boolean a = true; 
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // primitive to wrapper
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}