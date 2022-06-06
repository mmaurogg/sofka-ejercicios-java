package com.sofka.taller.electrodomestico;

/**
 * Esta clase genera el objeto padre electródomestico
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class Appliance {

    private Double basePrice = 100.00;
    private String color = "White";
    private Character energyConsumption ="F".charAt(0);
    private Double weight = 5.00;
    
    public final static String[] arrLetterEnergyConsumption = {"A","B","C","D","E","F"};
    
    public final static String[] setColors = {"White","black","Red","Blue","Gray"};
    
    /**
     * Método constructor
     */
    public Appliance() {
    }

    /**
     * Método constructor
     * @param basePrice precio base del electrodomestico
     * @param weight peso del electrodomestico
     */
    public Appliance(Double basePrice, Double weight) {
        this.basePrice = basePrice;
        this.weight = weight;

    }
    /**
     * Método constructor
     * @param basePrice precio base del electrodomestico 
     * @param color color del electrodomestico
     * @param energyConsumption clasificación de consumo de energia del electrodomestico
     * @param weight peso del electrodomestico
     */
    public Appliance(Double basePrice, String color, String energyConsumption, Double weight) {
        this.basePrice = basePrice;
        this.color = color;
        this.energyConsumption = energyConsumption.charAt(0);
        this.weight = weight;

        checkColor(color);
        checkComsuption(energyConsumption);
    }

    /**
     * Obtiene el valor del precio base
     * @return el precio base
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * Obtiene el valor del color del electrodomestico
     * @return el color del electrodomestico
     */
    public String getColor() {
        return color;
    }

    /**
     * Retorna la clasificación segun el consumo energético
     * @return Clasificación del consumo energétido en String
     */
    public String getEnergyConsumption() {
        return energyConsumption.toString();
    }

    /**
     * Obtiene el valor del peso del electrodomestico
     * @return el peso del electrodomestico
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Valida si existe el código del electrodomestico introducido por el usuario y lo cambia si existe
     * @param consumption consumo del electródomestico a evaluar
     */
    private void checkComsuption( String consumption ){
                
        for (String code : arrLetterEnergyConsumption) {
            if(consumption.equalsIgnoreCase(code)){
                this.energyConsumption = code.charAt(0);
            }
        }
    }

    /**
     * Valida si el color del electródomestico introducido por susuario y lo cambia si existe
     * @param userColor color introducido por el usuario
     */
    private void checkColor( String userColor ){
        for (String indexColor : setColors) {
            if(indexColor.equalsIgnoreCase(userColor)){
                this.color = userColor;
            }
        }
    }

    /**
     * Calcula el valor del electrodomestico
     * @return El valor final del electrodomestico en double
     */
    public Double finalPrice(){
        return this.basePrice + addPriceEnergyConsumption() + addPriceWeight();
    }

    /**
     * Calcula el incremento por el consumo de energia del electrodomestico
     * @return el incremento por el consumo de energia del electrodomestico
     */
    private Double addPriceEnergyConsumption(){

        String codeConsumption = this.energyConsumption.toString();

        switch ( codeConsumption ){
            case "A":
                return 100.00;
            case "B":
                return 80.00;
            case "C":
                return 60.00;
            case "D":
                return 50.00;
            case"E":
                return 30.00;
            case "F":
                return 10.00;
            default:
                return 0.00;
        }

    }

    /**
     * Calcula el incremento por el peso del electrodomestico
     * @return el incremento por el peso del electrodomestico
     */
    private Double addPriceWeight() {
        
        if(this.weight <  19.00){
            return 10.00;
        } else if (this.weight <= 49.00){
            return 50.00;
        } else if (this.weight <= 79){
            return 80.00;
        } else {
            return 100.00;
        }

    }
}
