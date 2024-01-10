public class Student {
    String name, stuNo;
    int classes;
    Lecture math;
    Lecture physics;
    Lecture chemistry;
    double average;
    double mathAverage;
    double physAverage;
    double chemAverage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Lecture math, Lecture physics, Lecture chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;

        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.examScore = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.examScore = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.examScore = chemistry;
        }

    }

    public void addBulkPerformanceScore(int math, int physics, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.perfScore = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.perfScore = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.perfScore = chemistry;
        }
    }

    public void isPass() {
        if (this.math.examScore == 0 || this.physics.examScore == 0 || this.chemistry.examScore == 0 || this.math.perfScore == 0 || this.physics.perfScore == 0 || this.chemistry.perfScore == 0) {
            System.out.println("Grades not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed the class!");
            } else {
                System.out.println("Failed in class!");
            }
        }
    }

    public void calcAverage() {
        this.mathAverage = this.math.examScore * 0.8 + this.math.perfScore * 0.2;
        this.physAverage = this.physics.examScore * 0.8 + this.physics.perfScore * 0.2;
        this.chemAverage = this.chemistry.examScore * 0.8 + this.chemistry.perfScore * 0.2;
        this.average = (this.mathAverage + this.physAverage + this.chemAverage) / 3d;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematics Score : " + this.math.examScore + " & " + "Mathematics Performance Score : " + this.math.perfScore);
        System.out.println("Mathematics Average Score : " + this.mathAverage);
        System.out.println("Physics Score : " + this.physics.examScore + " & " + "Physics Performance Score : " + this.physics.perfScore);
        System.out.println("Physics Average Score : " + this.physAverage);
        System.out.println("Chemistry Score : " + this.chemistry.examScore + " & " + "Chemistry Performance Score : " + this.chemistry.perfScore);
        System.out.println("Chemistry Average Score : " + this.chemAverage);
    }

}

