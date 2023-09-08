import java.util.*;
import java.util.stream.*;


class AverageStudentExample{

    int roll;
    int marks;
    String name;

    public AverageStudentExample(int roll,int marks,String name){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public int getRoll(){
        return roll;
    }

    public int getMarks(){
        return marks;
    }

    public String name(){
        return name;
    }

    @Override
    public String toString(){
        return "AverageStudentExample{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String args[]){

        AverageStudentExample st1 = new AverageStudentExample(1, 89, "manjeet");
        AverageStudentExample st2 = new AverageStudentExample(1, 90, "rupesh");
        AverageStudentExample st3 = new AverageStudentExample(1, 91, "mukund");
        AverageStudentExample st4 = new AverageStudentExample(1, 92, "ankit");

        List<AverageStudentExample> avgStudent = Arrays.asList(st1,st2,st3,st4);

        double avgSt = avgStudent.stream()
                                    .mapToDouble(student -> student.getMarks())
                                    .average()
                                    .getAsDouble();

        System.out.println(avgSt);

    }
}