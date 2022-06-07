package com.sofka.taller.interfaz;

public class Videogame implements IEntregable {
    
    private String title ="";
    private Integer estimateHours = 10;
    private Boolean delivered = false;
    private String gender = "";
    private String company = "";

    public Videogame() {
    }
    
    public Videogame(String title, Integer estimateHours) {
        this.title = title;
        this.estimateHours = estimateHours;

    }

    public Videogame(String title, Integer estimateHours, String gender, String company) {
        this.title = title;
        this.estimateHours = estimateHours;
        this.gender = gender;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEstimateHours() {
        return estimateHours;
    }

    public void setEstimateHours(Integer estimateHours) {
        this.estimateHours = estimateHours;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void delivery() {
        this.delivered = true;
    }

    @Override
    public void getBack() {
        this.delivered = false;
    }

    @Override
    public Boolean isDelivered() {
        if(this.delivered){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {

        String isdelivered = ((isDelivered())?"Si, el Videojuego se encuentra prestado":"Este videojuego se encuentra dispobible");
        
        return "Datos del video juego " + this.title 
            + "\nHoras estimadas: " + this.estimateHours 
            + "\nGenero: " + this.gender 
            + "\nCompañia: " + this.company 
            + "\n¿Está prestada?: " + isdelivered;
    }

    @Override
    public Boolean compare(Object object) {
        Videogame compareVideogame = (Videogame) object;

        if(this.estimateHours.compareTo(compareVideogame.getEstimateHours()) < 0)
        {
            return true;
        }

        return false;
    }


}
