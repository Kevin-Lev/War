/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Levrone
 */

public enum Continente {
    AFRICA, AMERICA_DO_NORTE, AMERICA_DO_SUL, ASIA, EUROPA, OCEANIA;

    private List<Continente> continenteVizinhos = new ArrayList<>();

    public List<Continente> getContinenteVizinhos() {
        return continenteVizinhos;
    }

    public boolean saoVizinhos (Continente continente) {
        return !(this.continenteVizinhos.indexOf(continente) == -1);
    }

    private int numTerritorios;

    public void setNumTerritorios(int numTerritorios) {
        this.numTerritorios = numTerritorios;
    }

    public int getNumTerritorios() {
        return numTerritorios;
    }

}


