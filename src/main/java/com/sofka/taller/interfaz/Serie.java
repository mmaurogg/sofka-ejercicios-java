package com.sofka.taller.interfaz;

public class Serie implements IEntregable {
    private String title = "";
    private Integer seasons = 3;
    private Boolean delivered = false;
    private String gender = "";
    private String creator = "";

    public Serie() {
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public Serie(String title, Integer seasons, String gender, String creator) {
        this.title = title;
        this.seasons = seasons;
        this.gender = gender;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

        String isdelivered = ((isDelivered())?"Si, la serie se encuentra prestada":"Esta serie se encuentra dispobible");
        
        return "Datos de la serie titulada " + this.title 
            + "\nTemporadas: " + this.seasons 
            + "\nGenero: " + this.gender 
            + "\nCreador: " + this.creator 
            + "\n¿Está prestada?: " + isdelivered;
    }

    @Override
    public Boolean compare(Object object) {
        Serie compareSerie = (Serie) object;

        if(this.seasons.compareTo(compareSerie.getSeasons()) < 0)
        {
            return true;
        } else {
            return false;
        }


    }
    

}
