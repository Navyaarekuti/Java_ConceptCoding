package class_05_reference;

public class Student {
    int stuId;

    public int getstuId() {
        return stuId;
    }

    public void setstuId(int stuId) {
        this.stuId = stuId;
    }
}
    /*int stuId; // 1. This is the permanent Object Slot

    // 2. The parameter slot is now named 'incomingId'
    public void setstuId(int incomingId) {

        // NO 'this.' NEEDED!
        // Java clearly sees you want to take the value from 'incomingId'
        // and put it into 'stuId'.
        stuId = incomingId;

        public void setstuId(int stuId) {  // <-- Thing #1 (Parameter Slot)
    stuId = stuId;                  // <-- Which one is which?! confusion so this is needed
}
*/

