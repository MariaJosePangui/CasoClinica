import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una clínica médica
        ClinicaMedica clinica = new ClinicaMedica("Clínica Mayor", "Privada");

        // Crear una especialidad médica
        EspecialidadMedica cirugia = new EspecialidadMedica("Cirugía", "Latitud: 123, Longitud: 456");

        // Crear un médico y asignarlo a la especialidad
        Medico medico1 = new Medico("Dr. Juan Pérez", "Cirugía cardíaca", "Lunes a viernes, 9:00 AM - 5:00 PM", "Pacientes asignados: 50", cirugia);

        // Crear un administrativo
        Administrativo administrativo1 = new Administrativo("Ana García", "Secretaria", "ana@example.com");

        // Agregar el médico y el administrativo a la especialidad
        cirugia.agregarMedico(medico1);
        cirugia.agregarAdministrativo(administrativo1);

        // Agregar la especialidad a la clínica
        clinica.agregarEspecialidad(cirugia);

        // Obtener todos los médicos de la clínica
        List<Medico> todosLosMedicos = clinica.obtenerTodosLosMedicos();
        System.out.println("Todos los médicos de la clínica:");
        for (Medico medico : todosLosMedicos) {
            System.out.println("Nombre: " + medico.getNombre() + ", Especialización: " + medico.getEspecializacion());
        }

        // Obtener todos los administrativos de la clínica
        List<Administrativo> todosLosAdministrativos = clinica.obtenerTodosLosAdministrativos();
        System.out.println("\nTodos los administrativos de la clínica:");
        for (Administrativo administrativo : todosLosAdministrativos) {
            System.out.println("Nombre: " + administrativo.getNombre() + ", Título: " + administrativo.getTitulo());
        }
    }
}