package models;

import java.util.ArrayList;

public class Course {
    private String ID;
    private String name;
    private String info;
    private ArrayList<Exams> examns;


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

    public ArrayList<Exams> getExamns() {
        return examns;
    }
    public void setExamns(ArrayList<Exams> examns) {
        this.examns = examns;
    }

    @Override
    public String toString() {
        return "Course" +
                "ID ='" + ID + '\'' +
                ", Name ='" + name + '\'' +
                ", Info ='" + info + '\'' +
                ", Examenes =" + examns;
    }
}
