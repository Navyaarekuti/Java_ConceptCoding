package class_05_reference;

public class Employee {
    public static void main(String[] args) {
        Student stuobj1 = new Student();
        stuobj1.stuId = 30;
        // FIX: Call the method on the object,
        System.out.println(stuobj1.getstuId());
        // FIX: Updating it to 20 using the proper method call syntax
        // (Assuming you added 'int stuId' as a parameter to the Student class)
        stuobj1.setstuId(20);
        System.out.println(stuobj1.getstuId());
        // Print the identity reference value for stuobj1 in main
        System.out.println("Main - stuobj1 reference ID: " + System.identityHashCode(stuobj1));
        modify(stuobj1);
        System.out.println(stuobj1.stuId);

    }
    private static void modify(Student student)
    { // Print the identity reference value for the received parameter
        System.out.println("Modify method - student reference ID: " + System.identityHashCode(student));
        student.stuId = 10;
    }
}
