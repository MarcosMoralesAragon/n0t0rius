package services;
import models.Course;
import repositories.CourseRepository;

import java.util.ArrayList;

public class CourseServices {

    ArrayList<Course> coursesArraylist = new ArrayList<>();

    public void createCourse(){
        Course course = new Course();
        CourseRepository courseRepository = new CourseRepository();
        course = courseRepository.setNewCourse(course);
        coursesArraylist.add(course);
    }
    public void showCourses(){
        for (Course course : coursesArraylist) {
            System.out.println(course);
        }
    }
}
