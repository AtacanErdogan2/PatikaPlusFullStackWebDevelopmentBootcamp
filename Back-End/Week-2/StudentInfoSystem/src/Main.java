public class Main {
    public static void main(String[] args) {

        Lecture math = new Lecture("Mathematics", "MATH101", "MATH");
        Lecture physics = new Lecture("Physics", "PHYS101", "PHYS");
        Lecture chemistry = new Lecture("Chemistry", "KMY101", "CHEM");

        Teacher t1 = new Teacher("Thales", "90550000000", "MATH");
        Teacher t2 = new Teacher("Isaac Newton", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Alfred Nobel", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Pythagoras", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(100, 80, 70);
        s1.addBulkPerformanceScore(100, 90, 80);
        s1.isPass();

        Student s2 = new Student("Albert Einstein", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100, 100, 75);
        s2.addBulkPerformanceScore(90, 100, 75);
        s2.isPass();

        Student s3 = new Student("Marie Curie", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(70, 90, 100);
        s3.addBulkPerformanceScore(90, 80, 100);
        s3.isPass();

    }
}
