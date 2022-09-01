package EjerciciosDeClase;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Maria",12,"F","Jocotitlan");
        Estudiante e1 = new Estudiante("Juan",17,"M","Atlacomulco","0123",
                "Paradigmas","B+");
        Estudiante e2 = new Estudiante("Jesus",19,"M","San Felipe","2124",
                "Fisica","A+");


        p1.mostrarInformacion();
        System.out.println("--------------------------------");
        e1.mostrarInformacion();
        System.out.println("--------------------------------");
        e2.mostrarInformacion();
    }
}