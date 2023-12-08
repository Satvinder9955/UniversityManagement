import java.util.ArrayList;
import java.util.List;
public class Exam {
    private String courseId;
    private String examName;
    private int totalMarks;
    private Course course;
    private List<Mark> marks;

    public Exam(String courseId, String examName, int totalMarks, Course course) {
        this.courseId = courseId;
        this.examName = examName;
        this.totalMarks = totalMarks;
        this.course = course;
        this.marks = new ArrayList<>();
    }

    public void conductExam() {
        for (Student student : course.getEnrolledStudents()) {
            int obtainedMarks = (int) (Math.random() * (totalMarks + 1));
            Mark mark = new Mark(student, obtainedMarks);
            marks.add(mark);
        }
        System.out.println("Exam conducted for " + course.getCourseName());
    }

    public void displayMarks() {
        System.out.println("Marks for " + examName + " in " + course.getCourseName() + ":");
        for (Mark mark : marks) {
            System.out.println(mark);
        }
        System.out.println();
    }
}
