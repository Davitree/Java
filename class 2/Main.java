// Program to create two classes: Student and Teacher
// Each class has two methods and objects are created in main class

class Student {

    void study() {
        System.out.println("Student is studying.");
    }

    void attendClass() {
        System.out.println("Student is attending class.");
    }
}

class Teacher {

    void teach() {
        System.out.println("Teacher is teaching.");
    }

    void checkAssignment() {
        System.out.println("Teacher is checking assignments.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating object of Student class
        Student s = new Student();

        // Calling Student methods
        s.study();
        s.attendClass();

        // Creating object of Teacher 
        Teacher t = new Teacher();

        // Calling Teacher methods
        t.teach();
        t.checkAssignment();
    }
}