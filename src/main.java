import services.ScannerServices;
import utils.Prints;

public class main {
     public static void main(String[] args) {
         Prints prints = new Prints();
         ScannerServices scanner = new ScannerServices();

         prints.welcome();
         int action = 0;
         boolean exit = false;
        do {
            prints.menu();
            action = scanner.scannerInt();
            switch (action){
                case 1:
                    //TODO Crear nueva asignatura
                    break;
                case 2:
                    //TODO Añadir examen
                    break;
                case 3:
                    //TODO Modificar
                    break;
                case 4:
                    //TODO Listar asignaturas
                    break;
                case 5:
                    //TODO Listar examenes
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
        }while (!exit);
        prints.end();
    }
}
