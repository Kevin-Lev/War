/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import war.Aereo;
import war.Terrestre;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Levrone
 */
public class Territorio {

    private String nome;
    private String cor;
    private Continente conti;
    private List<Territorio> fronteiras;
    private List<Terrestre> exercitosTerrestre;
    private List<Aereo> exercitosAereo;

    public void addExercitoTerrestre(Terrestre ter) {
        this.exercitosTerrestre.add(ter);
    }

    public void addExercitoAereos(Aereo aer) {
        this.exercitosAereo.add(aer);
    }

    public void removeExercitoTerrestre() {
        if (!exercitosTerrestre.isEmpty())
            this.exercitosTerrestre.remove(0);
    }

    public void removeExercitoAereos() {
        if (!exercitosAereo.isEmpty())
            this.exercitosAereo.remove(0);
    }

    public List<Terrestre> getExercitosTerrestre() {
        return exercitosTerrestre;
    }

    public List<Aereo> getExercitosAereo() {
        return exercitosAereo;
    }

    public void setFronteiras(List<Territorio> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public Territorio() {
        this.fronteiras = new ArrayList<>();
        this.exercitosTerrestre = new ArrayList<>();
        this.exercitosAereo = new ArrayList<>();
    }

    public Territorio(String nome , String cor, Continente conti){
        this.nome = nome;
        this.cor  = cor;
        this.conti = conti;
        this.fronteiras = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public Continente getContinente(){
        return this.conti;
    }

    public void setContinente(Continente conti){
        this.conti = conti;
    }

    public List<Territorio> getFronteiras(){
        return fronteiras;
    }

    public void addFronteira(Territorio t){ // recebe tipo territorio
        this.fronteiras.add(t);
    }
    
}
