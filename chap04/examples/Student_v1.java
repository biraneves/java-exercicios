class Student {

    private String name;
    private double average;

    public Student(String name, double average) {

        this.name = name;

        if (average >= 0.0 && average <= 100.0)
            this.average = average;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setAverage(double average) {

        if (average >= 0.0 && average <= 100.0)
            this.average = average;

    }

    public double getAverage() {

        return average;

    }

    public String getLetterGrade() {

        String letterGrade = "";

        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80)
            letterGrade = "B";
        else if (average >= 70)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;

    }

}

class StudentTest {

    public static void main(String[] args) {
        
        Student account1 = new Student("Jane Green", 93.5);
        Student account2 = new Student("John Blue", 72.75);

        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());

    }

}