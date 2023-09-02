import java.util.ArrayList;
import java.util.List;
class Administrativo extends Trabajador {
    private String tituloProfesional;
    private String correoElectronico;

    public Administrativo(String nombre, String tituloProfesional, String correoElectronico) {
        setNombre(nombre);
        this.tituloProfesional = tituloProfesional;
        this.correoElectronico = correoElectronico;

    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getTitulo() {
        return tituloProfesional;
    }
}