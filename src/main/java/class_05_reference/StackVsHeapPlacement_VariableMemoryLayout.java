package class_05_reference;

// The Blueprint Class containing our Instance Variable
class Example {
    // This primitive 'stuId' lives on the HEAP because it is an instance variable.
    // It is physically packed inside the Student object container.
    int stuId;
}

public class StackVsHeapPlacement_VariableMemoryLayout {
    public static void main(String[] args) {
        // SUMMARY OF PRIMITIVE LOCATIONS IN MEMORY:
        // ---------------------------------------------------------------------
        // 1. LOCAL PRIMITIVES: Declared inside methods. They live on the STACK.
        // 2. INSTANCE PRIMITIVES: Declared inside classes. They live on the HEAP.
        //
        // Analogy: Think of the Object as a Cardboard Box sitting in a warehouse (HEAP).
        // If you put a marble (primitive) inside that box, the marble is now in the
        // warehouse (HEAP) too! It doesn't get its own separate slot on the STACK.
        // ---------------------------------------------------------------------

        // 'stackPrimitive' lives entirely on the STACK because it is local to main().
        int stackPrimitive = 10;

        // 'stuobj1' is a pointer variable sitting on the STACK holding an address (e.g., @001).
        // 'new Student()' builds the actual physical object container out on the HEAP.
        Example stuobj1 = new Example();

        // The value 30 lands out on the HEAP, right inside that Student object block.
        stuobj1.stuId = 30;

        System.out.println("--- MEMORY LOCATION DEMO ---");
        System.out.println("1. Local Stack Primitive Value: " + stackPrimitive);
        System.out.println("2. Instance Heap Primitive Value: " + stuobj1.stuId);
        System.out.println("Object Location Identity Hash: " + System.identityHashCode(stuobj1));
    }
}

