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
    public Course searchCourseByID(String id){
        Course result = new Course();
        boolean found = false;
        for(Course course : coursesArraylist){
            if (course.getID().equals(id)){
                result = course;
                found = true;
            }
        }
        if(!found){
            result = null;
        }
        return result;
    }
}
