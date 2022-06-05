package com.sofka.taller.fechaactual;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sofka.taller.utilidades.Messages;

/** 
 * Esta clase contiene una funcion que compara dos palabras y devuelve sus diferencias
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
*/
public class FechaHora {

    static Messages message = Messages.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new DiaSemana()
     */
    public static FechaHora getInstance(){
        return new FechaHora();
    }

    /**
     * Método que retorna la fecha actual del sistema en formato (AAAA/MM/DD) (HH:MM:SS)
     */
    public void fechaActual(){

        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMM-dd - HH:mm:ss");  
    
        String fechaFormateada = formato.format(fecha);
        message.showMessage("Hoy en formato (AAAA/MM/DD) (HH:MM:SS) es: " + fechaFormateada);  

    }  
        

    
}
