package Midtream.PassVarule;

public class Main {
    public static void main(String[] args) {

        Student s1, s2;
        Enroll er;

        int id = 1;

        s1 = new Student();
        s1.setStudentID(id); //set ค่า เป็น 1
        s1.setStudentName("Warakorn");

        id = 2; //เปลี่ยนค่าเป็น 2

        System.out.println(id);
        s1.setStudentID(id);

        System.out.println("Student ID : " + s1.getStudentID()); // ผลลัพธ์ออกมาเป็น 1 เพราะเราได้ set ค่าใส่ใน method แล้ว
        System.out.println("Student Name : " + s1.getStudentName());

        er = new Enroll("CSC250", "6A-505");

        System.out.println(er.enrollData());

    }
}
