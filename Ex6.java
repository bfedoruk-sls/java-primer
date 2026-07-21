public class Ex6 {
    
    static class Student {
        // Fields: the data each Student carries. 
        private String name;
        private int credits;

        // Constructor: builds a new Student. 
        public Student(String studentName) {
            this.name = studentName;
            this.credits = 0;
        }

        public void completeCourse(int creditValue) {
            credits = credits + creditValue;
        }

        public boolean canGraduate() {
            return credits >= 120;
        }

        public void printRecord() {
            System.out.println(name + " has " + credits + " credits.");
        }
    }

    public static void main(String[] args) {
        Student first = new Student("Amira");
        Student second = new Student("Devon");

        first.completeCourse(30);
        first.completeCourse(90);
        second.completeCourse(15);

        first.printRecord();
        second.printRecord();

        System.out.println("Can Amira graduate? " + first.canGraduate());
        System.out.println("Can Devon graduate? " + second.canGraduate());
    }
}