package com.sofka.taller.electrodomestico;

/**
 * Esta clase genera el objeto lavadora
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class washingMachine extends Appliance {
    private Double charge = 5.00;

    /**
     * Método constructor
     */
    public washingMachine() {
    }

    /**
     * Método constructor
     * @param basePrice prcio base de la lavadora
     * @param weight peso de la lavadora
     */
    public washingMachine(Double basePrice, Double weight) {
        super(basePrice, weight);       

    }

    /**
     * Método constructor 
     * @param basePrice prcio base de la lavadora
     * @param color color de la lavadora
     * @param energyConsumption consumo de energia de la lavadora
     * @param weight peso de la lavadora
     * @param charge carga que aguanta la lavadora
     */
    public washingMachine(Double basePrice, String color, String energyConsumption, Double weight, Double charge) {
        super(basePrice, color, energyConsumption, weight);
        this.charge = charge;
    }

    /**
     * Obtiene el valor de la carga que aguanta la lavadora
     * @returnla El valor de la carga que aguanta la lavadora
     */
    public Double getCharge() {
        return charge;
    }

    @Override
    public Double finalPrice() {
        Double finalPrice = super.finalPrice();

        if( this.charge > 30.00){
            finalPrice += 50.00;
        } 

        return finalPrice;
    }



}
