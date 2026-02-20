public class Student {
    private double grade;

    public Student(double grade){
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }

    public double average(Student[] student){
        double sum = 0;
        for(int i = 0; i < student.length; i++){
            sum += student[i].getGrade();
        }
        return sum / student.length;
    }
    public void maxmin(Student[] student) {
        Student max = student[0];
        Student min = student[0];

        for (int i = 0; i < student.length; i++) {
            if (student[i].getGrade() > max.getGrade()) {
                max = student[i];
            }
            if (student[i].getGrade() < min.getGrade()) {
                min = student[i];
            }
        }
        System.out.println("maximum grade: " + max.getGrade());
        System.out.println("minimum grade: " + min.getGrade());
    }
    public void passedFailed(Student[] student){
        int passed = 0;
        int failed = 0;
        for(int i = 0; i < student.length; i++){
            if(student[i].getGrade() >= 10){
                passed += 1;
            }
            else{
                failed += 1;
            }
        }
        System.out.println("num of passed students: " + passed);
        System.out.println("num of failed students: " + failed);
    }
    public void showAboveAverage(Student[] student){
        System.out.println("grade above average: ");
        for(int i = 0; i < student.length; i++){
            if(student[i].getGrade() > average(student)){
                System.out.println(student[i].getGrade());
            }
        }
    }
}

