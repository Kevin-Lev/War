/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import java.util.Map;

/**
 *
 * @author kevin
 */
public class Mapa {
    private static Mapa instancia = new Mapa();

    public static Map<Continente, List<Territorio>> getMapa() {
        return instancia.mapa;
    }

    public static void setMapa(Map<Continente, List<Territorio>> mapa) {
        instancia.mapa = mapa;
    }

    private Map<Continente, List<Territorio>> mapa;
    
    public static void printaMapa(){
        Map<Continente, List<Territorio>> mapa = instancia.mapa;
        
        for (Continente continente: mapa.keySet()) {
            List<Territorio> territorios = mapa.get(continente);

            System.out.println("\nContinente: " + continente.name());
            for (Territorio territorio: territorios)
                System.out.println("Territorio[" + territorio.getNome() + "] : " + "[" + territorio.getCor() + "][T="
                                    + territorio.getExercitosTerrestre().size() + "][A=" + territorio.getExercitosAereo().size() + "]");

        }

    }

}
