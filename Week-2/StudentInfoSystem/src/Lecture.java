public class Lecture {
    Teacher lectureTeacher;
    String name;
    String code;
    String prefix;
    int examScore;
    int perfScore;

    public Lecture(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examScore = 0;
        this.perfScore = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.lectureTeacher = t;
            System.out.println("Transaction successful");
        } else {
            System.out.println(t.name + " The academician can't teach this lecture.");
        }
    }

    public void printTeacher() {
        if (lectureTeacher != null) {
            System.out.println("Academician of the " + this.name + " lecture: " + lectureTeacher.name);
        } else {
            System.out.println("No academics are assign to  the " + this.name + " lecture");
        }
    }
}