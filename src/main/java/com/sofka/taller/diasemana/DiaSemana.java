package com.sofka.taller.diasemana;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase comprueba si un día es laboral o no
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class DiaSemana {

    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new DiaSemana()
     */
    public static DiaSemana getInstance(){
        return new DiaSemana();
    }

    /**
     * Método que pide un día de la semana por consola para despues comprobar si es dia laboral
     */
    public void comprobarDiaLaboral(){

        String dia;
        do {
            message.showMessage("Ingrese el día de la semana que quiere verificar o digite salir para terminar");
            dia = scanner.getStringLowerCase();

            switch(dia){
                case "lunes":
                    message.showMessage(laboral(dia));
                    break;
                case "martes":
                    message.showMessage(laboral(dia));
                    break;
                case "miercoles":
                    message.showMessage(laboral(dia));
                    break;
                case "jueves":
                    message.showMessage(laboral(dia));
                    break;
                case "viernes":
                    message.showMessage(laboral(dia));
                    break;
                case "sabado":
                    message.showMessage(noLaboral(dia));
                    break;
                case "domingo":
                    message.showMessage(noLaboral(dia));
                    break;
                case "salir":
                    message.showMessage("Hasta pronto");
                    break;
                default:
                    message.showMessage(dia +" no es un dia de la semana");
            }

        } while (!"salir".equals(dia));
        
    }

    /**
     * Método para imprimir mensaje para dias no laborales
     * @param dia dia d ela semana analizado
     * @return mensaje para imprimir
     */
    private static String noLaboral (String dia){
        return "el "+dia +" no es laboral";
    }

        /**
     * Método para imprimir mensaje para dias no laborales
     * @param dia dia d ela semana analizado
     * @return mensaje para imprimir
     */
    private static String laboral (String dia){
        return "el "+dia +" es laboral";
    }
}
