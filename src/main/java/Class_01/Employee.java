package Class_01;

public class Employee {
    // 1. Define the static method OUTSIDE of the main method
    public static int EmployeeMethod() {
        int b = 10;
        return b;
    }
    public static void main(String[] args) {
        int a= -10;
        System.out.println("this is the first program and output of a is: "+ a);
        // 2. Call the method using ClassName.methodName()
        int result = Employee.EmployeeMethod();
        System.out.println("Value returned from method: " + result);
        Student object = new Student();
        object.dummyMethod();

}
}
