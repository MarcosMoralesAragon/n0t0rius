package repositories;

import models.Exams;
import services.ScannerServices;
import utils.IDGenerators;

public class ExamRepository {

    public Exams setNewExam(Exams exam){
        IDGenerators examID = new IDGenerators();
        exam.setID(examID.idExamCreator());
        ScannerServices scanner = new ScannerServices();
        exam.setName(scanner.scannerString());
        exam.setNota(scanner.scannerInt());
        exam.setFeelingsAboutExam(scanner.scannerString());
        exam.setThingsToImprove(scanner.scannerString());
        return exam;
    }
}
