package com.sofka.taller.bodymassindex;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase despliega un menú para uso de la clase
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class MenuIMB {

    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new MenuIMB()
     */
    public MenuIMB getInstance(){
        return new MenuIMB();
    }


    /**
     * Funcion que despiega el menú
     */
    public static void showMenu(){

        message.showMessage("Bienvenido a  su calculadora de Indice de Masa corporal");
        message.showMessage("Favor ingrese los siguientes datos");

        message.showMessage("Nombre: ");
        String name = scanner.getString();

        message.showMessage("Edad");
        Integer age = scanner.getInteger();

        message.showMessage("Sexo (H/M)");
        String sex = scanner.getString();

        message.showMessage("Peso en Kg: ");
        Double weight = scanner.getDouble();

        message.showMessage("Altura en metros (separado por .): ");
        Double height = scanner.getDouble();
        
        Person person = new Person(name, age, sex, weight, height);
        Person person1 = new Person(name, age, sex);
        Person person2 = new Person();
        
        message.showMessage("\n\nPrimer método: Todos los datos");
        message.showMessage("Datos del segundo método :\n" + person.toString());
        message.showMessage(messageIBM(person));

        message.showMessage("\n\nSegundo método: sin peso ni altura");
        message.showMessage("Datos del tercer metodo :\n" + person1.toString());
        message.showMessage(messageIBM(person1));

        message.showMessage("\n\nTercer método: constructor vacío y agregar datos por set");
        person2.setName(name);
        person2.setAge(age);
        person2.checkSex(sex);
        person2.setWeight(weight);
        person2.setHeight(height);
        message.showMessage("Sus datos son :\n" + person2.toString());
        message.showMessage(messageIBM(person2));
    }

    
    /**
     * Método que retorna mensaje segun el IMC de la persona
     * @param person Persona creada
     * @return mensaje que indica el estado del peso
     */
    private static String messageIBM( Person person){
        switch (person.IMBCompute()){
            case -1:
                return "Usted está por debajo del peso";
            case 0:
                return "Usted tiene el peso adecuado";
            case 1:
                return "Usted tiene sobrepeso";
            default:
                return "";
        }
    }
}
