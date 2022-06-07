package com.sofka.taller.electrodomestico;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase genera el objeto padre electródomestico
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class MenuAppliance {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new MenuAppliance()
     */
    public MenuAppliance getInstance() {
        return new MenuAppliance();
    }
    
    /**
     * Funcion que despliega el menú de prueba el cual tiene información precargada que genera objetos de las clases electrodomestico
     */
    public static void showAplliance() {

        Appliance[] appliances = generateAppliances();

        Double totalPriceAppliance = 0.00;
        Double totalPriceTelevisor = 0.00;
        Double totalPriceWashinMachine = 0.00;

        for (Appliance appliance : appliances) {

            if(appliance instanceof Televisor){
                totalPriceTelevisor += appliance.finalPrice();
            }

            if(appliance instanceof washingMachine){
                totalPriceWashinMachine += appliance.finalPrice();
            }

            totalPriceAppliance += appliance.finalPrice();
        }

        message.showMessage("El precio total de los electrodomesticos es: " + totalPriceAppliance);

        message.showMessage("El precio total de las lavadoras es : " + totalPriceWashinMachine);
        
        message.showMessage("El precio total de los televisores es: " + totalPriceTelevisor);
        }

    /**
     * Función que genera un npumero aleatorio
     * @param range el tope del rango en el que se generará [0, range] 
     * @return numero aleatorio en el rango [0, range]
     */
    private static Integer generateRound(int range){
        return Integer.valueOf(String.valueOf(Math.round(Math.random()*range)));
    }

    /**
     * Funcion para llenar un arreglo de electrodomesticos
     * @return arreglo de electrodomesticos de 10 posiciones
     */
    private static Appliance[] generateAppliances() {

        Appliance[] appliances = new Appliance[10];

        Double basePrice = Double.valueOf(generateRound(200));
        String color = Appliance.setColors[generateRound(4)];
        String energyConsumption = Appliance.arrLetterEnergyConsumption[generateRound(5)];
        Double weight = Double.valueOf(generateRound(100));
        int resolution = generateRound(80);
        Boolean syntonizatorTDT = Boolean.valueOf(String.valueOf(generateRound(1)));
        Double charge = Double.valueOf(generateRound(60));


        Appliance appliance1 = new Appliance(basePrice, color, energyConsumption, weight);
        appliances[0] = appliance1;
        Appliance televisor1 = new Televisor(basePrice, color, energyConsumption, weight, resolution, syntonizatorTDT); 
        appliances[1] = televisor1;
        Appliance washingMachine1 = new washingMachine(basePrice, color, energyConsumption, weight, charge);
        appliances[2] = washingMachine1; 

        Appliance appliance2 = new Appliance(basePrice, color, energyConsumption, weight);
        appliances[3] = appliance2;
        Appliance televisor2 = new Televisor(basePrice, color, energyConsumption, weight, resolution, syntonizatorTDT); 
        appliances[4] = televisor2;
        Appliance washingMachine2 = new washingMachine(basePrice, color, energyConsumption, weight, charge);
        appliances[5] = washingMachine2; 

        Appliance appliance3 = new Appliance(basePrice, color, energyConsumption, weight);
        appliances[6] = appliance3;
        Appliance televisor3 = new Televisor(basePrice, color, energyConsumption, weight, resolution, syntonizatorTDT); 
        appliances[7] = televisor3;
        Appliance washingMachine3 = new washingMachine(basePrice, color, energyConsumption, weight, charge);
        appliances[8] = washingMachine3; 

        Appliance televisor4 = new Televisor(basePrice, color, energyConsumption, weight, resolution, syntonizatorTDT); 
        appliances[9] = televisor4; 

        return appliances;

    }

}
