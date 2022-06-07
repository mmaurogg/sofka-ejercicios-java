package com.sofka.taller.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

public class MenuInterfaz {
        
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new MenuInterfaz()
     */
    public static MenuInterfaz getInstance() {
        return new MenuInterfaz();
    }

    public void showMenu(){
        
        Videogame[] videogames = rankingVideogames(generateVideogames());
        Serie[] series = rankingSeries(generateSeries());

        randomLend(series, videogames);

        message.showMessage("Bienvenido a la prueba del PRESTADOR");

        int response = 0;
        do {
            message.showMessage("\n1. Series prestadas y devolver\n2. Juegos prestados y devolver\n3. Duración series\n4. Duración Videojuegos\n5. prestar al azar\n6. Lista de series\n7. Lista de juegos\n0. Salir");

            response = scanner.getInteger();

            switch (response){
                case 1:
                message.showMessage("La cantidad de series prestada es: " + countSeriesBorrowed(series) + " y fueron devueltas");
                    break;
                case 2:
                message.showMessage("La cantidad de series prestada es: " + countVideogamesBorrowed(videogames) + " y fueron devueltos");
                    break;
                case 3:
                    message.showMessage("La serie mas larga es:\n" + series[0].toString());
                    break;
                case 4:
                    message.showMessage("El juego mas largo es "+ videogames[0].toString());
                    break;
                case 5:
                    randomLend(series, videogames);
                    break;
                case 6: 
                    for (Serie serie : series) {
                        message.showMessage(serie.toString());
                    }
                    break;
                case 7:
                    for (Videogame videogame : videogames) {
                        message.showMessage(videogame.toString());
                    }
                    break;
                default: 
                    message.showMessage("Opción no valida");
            }


        } while (response != 0);

    }

    /**
     * Método para organizar el array de videogames en orden descendente
     * @param videogames Array de videogames
     * @return Array de videogames en orden descendente
     */
    private Videogame[] rankingVideogames( Videogame[] videogames) {

        Videogame[] arrVideogames = videogames;
        
        for(int i = 0; i < arrVideogames.length - 1; i++)
        {
            for(int j = i+1; j < arrVideogames.length; j++)
            {
                if(arrVideogames[i].compare(arrVideogames[j]))
                {
                Videogame temp = arrVideogames[i];
                arrVideogames[i] = arrVideogames[j];
                arrVideogames[j] = temp;
                }
            }
        }
        return arrVideogames;

    }
    
    /**
     * Método para organizar el array de series en orden descendente
     * @param series Array de series
     * @return Array de series en orden descendente
     */
    private Serie[] rankingSeries( Serie[] series) {
        
        Serie[] arrSeries = series;
        
        for(int i = 0; i < arrSeries.length - 1; i++)
        {
            for(int j = i+1; j < arrSeries.length; j++)
            {
            if(arrSeries[i].compare(arrSeries[j]))
            {
                Serie temp = arrSeries[i];
                arrSeries[i] = arrSeries[j];
                arrSeries[j] = temp;
            }
        }
        }
        return arrSeries;

    }

    /**
     * Función que cuenta la cantidad de Series prestadas
     * @param series arreglo con series disponibles
     * @return cantidad de series prestadas
     */
    private Integer countSeriesBorrowed( Serie[] series ){

        Integer count = 0;
        for (Serie serie : series) {
            if(serie.isDelivered()){
                count++;
                serie.getBack();
            }
        }
        return count;
    }

    /**
     * Función que cuenta la cantidad de videogames prestadas
     * @param videogames arreglo con videogames disponibles
     * @return cantidad de videogames prestadas
     */
    private Integer countVideogamesBorrowed( Videogame[] videogames ){

        Integer count = 0;
        for (Videogame videogame : videogames) {
            if(videogame.isDelivered()){
                count++;
                videogame.getBack();
            }
        }
        return count;
    }

    /**
     * Funcion para llenar un arreglo de Video juegos
     * @return arreglo de Video juegos de 5 posiciones
     */
    private static Videogame[] generateVideogames() {
        Videogame[] videogames = new Videogame[5];

        String[] titles = {"God of War", "Brave fencer Musashi", "Need for Speed", "Metal Gear", "Halo"}; 
        String[] genders = {"Aventura", "Accion", "Epico", "Fantasia"};
        String[] companys = {"EAGames", "Sega", "Empresas ABC", "Independiente"};

        for (int i = 0; i < 5; i++) {
            Videogame videogame = new Videogame(titles[i], generRnd(20), genders[generRnd(3)], companys[generRnd(3)]);
            videogames[i] = videogame;
        }
        
        return videogames;
    }

    /**
     * Función para llenar un arreglo de series
     * @return arreglo de series de 5 posiciones
     */
    private static Serie[] generateSeries() {
        Serie[] series = new Serie[5];

        String[] titles = {"El arma mortal", "Cobra Kai", "Los Justicieros", "Demon Slayer", "Psico Pass", "Un show mas"}; 
        String[] genders = {"Drama", "Accion", "Comedia", "Fantasia"};
        String[] creators = {"Pedrito Coral", "Steven Spelver", "Empresas ABC", "Tarantino"};

        for (int i = 0; i < 5; i++) {
            Serie serie = new Serie(titles[i], generRnd(10), genders[generRnd(3)], creators[generRnd(3)]);
            series[i] = serie;
        }
        
        return series;
    }

    /**
     * Función que realiza prestamos al azar
     * @param series arreglo de series
     * @param videogames arreglo de videogames
     */
    private void randomLend (Serie[] series, Videogame[] videogames) {
        for (int i = 0; i < 5; i++) {
            series[generRnd(4)].delivery();
            videogames[generRnd(4)].delivery();
        }
    }

    /**
     * Función que genera un npumero aleatorio
     * @param range el tope del rango en el que se generará [0, range] 
     * @return numero aleatorio en el rango [0, range]
     */
    private static Integer generRnd(int range){
        return Integer.valueOf(String.valueOf(Math.round(Math.random()*range)));
    }



}
