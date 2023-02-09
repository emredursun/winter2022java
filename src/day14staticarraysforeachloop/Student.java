package day14staticarraysforeachloop;

public class Student {
    String name;
    int year;
    static  int counter = 1000;
    String studentId;

    public String setStudentId(){
        counter++;
        studentId = year + "" + counter;
        return studentId; // If the return type of the method is different from "void" you have to use "return" keyword inside the method


    }
}
