package models;

public class Exams {

    private String ID;
    private String name;
    private int nota;
    private String feelingsAboutExam;
    private String thingsToImprove;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getFeelingsAboutExam() {
        return feelingsAboutExam;
    }
    public void setFeelingsAboutExam(String feelingsAboutExam) {
        this.feelingsAboutExam = feelingsAboutExam;
    }

    public String getThingsToImprove() {
        return thingsToImprove;
    }
    public void setThingsToImprove(String thingsToImprove) {
        this.thingsToImprove = thingsToImprove;
    }

    @Override
    public String toString() {
        return "Exams{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", nota=" + nota +
                ", feelingsAboutExam='" + feelingsAboutExam + '\'' +
                ", thingsToImprove='" + thingsToImprove + '\'' +
                '}';
    }
}
