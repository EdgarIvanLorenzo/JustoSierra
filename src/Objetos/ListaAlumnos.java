package Objetos;


public class ListaAlumnos {
    private String nombre,apellidos,telefono,grupo,semestre;
    private int idAlumno;
    
    //Metodo constructor
    public ListaAlumnos(){
        
    }   
    
    public int getIdAlumno() {
        return idAlumno;
    }

    //Metodos get y set para cada una de las propiedades de la clase
    public void setIdAlumno(int idAlumno) {    
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String Grupo) {
        this.grupo = Grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
    
}
