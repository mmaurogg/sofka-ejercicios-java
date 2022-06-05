package com.sofka.taller.circulo;

import java.text.DecimalFormat;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase contiene el menú para la creación de un circulo
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class UICirculo {

    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    static DecimalFormat formato = new DecimalFormat("#.00");

    /**
     * Método para generar la instancia de la clase
     * @return new UICirculo()
     */
    public static UICirculo getInstance(){
        return new UICirculo();
    }

    /**
     * Método que despliega el menú para crear círculos
     */
    public void menuCirculo() {

        Boolean flag = true;
        Circulo circulo;

        while (Boolean.TRUE.equals(flag)) {

            try {
                message.showMessage("Bienvenido a su creador de círculos");

                circulo = crearCirculo();

                mostrarCirculo(circulo);

                message.showMessage("¿Desea crear otro círculo? (y/n)?");
                String confirmacion = scanner.getString();

                if ("n".equalsIgnoreCase(confirmacion)) {
                    flag = false;
                }

            } catch (Exception e) {
                message.showMessage("Debe introducir un valor numérico");
            }

        }

    }

    /**
     * Método para crear un circulo puede ser de forma automática o con un radio
     * definido por entrada
     * 
     * @return La instancia de un circulo
     */
    private static Circulo crearCirculo() {

        message.showMessage("¿Desea que la maquina cree un circulo por usted? (y/n)");
        String confirmacion = scanner.getString();

        if ("y".equalsIgnoreCase(confirmacion)) {
            return new Circulo();
        }

        message.showMessage("Favor ingrese el rádio del círculo");
        Double radio = scanner.getDouble();

        return new Circulo(radio);
    }

    /**
     * Metodo para mostrar por consola las propiedades del circulo
     * 
     * @param circulo circulo creado al cual se quiere mostrar los datos
     */
    private static void mostrarCirculo(Circulo circulo) {
        String radio = formato.format(circulo.getRadio());
        String area = formato.format(circulo.getArea());
        message.showMessage("\nHa creado un círculo de: \nradio: " + radio + " unidades"
                + "\nárea: " + area + " unidades");
    }

}