import java.util.ArrayList;
import java.util.List;

class EspecialidadMedica {
    private String nombre;
    private String ubicacion;
    private List<Medico> medicos;
    private List<Administrativo> administrativos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public EspecialidadMedica(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.medicos = new ArrayList<>();
        this.administrativos = new ArrayList<>();

    }

    // Métodos para agregar médicos y administrativos
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }
}