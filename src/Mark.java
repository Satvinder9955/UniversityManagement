public class Mark {
    private Student student;
    private int obtainedMarks;

    public Mark(Student student, int obtainedMarks) {
        this.student = student;
        this.obtainedMarks = obtainedMarks;
    }

    @Override
    public String toString() {
        return student.getName() + ": " + obtainedMarks + " marks";
    }
}
