package Conexion;

import Objetos.ListaAlumnos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lista {
    
    
    //Construccion del objeto conexion
    conexion cone = new conexion();
    Connection conn = cone.getConexion();
    ResultSet rs = null;
    Statement st = null;
    
    
    public void addLista(int idAlumno, int idGrupo,String año) {
        try {
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO Lista(idAlumno,idGrupo,Año)  \n"
                    + "SELECT " + idAlumno + ", " + idGrupo + " ,'"+año+"'\n"
                    + "WHERE NOT EXISTS(SELECT 1 FROM Lista WHERE idAlumno = " + idAlumno + " and idGrupo=" + idGrupo + " and Año='"+año+"')");    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar a la lista");
        }
    }
    
    public ArrayList<ListaAlumnos> getListaUltimo(int idGrupo){
        ArrayList<ListaAlumnos> lista=new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select Alumnos.idAlumnos, Alumnos.Nombre,Alumnos.Apellidos,Alumnos.Telefono,Grupos.Semestre,Grupos.Grupo from Alumnos join Grupos on Grupos.idGrupos=Alumnos.idGrupo where Alumnos.idGrupo="+idGrupo);
            while (rs.next()) {
                //Crear el objeto para almacenar los datos de las columnas
                ListaAlumnos alumno=new ListaAlumnos();
                alumno.setIdAlumno(Integer.parseInt(rs.getString("idAlumnos")));
                alumno.setNombre(rs.getString("Nombre"));
                alumno.setApellidos(rs.getString("Apellidos"));
                alumno.setTelefono(rs.getString("Telefono"));
                alumno.setSemestre(rs.getString("Semestre"));
                alumno.setGrupo(rs.getString("Grupo"));
                lista.add(alumno);
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return lista;
    }
    
    public ArrayList<ListaAlumnos> getLista(int idGrupo,int year){
        ArrayList<ListaAlumnos> lista=new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select Alumnos.idAlumno, Alumnos.Nombre, Alumnos.Apellidos, Alumnos.Telefono, Grupos.Grupo from Lista join Alumnos on Lista.idAlumno=Alumnos.idAlumnos join Grupos on Lista.idGrupo=Grupos.idGrupos"
                    + " where Lista.Año="+year+" and Lista.idGrupo="+idGrupo+";");
            while (rs.next()) {
                //Crear el objeto para almacenar los datos de las columnas
                ListaAlumnos alumno=new ListaAlumnos();
                alumno.setIdAlumno(Integer.parseInt(rs.getString("idAlumno")));
                alumno.setNombre(rs.getString("Nombre"));
                alumno.setApellidos(rs.getString("Apellidos"));
                alumno.setTelefono(rs.getString("Telefono"));
                alumno.setGrupo(rs.getString("Grupo"));
                lista.add(alumno);
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return lista;
    }
}
