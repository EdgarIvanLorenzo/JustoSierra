package Objetos;

public class Inscripciones {

    private String Nombre;
    private String idInscripciones;
    private String Apellidos;
    private String Fecha;
    private String Lugar;
    private String Cantidad;
    private String Letras;
    private String Observaciones;
    private String Status;
    private int idGrupo;

    public String getIdInscripciones() {
        return idInscripciones;
    }

    public void setIdInscripciones(String idInscripciones) {
        this.idInscripciones = idInscripciones;
    }
    
    
    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    

    //Metodo constructor de la clase
    public Inscripciones() {

    }

    //Get an Setters
    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getLetras() {
        return Letras;
    }

    public void setLetras(String Letras) {
        this.Letras = Letras;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idCosto) {
        this.idGrupo = idCosto;
    }

}
