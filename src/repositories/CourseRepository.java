package repositories;

import models.Course;
import services.ScannerServices;
import utils.IDGenerators;
import utils.Prints;

public class CourseRepository {
    public Course setNewCourse(Course course){
        IDGenerators courseID = new IDGenerators();
        course.setID(courseID.idCourseCreator());
        ScannerServices scanner = new ScannerServices();
        Prints prints = new Prints();
        prints.insertData("el nombre de la asignatura");
        course.setName(scanner.scannerString());
        prints.insertData("la informacion sobre la asignatura");
        course.setInfo(scanner.scannerString());
        course.setExams(null);
        return course;
    }
}
