package com.sofka.taller;

import com.sofka.taller.bodymassindex.MenuIMB;
import com.sofka.taller.cinematografica.UICinematografica;
import com.sofka.taller.circulo.UICirculo;
import com.sofka.taller.comparacionnumeros.UIComparador;
import com.sofka.taller.comparartexto.ComparadorTexto;
import com.sofka.taller.contadornumeros.ContadorFor;
import com.sofka.taller.contadornumeros.ContadorWhile;
import com.sofka.taller.contattexto.ContarTexto;
import com.sofka.taller.diasemana.DiaSemana;
import com.sofka.taller.electrodomestico.MenuAppliance;
import com.sofka.taller.eliminarespacio.EliminarEspacio;
import com.sofka.taller.fechaactual.FechaHora;
import com.sofka.taller.interfaz.MenuInterfaz;
import com.sofka.taller.mayorcero.MayorQueCero;
import com.sofka.taller.numamil.NumeroHAstaMil;
import com.sofka.taller.precioproducto.UIProducto;
import com.sofka.taller.remplazara.ReemplazarA;

public class App 
{
    public static void main( String[] args )
    {
        //UIComparador.menuComparadorNumeros();
        //UICirculo.menuCirculo();
        //UIProducto.menuProducto();
        //ContadorFor.contarNumeros();
        //ContadorWhile.contarNumeros();
        //MayorQueCero.getInstance().imprimirNumeroMayorQueCero();
        //DiaSemana.getInstance().comprobarDiaLaboral();
        //ReemplazarA.getInstance().cambiar();
        //EliminarEspacio.getInstance().quitarEspacio();
        //ContarTexto.getInstance().contatTexto();
        //ComparadorTexto.getInstance().compararTexto();
        //FechaHora.getInstance().fechaActual();
        //NumeroHAstaMil.getInstance().imprimirNumeros();
        //ICinematografica.getInstance().gestionCinema();
        //MenuIMB.showMenu();
        //MenuAppliance.showAplliance();
        MenuInterfaz.getInstance().showMenu();
    }
}
