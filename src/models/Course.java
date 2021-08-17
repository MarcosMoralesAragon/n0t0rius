package models;

import java.util.ArrayList;

public class Course {
    private String ID;
    private String name;
    private String info;
    private ArrayList<Exams> exams;


    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<Exams> getExams() {
        return exams;
    }
    public void setExams(ArrayList<Exams> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Course" +
                "ID ='" + ID + '\'' +
                ", Name ='" + name + '\'' +
                ", Info ='" + info + '\'' +
                ", Examenes =" + exams;
    }
}
