import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    public void deregisterStudent(Student student) {
        enrolledStudents.remove(student);
        System.out.println(student.getName() + " deregistered from " + courseName);
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
        System.out.println();
    }
}
