public class Student {
    public String name;
    public String[] lesson;
    public double[] grade;

    public double average(){
        double sum = 0;
        for(int i = 0; i < grade.length; i++){
            sum += grade[i];
        }
        return sum/lesson.length;
    }
}
