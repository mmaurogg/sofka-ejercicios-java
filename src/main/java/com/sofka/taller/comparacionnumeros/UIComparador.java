package com.sofka.taller.comparacionnumeros;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/** 
 * Esta clase contiene el menú para comparacíon de dos números
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
*/
public class UIComparador {

    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    static Comparador comparador = new Comparador();

    /**
     * Método para generar la instancia de la clase
     * @return new UIComparador()
     */
    public static UIComparador getInstance(){
        return new UIComparador();
    }

    /**
     * Funcion que despliega el menú el cual pide un dos números consola para despues compararlos
    */
    public void menuComparadorNumeros() {

        Boolean flag = true;

        while (Boolean.TRUE.equals(flag)) {

            try {
                message.showMessage("Bienvenido a su comparador de números");

                message.showMessage("Favor ingrese su primer número");
                Integer primerNumero = scanner.getInteger();

                message.showMessage("Favor ingrese su segundo número");
                Integer segundoNumero = scanner.getInteger();

                String resultado = comparador.compararNumero(primerNumero, segundoNumero);
                message.showMessage(resultado);

                message.showMessage("¿Desea continuar (y/n)?");
                String confirmacion = scanner.getString();

                if ("n".equalsIgnoreCase(confirmacion)) {
                    flag = false;
                }
                
            } catch (Exception e) {
                message.showMessage("Debe introducir un valor numérico");
            }

        }

    }

}
