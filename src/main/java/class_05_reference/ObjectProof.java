package class_05_reference;

public class ObjectProof {
    public static void main(String[] args) {
        // SUMMARY OF HOW OBJECT REFERENCE MEMORY WORKS IN JAVA:
        // ---------------------------------------------------------------------
        // 1. Two separate stack slots ARE created (one in main, one in modify).
        //    Java does not violate its stack rules for objects.
        //
        // 2. Because Java copies the "value" of the slot, it copies the
        //    REFERENCE ADDRESS. Now, both separate stack slots contain the
        //    exact same memory address pointing to the same Heap object.
        //
        // 3. System.identityHashCode() prints the hash of the target Heap object.
        //    Since both variables point to the same object, their printed
        //    hashes will match perfectly.
        // ---------------------------------------------------------------------

        Student stuobj1 = new Student(); // Stack slot 1: Holds Address (e.g., @001)
        stuobj1.stuId = 30;

        System.out.println("Main - Reference Hash: " + System.identityHashCode(stuobj1));

        modify(stuobj1); // Java copies the address (@001) into the method parameter

        System.out.println("Back in Main - Object Value changed to: " + stuobj1.stuId); // Prints 10
    }

    private static void modify(Student student) { // Stack slot 2: Holds duplicate Address (@001)
        System.out.println("Method - Reference Hash: " + System.identityHashCode(student)); // Matches main!

        student.stuId = 10; // Accesses the shared Heap address and modifies the data
        System.out.println("Method - Reference Hash: " + System.identityHashCode(student));
    }
}

/*
A Simple Analogy: House Keys

Think of an object on the Heap as a physical house.
• The variable stuobj1 in main is a key to that house (stored in main's stack slot).
• When you call modify(stuobj1), Java creates a brand new stack slot for the parameter student.
 It duplicates the value inside main's slot—meaning it makes a copy of the key.
• Now you have two separate keys in two separate pockets (two stack slots).
But because both keys open the exact same house, if the method uses its key to go inside and repaint the walls (student.stuId = 10;)
you will see the new paint job when you look inside the house later using your original key in main.
*/
