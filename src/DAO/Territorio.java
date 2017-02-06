/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Continente.continentes;
import java.util.ArrayList;
import java.util.List;
import war.Aereo;
import war.Terrestre;

/**
 *
 * @author Kevin Levrone
 */
public class Territorio {
    
    private String nome;
    private String cor;
    private continentes conti;
    private List<Territorio> listafronteira;
    private List<Terrestre> listaterrestre;
    private List<Aereo> listaaereos;
    
    public void setTerrestre(Terrestre ter) {
        this.listaterrestre.add(ter);
    }

    public void setAereos(Aereo aer) {
        this.listaaereos.add(aer);
    }

    public List<Terrestre> getListaterrestre() {
        return listaterrestre;
    }

    public List<Aereo> getListaaereos() {
        return listaaereos;
    }

    public void setListafronteira(List<Territorio> listafronteira) {
        this.listafronteira = listafronteira;
    }

    public List<Territorio> getListafronteira() {
        return listafronteira;
    }
    
    public Territorio() {
        this.listafronteira = new ArrayList<>();
        this.listaterrestre = new ArrayList<>();
        this.listaaereos = new ArrayList<>();
    }

    public Territorio(String nome , String cor, continentes conti){
        this.nome = nome;
        this.cor  = cor;
        this.conti = conti;
        this.listafronteira = new ArrayList<>();
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
    
    public continentes getContinente(){
        return this.conti;
    }
    
    public void setContinente(continentes conti){
        this.conti = conti;
    }
    
    public List<Territorio> getFronteira(){
        return listafronteira;
    }
    
    public void setFronteira(Territorio t){ // recebe tipo territorio
       this.listafronteira.add(t);
    }
    
    
}
