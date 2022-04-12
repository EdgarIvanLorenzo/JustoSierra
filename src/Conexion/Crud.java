package Conexion;

import Home.Inscripciones_Pendientes;
import java.sql.*;
import Objetos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Crud {

    //Construccion del objeto conexion
    conexion cone = new conexion();
    Connection conn = cone.getConexion();

    ResultSet rs = null;
    Statement st = null;

    /*Usuarios*/
    public String getContra(String usuario) {
        String contra = "";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select Contraseña from Usuarios where Nombre='" + usuario + "'");
            while (rs.next()) {
                contra = rs.getString("Contraseña");
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return contra;
    }

    /*Grupos*/
    public int getGrupo(int Semestre, String Grupo) {
        int id = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select idGrupos from Grupos where Semestre='" + Semestre + "' and Grupo='" + Grupo + "'");
            while (rs.next()) {
                id = Integer.parseInt(rs.getString("idGrupos"));
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return id;
    }

    public ArrayList<Grupos> getGrupos() {
        ArrayList<Grupos> lista = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select * from Grupos");
            while (rs.next()) {
                Grupos grupos = new Grupos();
                grupos.setId(Integer.parseInt(rs.getString("idGrupos")));
                grupos.setSemestre(rs.getString("Semestre"));
                grupos.setGrupo(rs.getString("Grupo"));
                lista.add(grupos);
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return lista;
    }

    public ArrayList<Object> getGrados() {
        ArrayList<Object> lista = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select * from Grupos");
            while (rs.next()) {
                lista.add(rs.getString("Semestre") + " " + rs.getString("Grupo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
        return lista;
    }

    public ArrayList<String> getGrup() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select DISTINCT Grupo from Grupos");
            while (rs.next()) {
                lista.add(rs.getString("Grupo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
        return lista;
    }

    public String addGrupo(int Semestre, String Grupo) {
        try {
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO Grupos(Semestre, Grupo)  \n"
                    + "SELECT '" + Semestre + "', '" + Grupo + "' \n"
                    + "WHERE NOT EXISTS(SELECT 1 FROM Grupos WHERE Semestre = '" + Semestre + "' and Grupo='" + Grupo + "');");
            JOptionPane.showMessageDialog(null, "Grupo Agregado");
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return "";
    }

    public void updateGrupo(int id, int Semestre, String Grupo) {
        try {
            st = conn.createStatement();
            st.executeUpdate("UPDATE Grupos SET Semestre='" + Semestre + "', Grupo='" + Grupo + "' WHERE idGrupos = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Grupo Actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteGrupo(int id) {
        try {
            st = conn.createStatement();
            st.executeUpdate("DELETE FROM Grupos WHERE idGrupos=" + id);
            JOptionPane.showMessageDialog(null, "Grupo Eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*Costos*/
    public Object[] getCosto(String nombre) {
        Object cuota[] = new Object[2];
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select idCostos,Cantidad from Costos WHERE Nombre='" + nombre + "'");
            while (rs.next()) {
                cuota[0] = Integer.parseInt((String) rs.getString("idCostos"));
                cuota[1] = rs.getString("Cantidad");
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return cuota;
    }
    public ArrayList<Costos> getCostos() {
        ArrayList<Costos> lista = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select * from Costos");
            while (rs.next()) {
                Costos costo = new Costos();
                costo.setIdCostos(Integer.parseInt(rs.getString("idCostos")));
                costo.setNombre(rs.getString("Nombre"));
                costo.setCantidad(rs.getString("Cantidad"));
                lista.add(costo);
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return lista;
    }
    public String addCosto(String Nombre, String Cantidad) {
        try {
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO Costos(Nombre, Cantidad)  \n"
                    + "SELECT '" + Nombre + "', '" + Cantidad + "' \n"
                    + "WHERE NOT EXISTS(SELECT 1 FROM Costos WHERE Nombre = '" + Nombre + "' and Cantidad='" + Cantidad + "');");
            JOptionPane.showMessageDialog(null, "Cuota Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
        return "";
    }
    public void updateCosto(int id, String nombre, String cantidad) {
        try {
            st = conn.createStatement();
            st.executeUpdate("UPDATE Costos SET Nombre='" + nombre + "', Cantidad='" + cantidad + "' WHERE idCostos = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Cuota Actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la cuota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void deleteCosto(int id) {
        try {
            st = conn.createStatement();
            st.executeUpdate("DELETE FROM Costos WHERE idCostos=" + id);
            JOptionPane.showMessageDialog(null, "Cuota Eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la cuota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    /*Alumnos*/
    public int getIdAlumno(String nombre, String apellidos) {
        int id = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select * from Alumnos where Nombre='" + nombre + "' and Apellidos='" + apellidos + "'");
            while (rs.next()) {
                id = Integer.parseInt(rs.getString("idAlumnos"));
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return id;
    }
    public boolean addAlumno(String Nombre, String Apellidos, String Genero, String Telefono, int Grupo) {
        boolean agregado = false;
        try {
            st = conn.createStatement();
            //Sentencia sql o consulta sql a la base de datos
            st.executeUpdate("INSERT INTO Alumnos(Nombre, Apellidos,Genero,Telefono,idGrupo)  \n"
                    + "SELECT '" + Nombre + "', '" + Apellidos + "','" + Genero + "', '" + Telefono + "', '" + Grupo + "'\n"
                    + "WHERE NOT EXISTS(SELECT 1 FROM Alumnos WHERE Nombre = '" + Nombre + "' and Apellidos='" + Apellidos + "');");
            //Si el alumno fue agregado de manera correcta retorna true 
            agregado = true;
        } catch (Exception e) {
            //Mandamos el error cuando no se añada el dato
            JOptionPane.showMessageDialog(null, "Error al añadir al Alumno", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
        //Retornamos el agregado
        return agregado;
    }
    
    
    
    //Inscripciones   
    public void addInscripcion(int idAlumno, String fecha, String lugar, int cantidad, String letras, String Observaciones, String status, int costo,int grupo,int mes,String year) {
        try {
            System.out.println(costo);
            st = conn.createStatement();
            //Sentencia sql o consulta sql a la base de datos
            st.executeUpdate("insert into Inscripciones(idAlumno,idGrupo,idCosto,Fecha,Mes,Año,Lugar,Cantidad,Letras,Observaciones,Status) values(" + idAlumno + "," + grupo + "," + costo + ",'" + fecha + "','" + mes + "','" + year + "', '"+lugar+"','" + cantidad + "', '" + letras + "' , '"+Observaciones+"' , '"+status+"')");
            JOptionPane.showMessageDialog(null, "Inscripcion Exitosa", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            //Mandamos el error cuando no se añada el dato
            JOptionPane.showMessageDialog(null, "Error al añadir al inscribir", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    public ArrayList<Inscripciones> getTypeInscripciones(String status) {
        ArrayList<Inscripciones> inscripciones = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from Inscripciones inner join Alumnos on Inscripciones.idAlumno=Alumnos.idAlumnos where Status='" + status + "'");
            while (rs.next()) {
                //Creo un objeto de tipo Inscripciones
                Inscripciones i = new Inscripciones();
                i.setIdInscripciones(rs.getString("idInscripciones"));
                i.setNombre(rs.getString("Nombre"));
                i.setApellidos(rs.getString("Apellidos"));
                i.setFecha(rs.getString("Fecha"));
                i.setLugar(rs.getString("Lugar"));
                i.setCantidad(rs.getString("Cantidad"));
                i.setLetras(rs.getString("Letras"));
                i.setObservaciones(rs.getString("Observaciones"));
                i.setStatus(rs.getString("Status"));
                i.setIdGrupo(Integer.parseInt(rs.getString("idGrupo")));
                inscripciones.add(i); //Agregamos el objeto de tipo Inscripciones a la lista de tipo ArrayList del mismo tipo
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return inscripciones;
    }
    public void deleteInscripcion(String id) {
        //Confirmar la eliminacion
        int confirmacion = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar la inscripcion?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmacion == 0) {
            try {
                st = conn.createStatement();
                st.executeUpdate("DELETE FROM Inscripciones WHERE idInscripciones=" + id);
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar la inscripcion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Eliminacion cancelada","Cancelado",JOptionPane.WARNING_MESSAGE);
        }

    }
    public void updateInscripcion(int id,int cantidad,String observaciones,String status){
        try {
            st = conn.createStatement();
            st.executeUpdate("update Inscripciones set Cantidad='" + cantidad + "',Observaciones='" + observaciones + "',Status='"+status+"' where idInscripciones=" + id);
            JOptionPane.showMessageDialog(null, "Cantidad abonada");
            //Creo un objeto para volver a ña lista de pendientes
            Inscripciones_Pendientes p=new Inscripciones_Pendientes();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abonar a la inscripcion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ArrayList<InscripcionCompleto> getNameInscripciones(String nombreAlumno){
        ArrayList<InscripcionCompleto> inscripciones = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select Inscripciones.idInscripciones , Inscripciones.Fecha,Grupos.Semestre,Grupos.Grupo,Alumnos.Nombre,Alumnos.Apellidos from Inscripciones join Grupos on Grupos.idGrupos=Inscripciones.idGrupo join Alumnos on Alumnos.idAlumnos=Inscripciones.idAlumno where Alumnos.Nombre='"+nombreAlumno+"' and Inscripciones.Status='Completo'");
            while (rs.next()) {
                //Creo un objeto de tipo Inscripciones
                InscripcionCompleto i = new InscripcionCompleto();
                i.setIdIncripcion(Integer.parseInt(rs.getString("idInscripciones")));
                i.setNombre(rs.getString("Nombre"));
                i.setApellidos(rs.getString("Apellidos"));
                i.setGrupo(rs.getString("Grupo"));
                i.setSemestre(rs.getString("Semestre"));
                i.setFecha(rs.getString("Fecha"));
                inscripciones.add(i); //Agregamos el objeto de tipo Inscripciones a la lista de tipo ArrayList del mismo tipo
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return inscripciones;
    }
    
     
    
    //Otros
    public ArrayList<String> getMeses(){
         ArrayList<String> meses = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select distinct(Mes) from Inscripciones");
            while (rs.next()) {
                meses.add(rs.getString("Mes")); //Agregamos el objeto de tipo Inscripciones a la lista de tipo ArrayList del mismo tipo
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return meses;
    }
    public ArrayList<String> getYear(){
         ArrayList<String> año = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select distinct(Año) from Inscripciones");
            while (rs.next()) {
                año.add(rs.getString("Año")); //Agregamos el objeto de tipo Inscripciones a la lista de tipo ArrayList del mismo tipo
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return año;
    }
    
    
    
}
