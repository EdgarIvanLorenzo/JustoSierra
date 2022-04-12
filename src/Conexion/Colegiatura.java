
package Conexion;
//Importacion del modelo colegiatura
import Objetos.BuscarColegiatura;
import Objetos.ColegiaturaModel;
import Objetos.InscripcionCompleto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Colegiatura {
    //Construccion del objeto conexion
    conexion cone = new conexion();
    Connection conn = cone.getConexion();

    ResultSet rs = null;
    Statement st = null;
    
    /*Usuarios*/
    public void addColegiatura(ColegiaturaModel cole) {
        try {
            st = conn.createStatement();
            st.executeUpdate("Insert into Colegiatura (idAlumno,idCosto,Fecha,Lugar,Cantidad,Letras,Observaciones,Status,Mes,Año) "
                    + "values("+cole.getIdAlumno()+","+cole.getIdCosto()+",'"+cole.getFecha()+"','"+cole.getLugar()+"','"+cole.getCantidad()+"','"+cole.getLetras()+"','"+cole.getObservaciones()+"','"+cole.getStatus()+"','"+cole.getMes()+"','"+cole.getYear()+"')");
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
    
     public ArrayList<BuscarColegiatura> getNameColegiaturas(String nombreAlumno){
        ArrayList<BuscarColegiatura> colegiaturas = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select Colegiatura.Mes, Colegiatura.Año, Alumnos.Nombre, Alumnos.Apellidos, Colegiatura.Cantidad, Colegiatura.Status from Colegiatura join Alumnos on Alumnos.idAlumnos=Colegiatura.idAlumno where Alumnos.Nombre='"+nombreAlumno+"'");
            while (rs.next()) {
                //Creo un objeto de tipo Inscripciones
                BuscarColegiatura i = new BuscarColegiatura();
                i.setMes(rs.getString("Mes"));
                i.setYear(rs.getString("Año"));
                i.setNombre(rs.getString("Nombre"));
                i.setApellidos(rs.getString("Apellidos"));
                i.setCantidad(rs.getString("Cantidad"));
                i.setStatus(rs.getString("Status"));
                colegiaturas.add(i); //Agregamos el objeto de tipo Inscripciones a la lista de tipo ArrayList del mismo tipo
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return colegiaturas;
    }
    
}
