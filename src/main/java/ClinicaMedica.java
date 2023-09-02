import java.util.List;
import java.util.ArrayList;
class ClinicaMedica {
    private String nombre;
    private List<EspecialidadMedica> especialidades;
    private String tipo;

    public ClinicaMedica(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.especialidades = new ArrayList<>();
    }

    // Métodos para agregar especialidades
    public void agregarEspecialidad(EspecialidadMedica especialidad) {
        especialidades.add(especialidad);
    }

    // Métodos para obtener médicos y administrativos de la clínica
    public List<Medico> obtenerTodosLosMedicos() {
        List<Medico> todosLosMedicos = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidades) {
            todosLosMedicos.addAll(especialidad.getMedicos());
        }
        return todosLosMedicos;
    }

    public List<Administrativo> obtenerTodosLosAdministrativos() {
        List<Administrativo> todosLosAdministrativos = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidades) {
            todosLosAdministrativos.addAll(especialidad.getAdministrativos());
        }
        return todosLosAdministrativos;
    }
}