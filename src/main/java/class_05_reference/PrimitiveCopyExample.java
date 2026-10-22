package class_05_reference;

public class PrimitiveCopyExample {
    public static void main(String[] args) {
        // The original primitive value stored directly in main's stack frame
        int originalValue = 50;

        System.out.println("--- INSIDE MAIN ---");
        System.out.println("Original Value Address Proxy (Hash): " + System.identityHashCode(originalValue));
        System.out.println("Original Value: " + originalValue); // Outputs 50

        // Call the method, passing the value (50) as an argument
        modifyPrimitiveValue(originalValue);

        System.out.println("\n--- BACK IN MAIN ---");
        System.out.println("Original Value remains completely unchanged: " + originalValue); // Outputs 50
    }

    private static void modifyPrimitiveValue(int copiedParameter) {
        System.out.println("\n--- INSIDE MODIFY METHOD ---");

        // This hash code will be DIFFERENT because a new Integer object wrapper is created on the heap for this parameter
        System.out.println("Parameter Address Proxy (Hash): " + System.identityHashCode(copiedParameter));
        System.out.println("Value received by parameter: " + copiedParameter); // Outputs 50

        // Modifying the copied value
        copiedParameter = 999;
        System.out.println("Parameter value changed inside method to: " + copiedParameter);// Outputs 999
        System.out.println("Parameter Address Proxy (Hash): " + System.identityHashCode(copiedParameter));
    }
}
