package com.sofka.taller.circulo;

/**
 * Esta clase crea un objeto círculo
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class Circulo {

    private Double radio;
    private final Double NUMERO_PI = Math.PI;
    private Double area;

    /**
     * Método constructor para crear un circulo por defecto de radio entre 0 y 10
     * unidades de medida
     */
    public Circulo() {
        this.radio = Math.random() * 10;
        calcularArea();
    }

    /**
     * Método constructor para crear un circulo con un radio definido por el
     * parámetro
     * 
     * @param radio es el radio que tendrá el circulo
     */
    public Circulo(Double radio) {
        this.radio = radio;
        calcularArea();
    }

    /**
     * Método que devuelve el área del circulo
     * 
     * @return la medida del área del círculo
     */
    public Double getArea() {
        return area;
    }

    /**
     * Método que devuelve el radio del circulo
     * 
     * @return la medida del radio
     */
    public Double getRadio() {
        return radio;
    }

    /**
     * Nétodo para establecer el valor del radio
     * 
     * @param radio
     */
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    /**
     * Método que calcula el área del circulo
     */
    private void calcularArea() {
        this.area = (NUMERO_PI * Math.pow(radio, 2));
    }

}
