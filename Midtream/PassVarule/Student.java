package Midtream.PassVarule;

public class Student {

    private int student_id;
    private String student_Name;
    
    public Student() {
        student_id = 0;
        student_Name = "Unknow";
    }

    public void setStudentID(int students_id) {

        student_id = students_id;

    }

    public void setStudentName(String students_Name) {

        student_Name = students_Name;

    }

    public int getStudentID() {

        return student_id;

    }

    public String getStudentName() {

        return student_Name;
        
    }

}
