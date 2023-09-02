import java.util.ArrayList;
import java.util.List;
class Medico extends Trabajador {
    private String especializacion;
    private String horarioAtencion;
    private String pacientesAsignados;
    private EspecialidadMedica especialidad;

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(String pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }

    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadMedica especialidad) {
        this.especialidad = especialidad;
    }

    public Medico(String nombre, String especializacion, String horarioAtencion, String pacientesAsignados, EspecialidadMedica especialidad) {
        setNombre(nombre);
        this.especializacion = especializacion;
        this.horarioAtencion = horarioAtencion;
        this.pacientesAsignados = pacientesAsignados;
        this.especialidad = especialidad;

    }
    @Override
    public String getTipo() {
        return "Médico";
    }
}