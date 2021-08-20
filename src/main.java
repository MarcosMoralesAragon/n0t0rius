import services.CourseServices;
import services.ExamServices;
import services.ScannerServices;
import utils.Prints;

public class main {
     public static void main(String[] args) {
         Prints prints = new Prints();
         ScannerServices scanner = new ScannerServices();
         CourseServices courseServices = new CourseServices();
         ExamServices examServices = new ExamServices();

         prints.welcome();
         int action = 0;
         boolean exit = false;
        do {
            prints.menu();
            action = scanner.scannerInt();
            switch (action){
                case 1:
                    courseServices.createCourse();
                    break;
                case 2:
                    examServices.createExam();
                    break;
                case 3:
                    //TODO Modificar
                    break;
                case 4:
                    courseServices.showCourses();
                    break;
                case 5:
                    examServices.showExams();
                    break;
                case 6:
                    //TODO Eliminar asignatura
                    break;
                case 7:
                    //TODO Eliminar examen
                    break;
                case 8:
                    //TODO Guardar asignatura
                    break;
                case 9:
                    //TODO Guardar examenes
                    break;
                case 10:
                    //TODO Guardar todo
                    break;
                case 11:
                    exit = true;
                    break;
                default:
                    break;
            }
            prints.endAction();
        }while (!exit);
        prints.end();
    }
}
