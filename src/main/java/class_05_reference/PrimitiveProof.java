package class_05_reference;

public class PrimitiveProof {
    public static void main(String[] args) {
        // SUMMARY OF HOW PRIMITIVE MEMORY WORKS IN JAVA:
        // ---------------------------------------------------------------------
        // 1. Primitive variables (like 'int') store their raw values directly
        //    on the STACK memory, not references or addresses.
        //
        // 2. Java is strictly PASS-BY-VALUE. When you pass 'a' into change(a),
        //    Java duplicates the literal value (10) into a brand-new stack
        //    slot for parameter 'x'. They are completely disconnected.
        //
        // 3. Why did the hash code change? Primitives do not have addresses.
        //    System.identityHashCode() forces Java to temporarily create an
        //    OBJECT on the HEAP to represent the number (Autoboxing).
        //    - Hash 1 represents an object holding the number 10.
        //    - Hash 2 represents a totally separate object holding 999.
        // ---------------------------------------------------------------------
        int a = 10;

        System.out.println("Main - Variable 'a' value: " + a);
        System.out.println("Main - Variable 'a' Hash:  " + System.identityHashCode(a));

        // Pass 'a' into the change method
        change(a);

        System.out.println("\nBack in Main - 'a' is still: " + a);
    }

    public static void change(int x) {
        // Change the parameter value inside the method
        x = 999;

        System.out.println("\nInside change() - 'x' value changed to: " + x);
        System.out.println("Inside change() - 'x' New Hash:        " + System.identityHashCode(x));
    }
}
