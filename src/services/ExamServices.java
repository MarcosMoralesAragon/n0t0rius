package services;

import models.Exams;
import repositories.ExamRepository;

import java.util.ArrayList;

public class ExamServices {
    ArrayList<Exams> examArrayList= new ArrayList<>();
    public void createExam(){
        Exams exam = new Exams();
        ExamRepository examRepository = new ExamRepository();
        exam = examRepository.setNewExam(exam);
        examArrayList.add(exam);
    }
    public void showExams(){
        for (Exams exams: examArrayList) {
            System.out.println(exams);
        }
    }
}