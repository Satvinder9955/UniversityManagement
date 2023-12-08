import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("T001", "John Smith");
        Student student1 = new Student("S001", "Alice Johnson");
        Student student2 = new Student("S002", "Bob Davis");

        Course course = new Course("C001", "Introduction to Java", teacher);
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        Exam midtermExam = new Exam("C001", "Midterm Exam", 100, course);
        Exam finalExam = new Exam("C001", "Final Exam", 100, course);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("University Management System");
            System.out.println("1. Enroll Student");
            System.out.println("2. Deregister Student");
            System.out.println("3. Display Enrolled Students");
            System.out.println("4. Conduct Midterm Exam");
            System.out.println("5. Display Midterm Exam Marks");
            System.out.println("6. Conduct Final Exam");
            System.out.println("7. Display Final Exam Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    course.enrollStudent(createStudent(scanner));
                    break;
                case 2:
                    course.deregisterStudent(findStudent(course, scanner));
                    break;
                case 3:
                    course.displayEnrolledStudents();
                    break;
                case 4:
                    midtermExam.conductExam();
                    break;
                case 5:
                    midtermExam.displayMarks();
                    break;
                case 6:
                    finalExam.conductExam();
                    break;
                case 7:
                    finalExam.displayMarks();
                    break;
            }
        } while (choice != 0);
    }

    private static Student createStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String studentId = scanner.next();
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        return new Student(studentId, studentName);
    }

    private static Student findStudent(Course course, Scanner scanner) {
        System.out.print("Enter student ID: ");
        String studentId = scanner.next();
        for (Student student : course.getEnrolledStudents()) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        System.out.println("Student not found.");
        return null;
    }
}
