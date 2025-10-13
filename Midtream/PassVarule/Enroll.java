package Midtream.PassVarule;

public class Enroll {

    private String subject_name;
    private String room;

    public Enroll() {

        subject_name = "Unknow";
        room = "Unknow";

    }

    public Enroll(String subjects_name, String room) {

        subject_name = subjects_name;
        this.room = room;

    }

    public String enrollData () {

        return "Subject Name : " + subject_name
        + "\n" + "Room : " + room;

    }
}
