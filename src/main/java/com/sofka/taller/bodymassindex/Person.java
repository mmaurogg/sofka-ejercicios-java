package com.sofka.taller.bodymassindex;

/**
 * Esta clase genera el objeto persona que contiene sus métodos
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class Person {
    private String name = "";
    private Integer age = 0;
    private String DNI;
    private Character sex = "H".charAt(0);
    private Double weight = 0.00;
    private Double height = 0.00;
    
    /**
     * Constructor que no recibe argumentos (toma valores por default)
     */
    public Person() {

        generateDNI();
    }

    /**
     * Constructor de la clase
     * @param name Nombre de la persona
     * @param age Edad de la persona
     * @param sex Sexo de la persona
     */
    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        
        checkSex( sex );

        generateDNI();
    }

    /**
     * Constructor de la clase
     * @param name Nombre de la persona
     * @param age Edad de la persona
     * @param sex Sexo de la persona
     * @param DNI Nímero de identificación de la persona
     * @param weight Peso de la persona
     * @param height Altura de la persona
     */
    public Person(String name, Integer age, String sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        generateDNI();
        checkSex( sex );
    }

    /**
     * Obtiene el Valor del Nombre
     * @return Nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Agrega el valor del nombre
     * @param name Nombre del paciente
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el Valor de la Edad
     * @return Edad de la persona
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Agrega el valor de la edad
     * @param age la edad de la persona
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Obtiene el Valor del DNI
     * @return DNI de la persona
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Obtiene el Sexo de la persona
     * @return Sexo de la persona
     */
    public Character getSex() {
        return sex;
    }

    /**
     * Agrega el sexo de la persona
     * @param sex
     */
    public void setSex(Character sex) {
        this.sex = sex;
    }

    /**
     * Obtiene el Valor del peso
     * @return peso de la persona
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Agrega el peso de la persona
     * @param weight peso de la persona
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * Obtiene el Valor de la altura
     * @return altura de la persona
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Agrega la altura de la persona
     * @param height altura de la persona
     */
    public void setHeight(Double height) {
        this.height = height;
    }
    
    /**
     * Entrega Uno de los siguientes tres valores:
     * <ul>
     *  <li>-1 El paciente esta bajo en su indice adecuado.</li>
     *  <li>0 El paciente esta en el indice adecuado.</li>
     *  <li>1 El paciente esta por encima del indice adecuado.</li>
     * </ul>
     * @return Indice que indica el estado del indice de masa corporal
     */
    public Integer IMBCompute(){

        final Integer LESS_WEIGHT = -1;
        final Integer ON_WEIGHT = 0;
        final Integer OVER_WEIGHT = 1;

        Double IMBIndex = this.weight/(height*height);
        
        if(IMBIndex < 20){
            return LESS_WEIGHT;
        } else if(IMBIndex > 25 ){
            return OVER_WEIGHT;
        } else {
            return ON_WEIGHT;
        }
    }

    /**
     * Método para coprobar si la persona es mayor de edad
     * @return true si es mayor de edad de lo contrario false
    */
    private Boolean legalAge(){
        
        final Integer LEGAL_AGE = 18;

        if(this.age < LEGAL_AGE){
            return false;
        }
        return true;
    }

    /**
     * Método para comprobar que el sexo ingresado es el de default, si no lo cambia
     * @param sex
    */
    public void checkSex( String sex ){
        if(sex.equalsIgnoreCase("M")){
            this.sex =  "M".charAt(0);
        }
    }

    /**
     * Método que genera un DNI aleatorio
     */
    private void generateDNI(){
        this.DNI = String.valueOf(Math.round(100000000*Math.random()));
    }

    /**
     * Método que muestra la información de la persona
     */
    public String toString() {
        
        String checkAge = (legalAge())?" Es mayor de edad":" Es menor de edad";
        String sexString = this.sex.toString();

        return "Datos del paciente:\nDNI: " + this.DNI
            + "\nName: " + this.name 
            + "\nEdad: " + this.age + checkAge 
            + "\nSexo: " + sexString 
            + "\nPeso: " + this.weight + "Kg" 
            + "\nAltura: " + this.height + " metros";
    }

}
