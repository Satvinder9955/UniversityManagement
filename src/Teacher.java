public class Teacher {
    private String teacherId;
    private String name;

    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher ID: " + teacherId + ", Name: " + name;
    }
}
