package models;

public class Exams {

    private int nota;
    private String feelingsAboutExamn;
    private String thingsToImprove;

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getFeelingsAboutExamn() {
        return feelingsAboutExamn;
    }
    public void setFeelingsAboutExamn(String feelingsAboutExamn) {
        this.feelingsAboutExamn = feelingsAboutExamn;
    }

    public String getThingsToImprove() {
        return thingsToImprove;
    }
    public void setThingsToImprove(String thingsToImprove) {
        this.thingsToImprove = thingsToImprove;
    }

    @Override
    public String toString() {
        return "Exams -->" +
                "Nota=" + nota +
                ", Feelings about the examn='" + feelingsAboutExamn + '\'' +
                ", Things to improve='" + thingsToImprove + '\'';
    }
}
