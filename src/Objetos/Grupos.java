
package Objetos;

public class Grupos {
    private int id;
    private String Semestre,Grupo;
    public Grupos(){
        
    }
    public Grupos(String semestre,String grupo){
        this.Grupo=grupo;
        this.Semestre=semestre;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }
    
    
}
