/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hora;

import java.util.Date;


public class Hora {
    Date fechaActual=new Date();
    public String getHora(){
        return fechaActual.getDate() + "/" + ((Integer)fechaActual.getMonth()+1) + "/" + (fechaActual.getYear() - 100);
    }
}
