package com.sofka.taller.electrodomestico;

/**
 * Esta clase genera el objeto lavadora
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class Televisor extends Appliance {
    private Integer resolution = 20;
    private Boolean syntonizatorTDT = false;

    /**
     * Método constructor
     */
    public Televisor() {
    }

    /**
     * Método constructor
     * @param basePrice prcio base del televisor
     * @param weight peso del televisor
     */
    public Televisor(Double basePrice, Double weight) {
        super(basePrice, weight);
    }

    /**
     * Método constructor
     * @param basePrice prcio base del televisor
     * @param color color del televisor
     * @param energyConsumption consumo de energia del televisor
     * @param weight peso del televisor
     * @param resolution resolución del televisor
     * @param syntonizatorTDT indica si el televisor cuenta con sintinizador TDT
     */
    public Televisor(Double basePrice, String color, String energyConsumption, Double weight, Integer resolution,
            Boolean syntonizatorTDT) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.syntonizatorTDT = syntonizatorTDT;
    }

    /**
     * Obtiene el valor de la resolución
     * @return el valor de la resolución
     */
    public Integer getResolution() {
        return resolution;
    }

    /**
     * indica si el televisor cuenta con un sintetizador TDT
     * @return booleano que indica indica si el televisor cuenta con un sintetizador TDT
     */
    public Boolean getSyntonizatorTDT() {
        return syntonizatorTDT;
    }

    @Override
    public Double finalPrice() {
        
        Double finalPrice = super.finalPrice();

        if( this.resolution > 40){
            finalPrice += finalPrice*0.30;
        } 

        if(syntonizatorTDT){
            finalPrice += 50;
        }

        return finalPrice;
    }

}
