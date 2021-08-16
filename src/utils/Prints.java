package utils;

public class Prints {
    public void welcome(){
        System.out.println("Bienvenido a N0t0rius, indique a continuación que acción desea realizar");
    }
    public void menu(){
        System.out.println("╔━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╗");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_- 1. Crear nueva asignatura -_-_-_-_-_-_-_-_-_-_-_╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_- 2. Añadir examen -_-_-_-_-_-_-_-_-_-_-_-_-_-╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_-_- 3. Modificar -_-_-_-_-_-_-_-_-_-_-_-_-_-_-╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_- 4. Listar asignaturas -_-_-_-_-_-_-_-_-_-_-_-_╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_- 5. Listar examenes -_-_-_-_-_-_-_-_-_-_-_-_-╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_- 6. Eliminar asignatura -_-_-_-_-_-_-_-_-_--_-_╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_- 7. Eliminar examen -_-_-_-_-_-_-_-_-_-_-_-_-╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_- 8. Guardar asignaturas -_-_-_-_-_-_-_-_-_-_-_-╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_- 9. Guardar examenes -_-_-_-_-_-_-_-_-_-_-_-_╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_-_- 10. Guardar todo -_-_-_-_-_-_-_-_-_-_-_-_-╣");
        System.out.println("╠_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- 11. Salir -_-_-_-_-_-_-_-_-_-_-_-_-_-_╣");
        System.out.println("╚━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╝");
        System.out.print(" > ");
    }
    public void endAction(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println(" → Acción terminada, volviendo a la selección principal ← ");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }
    public void end(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░             → Cerrando programa, gracias por su uso ←            ░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }
    public void failInputData(int attemptsleft){
        System.out.println("Error introduciendo datos, quedan " + attemptsleft + " intentos restantes");
    }
    public void outOfAttempts(){
        System.out.println("Se ha quedado sin intentos");
    }
}
